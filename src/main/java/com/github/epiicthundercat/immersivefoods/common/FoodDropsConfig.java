package com.github.epiicthundercat.immersivefoods.common;

import net.minecraftforge.common.ForgeConfigSpec;

public class FoodDropsConfig {
    //Can we do this?

    public static ForgeConfigSpec.IntValue DRAGON_DROP_AMOUNT ;
    public static ForgeConfigSpec.IntValue BAT_DROP_AMOUNT ;
    public static ForgeConfigSpec.IntValue LLAMA_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue DONKEY_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue MULE_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue BAT_WING_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue SQUID_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue PARROT_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue WOLF_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue OCELOT_DROP_AMOUNT;
    public static ForgeConfigSpec.IntValue HORSE_DROP_AMOUNT;

    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER) {
        SERVER_BUILDER.comment("Settings for the mob drops!").push("mobdrops");

        DRAGON_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Dragon Meat the Dragon Drops!")
                .defineInRange("total_drops", 24, 1, Integer.MAX_VALUE);

        BAT_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Bat Meat the Bats Drop!")
                .defineInRange("total_drops", 1, 1, Integer.MAX_VALUE);

        LLAMA_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Llama Meat the Llama Drops!")
                .defineInRange("total_drops", 6, 1, Integer.MAX_VALUE);

        DONKEY_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Donkey Meat the Donkey Drops!")
                .defineInRange("total_drops", 6, 1, Integer.MAX_VALUE);

        MULE_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Mule Meat the Mules Drop!")
                .defineInRange("total_drops", 6, 1, Integer.MAX_VALUE);

        BAT_WING_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Many Bat Wings Bats Drop!")
                .defineInRange("total_drops", 2, 1, Integer.MAX_VALUE);

        SQUID_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Squid Meat the Squid Drops!")
                .defineInRange("total_drops", 8, 1, Integer.MAX_VALUE);

        PARROT_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Parrot Meat the Parrot Drops!")
                .defineInRange("total_drops", 1, 1, Integer.MAX_VALUE);

        WOLF_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Wolf Meat the Wolf Drops!")
                .defineInRange("total_drops", 3, 1, Integer.MAX_VALUE);
        OCELOT_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Ocelot Meat the Ocelot Drops!")
                .defineInRange("total_drops", 2, 1, Integer.MAX_VALUE);

        HORSE_DROP_AMOUNT = SERVER_BUILDER
                .comment("How Much Horse Meat the Horse Drops!")
                .defineInRange("total_drops", 6, 1, Integer.MAX_VALUE);




        SERVER_BUILDER.pop();
    }

}
