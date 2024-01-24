package com.github.epiicthundercat.immersivefoods.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodValues {

    public static final FoodProperties RAW_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties CARROT_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.6f).build();

    public static final FoodProperties POTATO_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.6f).build();

    public static final FoodProperties COOKED_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2f).meat().build();
    public static final FoodProperties COOKED_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.1f).meat().build();
    public static final FoodProperties RAW_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 0.3f).meat().build();
    public static final FoodProperties COOKED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).meat().build();
    public static final FoodProperties RAW_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(3.0f).effect(() -> new MobEffectInstance(MobEffects.WITHER, 300, 0), 0.3f).alwaysEat().meat().build();
    public static final FoodProperties COOKED_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(20).saturationMod(15.0f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 5), 1.0f).effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0), 0.05f).alwaysEat().meat().build();
    public static final FoodProperties FILLETED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.3f).build();


}
