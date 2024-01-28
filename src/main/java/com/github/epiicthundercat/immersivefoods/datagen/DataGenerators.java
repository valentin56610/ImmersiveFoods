package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {


    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {


        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(true, new ModRecipeProvider(generator));

        }
        if (event.includeClient()) {

            generator.addProvider(true, new ModItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new ModLanguageProvider(generator, "en_us"));


        }


    }
}
