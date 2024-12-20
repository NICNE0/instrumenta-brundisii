package net.nicneo.instrumenta_brundisii.util;

import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType QUARTZ = WoodType.register(new WoodType(instrumentaBrundisii.MOD_ID + ":quartz", BlockSetType.STONE));
}
