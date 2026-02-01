package net.nicneo.instrumenta_brundisii.util;

import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
//  This is the class to register custom block tags
    public static class Blocks {
//        This is a sample of a block tag, I will leave this empty as it is not needed right now.
//        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");

//        This is the helper for the class to add block tags
        private static TagKey<Block> tag(String name){
            return BlockTags.create(Identifier.fromNamespaceAndPath(instrumentaBrundisii.MOD_ID, name));
        }
    }


//  This is The class to register custom item tags
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(instrumentaBrundisii.MOD_ID, name));
        }
    }
}
