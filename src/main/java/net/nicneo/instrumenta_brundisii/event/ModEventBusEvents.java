package net.nicneo.instrumenta_brundisii.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.entity.custom.CommonTailedEntity;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.COMMON_TAILED.get(), CommonTailedEntity.createAttributes().build());
    }
}
