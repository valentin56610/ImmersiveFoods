package com.github.epiicthundercat.immersivefoods.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodValues {

    public static final FoodProperties RAW_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties CARROT_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(7.2f).build();

    public static final FoodProperties POTATO_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(7.2f).build();

    public static final FoodProperties COOKED_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(5.8f).meat().build();
    public static final FoodProperties RAW_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(1.8f).meat().build();
    public static final FoodProperties RAW_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 0.3f).meat().build();
    public static final FoodProperties COOKED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.8f).meat().build();
    public static final FoodProperties COOKED_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).meat().build();
    public static final FoodProperties RAW_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(12.8f).effect(new MobEffectInstance(MobEffects.WITHER, 300, 0), 0.3f).meat().build();
    public static final FoodProperties COOKED_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(20).saturationMod(20.8f).meat().build();
    public static final FoodProperties FILLETED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(6.8f).build();




}
