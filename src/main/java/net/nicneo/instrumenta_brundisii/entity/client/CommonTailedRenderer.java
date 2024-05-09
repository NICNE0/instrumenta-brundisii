package net.nicneo.instrumenta_brundisii.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.nicneo.instrumenta_brundisii.entity.custom.CommonTailedEntity;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class CommonTailedRenderer extends MobRenderer<CommonTailedEntity, CommonTailedModel<CommonTailedEntity>> {
    public CommonTailedRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CommonTailedModel<>(pContext.bakeLayer(ModModelLayers.COMMON_TAILED_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CommonTailedEntity pEntity) {
        return new ResourceLocation(instrumentaBrundisii.MOD_ID, "textures/entity/common_tailed.png");
    }

    @Override
    public void render(CommonTailedEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
