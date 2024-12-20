package net.nicneo.instrumenta_brundisii.entity;

import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.entity.custom.CommonTailedEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<EntityType<CommonTailedEntity>> COMMON_TAILED =
            ENTITY_TYPES.register("common_tailed", () -> EntityType.Builder.of(CommonTailedEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.8f).build("common_tailed"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
