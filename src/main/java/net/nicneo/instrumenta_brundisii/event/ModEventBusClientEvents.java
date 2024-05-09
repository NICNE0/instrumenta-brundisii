package net.nicneo.instrumenta_brundisii.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.nicneo.instrumenta_brundisii.entity.client.CommonTailedModel;
import net.nicneo.instrumenta_brundisii.entity.client.ModModelLayers;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.COMMON_TAILED_LAYER, CommonTailedModel::createBodyLayer);
    }
}
