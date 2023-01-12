package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {

    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MODID, existingFileHelper);
    }


    @Override
    protected void registerModels() {

        //Horse
        singleTexture(Registration.RAW_HORSE_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_horse_meat"));
        singleTexture(Registration.COOKED_HORSE_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_horse_meat"));
//Soups
        singleTexture(Registration.POTATO_SOUP.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/potato_soup"));
        singleTexture(Registration.CARROT_SOUP.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/carrot_soup"));
//Llama
        singleTexture(Registration.RAW_LLAMA_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_llama_meat"));
        singleTexture(Registration.COOKED_LLAMA_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_llama_meat"));
//Donkey
        singleTexture(Registration.RAW_DONKEY_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_donkey_meat"));
        singleTexture(Registration.COOKED_DONKEY_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_donkey_meat"));
//Mule
        singleTexture(Registration.RAW_MULE_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_mule_meat"));
        singleTexture(Registration.COOKED_MULE_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_mule_meat"));
//Bat
        singleTexture(Registration.RAW_BAT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_bat_meat"));
        singleTexture(Registration.COOKED_BAT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_bat_meat"));
//Ocelot
        singleTexture(Registration.RAW_OCELOT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_ocelot_meat"));
        singleTexture(Registration.COOKED_OCELOT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_ocelot_meat"));
//Wolf
        singleTexture(Registration.RAW_WOLF_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_wolf_meat"));
        singleTexture(Registration.COOKED_WOLF_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_wolf_meat"));
//Bat Wings
        singleTexture(Registration.BAT_WING.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/bat_wing"));
        singleTexture(Registration.COOKED_BAT_WING.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_bat_wing"));
//Squid
        singleTexture(Registration.RAW_SQUID_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_squid_meat"));
        singleTexture(Registration.COOKED_SQUID_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_squid_meat"));
//Parrot
        singleTexture(Registration.RAW_PARROT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_parrot_meat"));
        singleTexture(Registration.COOKED_PARROT_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_parrot_meat"));
//Dragon
        singleTexture(Registration.RAW_DRAGON_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/raw_dragon_meat"));
        singleTexture(Registration.COOKED_DRAGON_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/cooked_dragon_meat"));
//Filleted Squid
        singleTexture(Registration.FILLETED_SQUID_MEAT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", new ResourceLocation(Reference.MODID, "items/filleted_squid_meat"));




    }

}
