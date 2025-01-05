package net.nicneo.instrumenta_brundisii.block.entity;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.QUARTZ_SIGN.get(), ModBlocks.QUARTZ_WALL_SIGN.get(),
                            ModBlocks.ANDESITE_SIGN.get(), ModBlocks.ANDESITE_WALL_SIGN.get(),
                            ModBlocks.DIORITE_SIGN.get(), ModBlocks.DIORITE_WALL_SIGN.get(),
                            ModBlocks.GRANITE_SIGN.get(), ModBlocks.GRANITE_WALL_SIGN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.QUARTZ_HANGING_SIGN.get(), ModBlocks.QUARTZ_WALL_HANGING_SIGN.get(),
                            ModBlocks.ANDESITE_HANGING_SIGN.get(), ModBlocks.ANDESITE_WALL_HANGING_SIGN.get(),
                            ModBlocks.DIORITE_HANGING_SIGN.get(), ModBlocks.DIORITE_WALL_HANGING_SIGN.get(),
                            ModBlocks.GRANITE_HANGING_SIGN.get(), ModBlocks.GRANITE_WALL_HANGING_SIGN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<SimpleLargeQuartzColumnBlockEntity>> SIMPLE_LARGE_QUARTZ_COLUMN =
            BLOCK_ENTITIES.register("simple_large_quartz_column", () ->
                    BlockEntityType.Builder.of(SimpleLargeQuartzColumnBlockEntity::new,
                            ModBlocks.SIMPLE_LARGE_QUARTZ_COLUMN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<QuartzLargeDoricColumnBlockEntity>> QUARTZ_LARGE_DORIC_COLUMN =
            BLOCK_ENTITIES.register("quartz_large_doric_column", () ->
                    BlockEntityType.Builder.of(QuartzLargeDoricColumnBlockEntity::new,
                            ModBlocks.QUARTZ_LARGE_DORIC_COLUMN.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<QuartzLargeDoricCapitalBlockEntity>> QUARTZ_LARGE_DORIC_CAPITAL =
            BLOCK_ENTITIES.register("quartz_large_doric_capital", () ->
                    BlockEntityType.Builder.of(QuartzLargeDoricCapitalBlockEntity::new,
                            ModBlocks.QUARTZ_LARGE_DORIC_CAPITAL.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<QuartzLargeDoricBaseBlockEntity>> QUARTZ_LARGE_DORIC_BASE =
            BLOCK_ENTITIES.register("quartz_large_doric_base", () ->
                    BlockEntityType.Builder.of(QuartzLargeDoricBaseBlockEntity::new,
                            ModBlocks.QUARTZ_LARGE_DORIC_BASE.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<TuffLargeDoricColumnBlockEntity>> TUFF_LARGE_DORIC_COLUMN =
            BLOCK_ENTITIES.register("tuff_large_doric_column", () ->
                    BlockEntityType.Builder.of(TuffLargeDoricColumnBlockEntity::new,
                            ModBlocks.TUFF_LARGE_DORIC_COLUMN.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<TuffLargeDoricCapitalBlockEntity>> TUFF_LARGE_DORIC_CAPITAL =
            BLOCK_ENTITIES.register("tuff_large_doric_capital", () ->
                    BlockEntityType.Builder.of(TuffLargeDoricCapitalBlockEntity::new,
                            ModBlocks.TUFF_LARGE_DORIC_CAPITAL.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<TuffLargeDoricBaseBlockEntity>> TUFF_LARGE_DORIC_BASE =
            BLOCK_ENTITIES.register("tuff_large_doric_base", () ->
                    BlockEntityType.Builder.of(TuffLargeDoricBaseBlockEntity::new,
                            ModBlocks.TUFF_LARGE_DORIC_BASE.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<GraniteLargeDoricColumnBlockEntity>> GRANITE_LARGE_DORIC_COLUMN =
            BLOCK_ENTITIES.register("granite_large_doric_column", () ->
                    BlockEntityType.Builder.of(GraniteLargeDoricColumnBlockEntity::new,
                            ModBlocks.GRANITE_LARGE_DORIC_COLUMN.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<GraniteLargeDoricCapitalBlockEntity>> GRANITE_LARGE_DORIC_CAPITAL =
            BLOCK_ENTITIES.register("granite_large_doric_capital", () ->
                    BlockEntityType.Builder.of(GraniteLargeDoricCapitalBlockEntity::new,
                            ModBlocks.GRANITE_LARGE_DORIC_CAPITAL.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<GraniteLargeDoricBaseBlockEntity>> GRANITE_LARGE_DORIC_BASE =
            BLOCK_ENTITIES.register("granite_large_doric_base", () ->
                    BlockEntityType.Builder.of(GraniteLargeDoricBaseBlockEntity::new,
                            ModBlocks.GRANITE_LARGE_DORIC_BASE.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<AndesiteLargeDoricColumnBlockEntity>> ANDESITE_LARGE_DORIC_COLUMN =
            BLOCK_ENTITIES.register("andesite_large_doric_column", () ->
                    BlockEntityType.Builder.of(AndesiteLargeDoricColumnBlockEntity::new,
                            ModBlocks.ANDESITE_LARGE_DORIC_COLUMN.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<AndesiteLargeDoricCapitalBlockEntity>> ANDESITE_LARGE_DORIC_CAPITAL =
            BLOCK_ENTITIES.register("andesite_large_doric_capital", () ->
                    BlockEntityType.Builder.of(AndesiteLargeDoricCapitalBlockEntity::new,
                            ModBlocks.ANDESITE_LARGE_DORIC_CAPITAL.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<AndesiteLargeDoricBaseBlockEntity>> ANDESITE_LARGE_DORIC_BASE =
            BLOCK_ENTITIES.register("andesite_large_doric_base", () ->
                    BlockEntityType.Builder.of(AndesiteLargeDoricBaseBlockEntity::new,
                            ModBlocks.ANDESITE_LARGE_DORIC_BASE.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<DioriteLargeDoricColumnBlockEntity>> DIORITE_LARGE_DORIC_COLUMN =
            BLOCK_ENTITIES.register("diorite_large_doric_column", () ->
                    BlockEntityType.Builder.of(DioriteLargeDoricColumnBlockEntity::new,
                            ModBlocks.DIORITE_LARGE_DORIC_COLUMN.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<DioriteLargeDoricCapitalBlockEntity>> DIORITE_LARGE_DORIC_CAPITAL =
            BLOCK_ENTITIES.register("diorite_large_doric_capital", () ->
                    BlockEntityType.Builder.of(DioriteLargeDoricCapitalBlockEntity::new,
                            ModBlocks.DIORITE_LARGE_DORIC_CAPITAL.get()
                    ).build(null));
    public static final RegistryObject<BlockEntityType<DioriteLargeDoricBaseBlockEntity>> DIORITE_LARGE_DORIC_BASE =
            BLOCK_ENTITIES.register("diorite_large_doric_base", () ->
                    BlockEntityType.Builder.of(DioriteLargeDoricBaseBlockEntity::new,
                            ModBlocks.DIORITE_LARGE_DORIC_BASE.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}