package com.github.epiicthundercat.immersivefoods.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigSetup {

    public static void register() {
        registerServerConfigs();
      //  registerCommonConfigs();

    }



//    private static void registerCommonConfigs() {
//
////        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
////        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, COMMON_BUILDER.build());
//
//
//
//    }

    private static void registerServerConfigs() {

        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        IFConfig.registerServerConfig(SERVER_BUILDER);

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_BUILDER.build());

    }
}
