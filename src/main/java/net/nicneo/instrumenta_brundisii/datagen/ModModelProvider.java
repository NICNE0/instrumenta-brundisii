package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.ModelProvider.BlockStateGeneratorCollector;
import net.minecraft.client.data.models.ModelProvider.ItemInfoCollector;
import net.minecraft.client.data.models.ModelProvider.SimpleModelCollector;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected Stream<Block> getKnownBlocks() {
        return Stream.empty();
    }

    @Override
    protected Stream<Item> getKnownItems() {
        return Stream.empty();
    }

    @Override
    protected BlockModelGenerators getBlockModelGenerators(BlockStateGeneratorCollector blockStateOutput, ItemInfoCollector itemInfoOutput, SimpleModelCollector modelOutput) {
        return new BlockModelGenerators(blockStateOutput, itemInfoOutput, modelOutput);
    }

    @Override
    protected ItemModelGenerators getItemModelGenerators(ItemInfoCollector itemInfoOutput, SimpleModelCollector modelOutput) {
        return new ItemModelGenerators(itemInfoOutput, modelOutput);
    }
}
