package com.github.epiicthundercat.immersivefoods.setup;

import net.minecraftforge.common.ForgeConfigSpec;

public class IFConfig {


    public static ForgeConfigSpec.IntValue ENDER_DRAGON_DROP;
    public static ForgeConfigSpec.IntValue GENERIC_MOB_DROP;

    public static ForgeConfigSpec.DoubleValue CHANCE_MOB_DROP;
    public static ForgeConfigSpec.IntValue CHANCE_MOB_FOOD_DROP;


    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER) {
        SERVER_BUILDER.comment("Miscellaneous Configurations for the mod.").push("immersivefoods");


        ENDER_DRAGON_DROP = SERVER_BUILDER
                .comment("How much Boss Mobs Drop (Ender Dragon). Default: 10")
                .defineInRange("bossDropFood", 10, 0, Integer.MAX_VALUE);
        GENERIC_MOB_DROP = SERVER_BUILDER
                .comment("How Much a Generic (Most) Mobs will Drop. Default: 2")
                .defineInRange("genDropFood", 2, 0, Integer.MAX_VALUE);
        CHANCE_MOB_DROP = SERVER_BUILDER
                .comment("Chance Extra Drops will drop (Bat Wings)")
                .defineInRange("chanceDrop", 0.45D, 0, Double.MAX_VALUE);
        CHANCE_MOB_FOOD_DROP = SERVER_BUILDER
                .comment("How Much Chance Mobs will drop, similar to generic mobs. Default: 2")
                .defineInRange("chanceDropFood", 2, 0, Integer.MAX_VALUE);


        SERVER_BUILDER.pop();
    }

}
