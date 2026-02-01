package net.nicneo.instrumenta_brundisii.entity.client;

import net.nicneo.instrumenta_brundisii.entity.custom.CommonTailedEntity;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;


public class CommonTailedRenderer extends MobRenderer<CommonTailedEntity, CommonTailedRenderState, CommonTailedModel> {
    private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath(instrumentaBrundisii.MOD_ID, "textures/entity/common_tailed.png");

    public CommonTailedRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CommonTailedModel(pContext.bakeLayer(ModModelLayers.COMMON_TAILED_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTextureLocation(CommonTailedRenderState state) {
        return TEXTURE;
    }

    @Override
    public CommonTailedRenderState createRenderState() {
        return new CommonTailedRenderState();
    }

    @Override
    public void extractRenderState(CommonTailedEntity entity, CommonTailedRenderState state, float partialTick) {
        super.extractRenderState(entity, state, partialTick);
        state.verticalVelocity = (float) entity.getDeltaMovement().y;
    }
}
