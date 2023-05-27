package com.htes.spidersgone.mixins;

import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Spider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SpiderRenderer.class)
public class SpiderRendererMixin extends MobRenderer<Spider, SpiderModel<Spider>> {
    @Shadow
    private static final ResourceLocation SPIDER_LOCATION = new ResourceLocation("textures/entity/spider/spider.png");

    public SpiderRendererMixin(EntityRendererProvider.Context context, ModelLayerLocation layerLocation) {
        super(context, new SpiderModel<>(context.bakeLayer(layerLocation)), 0.8F);
    }

    /**
     * @author htesdev
     * @reason changed the texture
     */
    @Overwrite
    public ResourceLocation getTextureLocation(Spider spider) {
        return new ResourceLocation("assets/spider/spider.png");
    }
}
