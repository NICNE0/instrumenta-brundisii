package net.nicneo.instrumenta_brundisii.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

public class ModModelLayers {
    public static final ModelLayerLocation COMMON_TAILED_LAYER = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(instrumentaBrundisii.MOD_ID, "common_tailed_layer"), "main");
}
