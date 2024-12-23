package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, instrumentaBrundisii.MOD_ID, existingFileHelper);
    }

//  Here you generate tags by listing them in the following method, by doing so
//  the correspondant json file will be created in the resources/data/minecraft/tags directory for items and blocks as needed,
//  as well as tags for tools needed for harvesting the item, type of block, etc. See the samples below:
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.PLASTER_BLOCK.get(),
                        ModBlocks.RED_PLASTER_BLOCK.get(),
                        ModBlocks.SCARLET_PLASTER_BLOCK.get(),
                        ModBlocks.BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.DARK_BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.YELLOW_PLASTER_BLOCK.get(),
                        ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get(),
                        ModBlocks.GREEN_PLASTER_BLOCK.get(),
                        ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.PLASTER_BLOCK.get(),
                        ModBlocks.RED_PLASTER_BLOCK.get(),
                        ModBlocks.SCARLET_PLASTER_BLOCK.get(),
                        ModBlocks.BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.DARK_BLUE_PLASTER_BLOCK.get(),
                        ModBlocks.YELLOW_PLASTER_BLOCK.get(),
                        ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get(),
                        ModBlocks.GREEN_PLASTER_BLOCK.get(),
                        ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()
                );

        this.tag(BlockTags.FENCES)
                .add(
                        ModBlocks.PLASTER_FENCE.get(),
                        ModBlocks.BLUE_PLASTER_FENCE.get(),
                        ModBlocks.DARK_BLUE_PLASTER_FENCE.get(),
                        ModBlocks.LIGHT_BLUE_PLASTER_FENCE.get(),
                        ModBlocks.GREEN_PLASTER_FENCE.get(),
                        ModBlocks.DARK_GREEN_PLASTER_FENCE.get(),
                        ModBlocks.RED_PLASTER_FENCE.get(),
                        ModBlocks.SCARLET_PLASTER_FENCE.get(),
                        ModBlocks.YELLOW_PLASTER_FENCE.get(),
                        ModBlocks.LIGHT_YELLOW_PLASTER_FENCE.get(),
                        ModBlocks.LIMESTONE_FENCE.get(),
                        ModBlocks.TUFF_FENCE.get(),

                        ModBlocks.TERRACOTTA_FENCE.get(),
                        ModBlocks.WHITE_TERRACOTTA_FENCE.get(),
                        ModBlocks.ORANGE_TERRACOTTA_FENCE.get(),
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get(),
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get(),
                        ModBlocks.RED_TERRACOTTA_FENCE.get(),
                        ModBlocks.BLACK_TERRACOTTA_FENCE.get()
                );

        this.tag(BlockTags.FENCE_GATES)
                .add(
                        ModBlocks.PLASTER_FENCE_DOOR.get(),
                        ModBlocks.BLUE_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.GREEN_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.RED_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.SCARLET_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.YELLOW_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR.get(),
                        ModBlocks.LIMESTONE_FENCE_DOOR.get(),
                        ModBlocks.TUFF_FENCE_DOOR.get(),

                        ModBlocks.TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.WHITE_TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.ORANGE_TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.RED_TERRACOTTA_FENCE_DOOR.get(),
                        ModBlocks.BLACK_TERRACOTTA_FENCE_DOOR.get()
                );

        this.tag(BlockTags.WALLS)
                .add(
                        ModBlocks.PLASTER_WALL.get(),
                        ModBlocks.BLUE_PLASTER_WALL.get(),
                        ModBlocks.DARK_BLUE_PLASTER_WALL.get(),
                        ModBlocks.LIGHT_BLUE_PLASTER_WALL.get(),
                        ModBlocks.GREEN_PLASTER_WALL.get(),
                        ModBlocks.DARK_GREEN_PLASTER_WALL.get(),
                        ModBlocks.RED_PLASTER_WALL.get(),
                        ModBlocks.SCARLET_PLASTER_WALL.get(),
                        ModBlocks.YELLOW_PLASTER_WALL.get(),
                        ModBlocks.LIGHT_YELLOW_PLASTER_WALL.get(),
                        ModBlocks.LIMESTONE_WALL.get(),
                        ModBlocks.TUFF_WALL.get(),
                        ModBlocks.SMOOTH_SANDSTONE_WALL.get(),
                        ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),

                        ModBlocks.TERRACOTTA_WALL.get(),
                        ModBlocks.WHITE_TERRACOTTA_WALL.get(),
                        ModBlocks.ORANGE_TERRACOTTA_WALL.get(),
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(),
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(),
                        ModBlocks.RED_TERRACOTTA_WALL.get(),
                        ModBlocks.BLACK_TERRACOTTA_WALL.get()
                );

//        this.tag(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get());

//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

//
//        this.tag(BlockTags.LOGS_THAT_BURN)
//                .add(ModBlocks.PINE_LOG.get())
//                .add(ModBlocks.PINE_WOOD.get())
//                .add(ModBlocks.STRIPPED_PINE_LOG.get())
//                .add(ModBlocks.STRIPPED_PINE_WOOD.get());

//        this.tag(BlockTags.PLANKS)
//                .add(ModBlocks.PINE_PLANKS.get());

    }

}
