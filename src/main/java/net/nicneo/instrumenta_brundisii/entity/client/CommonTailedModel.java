package net.nicneo.instrumenta_brundisii.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class CommonTailedModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart common_tailed;
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_wing;
	private final ModelPart left_wing;
	private final ModelPart bill;

	public CommonTailedModel(ModelPart root) {
		this.common_tailed = root.getChild("common_tailed");
		this.head = common_tailed.getChild("head");
		this.right_leg = common_tailed.getChild("right_leg");
		this.left_leg = common_tailed.getChild("left_leg");
		this.right_wing = common_tailed.getChild("right_wing");
		this.left_wing = common_tailed.getChild("left_wing");
		this.bill = common_tailed.getChild("bill");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition common_tailed = partdefinition.addOrReplaceChild("common_tailed", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = common_tailed.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(47, 2).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.375F, 0.325F, 0.288F, 0.0F, 0.0F));

		PartDefinition chin = common_tailed.addOrReplaceChild("chin", CubeListBuilder.create().texOffs(14, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.0F));

		PartDefinition bill = common_tailed.addOrReplaceChild("bill", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0F, -7.0F, -6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.0F));

		PartDefinition body = common_tailed.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_leg = common_tailed.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -5.0F, 1.0F));

		PartDefinition left_leg = common_tailed.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -5.0F, 1.0F));

		PartDefinition right_wing = common_tailed.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(24, 13).addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -11.0F, 0.0F));

		PartDefinition left_wing = common_tailed.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(24, 13).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -11.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Feet movement (Walking/Running)
		this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

		// Head turning (Looking at player)
		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F); // Yaw (side to side)
		this.head.xRot = headPitch * ((float) Math.PI / 180F);  // Pitch (up and down)

		// Ensure the beak follows the head's rotation
		this.bill.yRot = this.head.yRot;
		this.bill.xRot = this.head.xRot;

		// Wing movement (Flapping while jumping or falling)
		double verticalVelocity = entity.getDeltaMovement().y;
		if (verticalVelocity > 0.1 || verticalVelocity < -0.1) { // Flap wings only during significant vertical motion
			this.right_wing.zRot = Mth.cos(ageInTicks * 2.0F) * (float) Math.PI * 0.25F;
			this.left_wing.zRot = -this.right_wing.zRot;
		} else {
			this.right_wing.zRot = 0.0F;
			this.left_wing.zRot = 0.0F;
		}
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		common_tailed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return common_tailed;
	}
}