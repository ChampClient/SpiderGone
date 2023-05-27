package com.htes.spidersgone.mixins;


import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SpiderModel.class)
public abstract class SpiderModelMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public static LayerDefinition createSpiderBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        int i = 15;
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -3.0F));
        partdefinition.addOrReplaceChild("body0", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), PartPose.offset(0.0F, 15.0F, 0.0F));
        partdefinition.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 9.0F));
        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
        CubeListBuilder cubelistbuilder1 = CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
        partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-4.0F, 15.0F, 2.0F));
        partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(4.0F, 15.0F, 2.0F));
        partdefinition.addOrReplaceChild("right_middle_hind_leg", CubeListBuilder.create(), PartPose.offset(-4.0F, 15.0F, 1.0F));
        partdefinition.addOrReplaceChild("left_middle_hind_leg", CubeListBuilder.create(), PartPose.offset(4.0F, 15.0F, 1.0F));
        partdefinition.addOrReplaceChild("right_middle_front_leg", CubeListBuilder.create(), PartPose.offset(-4.0F, 15.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_middle_front_leg", CubeListBuilder.create(), PartPose.offset(4.0F, 15.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-4.0F, 15.0F, -1.0F));
        partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(4.0F, 15.0F, -1.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

}


