package net.nicneo.instrumenta_brundisii.sound;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<SoundEvent> COMMON_TAILED_AMBIENT = registerSoundEvents("common_tailed_ambient");
    public static final RegistryObject<SoundEvent> COMMON_TAILED_HURT = registerSoundEvents("common_tailed_hurt");
    public static final RegistryObject<SoundEvent> COMMON_TAILED_DEATH = registerSoundEvents("common_tailed_death");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(instrumentaBrundisii.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
