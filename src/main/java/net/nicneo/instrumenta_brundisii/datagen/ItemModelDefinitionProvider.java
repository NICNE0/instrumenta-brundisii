package net.nicneo.instrumenta_brundisii.datagen;

import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

public class ItemModelDefinitionProvider implements DataProvider {
    private final PackOutput output;
    private final String modId;
    private final Path projectRoot;

    public ItemModelDefinitionProvider(PackOutput output, String modId) {
        this.output = output;
        this.modId = modId;
        Path outputRoot = output.getOutputFolder().toAbsolutePath();
        Path candidate = outputRoot.getParent();
        if (candidate != null) {
            candidate = candidate.getParent();
        }
        if (candidate != null) {
            candidate = candidate.getParent();
        }
        this.projectRoot = candidate != null ? candidate : Path.of(System.getProperty("user.dir"));
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        Set<String> modelNames = new TreeSet<>();
        collectModelNames(modelNames, projectRoot.resolve("src/main/resources/assets").resolve(modId).resolve("models/item"));
        collectModelNames(modelNames, projectRoot.resolve("src/generated/resources/assets").resolve(modId).resolve("models/item"));

        List<CompletableFuture<?>> futures = new ArrayList<>();
        for (String name : modelNames) {
            JsonObject root = new JsonObject();
            JsonObject model = new JsonObject();
            model.addProperty("type", "minecraft:model");
            model.addProperty("model", modId + ":item/" + name);
            root.add("model", model);

            Path outPath = output.getOutputFolder()
                .resolve("assets")
                .resolve(modId)
                .resolve("items")
                .resolve(name + ".json");
            futures.add(DataProvider.saveStable(cachedOutput, root, outPath));
        }

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return modId + " item model definitions";
    }

    private static void collectModelNames(Set<String> out, Path modelDir) {
        if (!Files.isDirectory(modelDir)) {
            return;
        }
        try {
            Files.list(modelDir)
                .filter(path -> path.getFileName().toString().endsWith(".json"))
                .forEach(path -> out.add(stripJson(path.getFileName().toString())));
        } catch (IOException ignored) {
            // Best-effort: if directory can't be read, skip it.
        }
    }

    private static String stripJson(String filename) {
        int idx = filename.lastIndexOf('.');
        return idx > 0 ? filename.substring(0, idx) : filename;
    }
}
