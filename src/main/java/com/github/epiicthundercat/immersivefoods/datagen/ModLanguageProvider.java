package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.epiicthundercat.immersivefoods.setup.ModSetup.TAB_NAME;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Reference.MODID, locale);
    }

    @Override
    protected void addTranslations() {

//        add(INDICA_ITEM_MESSAGE, "Must Be Placed on Farmland");
//        add(HEMP_ITEM_MESSAGE, "Must Be Placed on Farmland");
//        add(SATIVA_ITEM_MESSAGE, "Must Be Placed on Farmland");

        add("itemGroup." + TAB_NAME, "Immersive Foods");
//        add(MESSAGE_POWER_BATTERY, "Power battery generating %s per tick!");
//        add(SCREEN_HEMP_FARMER_POWER_BATTERY, "Power Battery");
//        add(Registration.POWER_BATTERY.get(), "Power Battery");
//
//        add(MESSAGE_GRINDER, "Grinding Hemp!");
//        add(Registration.GRINDER.get(), "Hemp Grinder");


        add(Registration.RAW_HORSE_MEAT.get(), "Raw Horse Meat");
        add(Registration.COOKED_HORSE_MEAT.get(), "Cooked Horse Meat");
        add(Registration.CARROT_SOUP.get(), "Carrot Soup");
        add(Registration.POTATO_SOUP.get(), "Potato Soup");
        add(Registration.COOKED_LLAMA_MEAT.get(), "Cooked LLama Meat");

        add(Registration.RAW_LLAMA_MEAT.get(), "Raw Llama Meat");
        add(Registration.RAW_DONKEY_MEAT.get(), "Raw Donkey Meat");
        add(Registration.COOKED_DONKEY_MEAT.get(), "Cooked Donkey Meat");
        add(Registration.RAW_MULE_MEAT.get(), "Raw Mule Meat");
        add(Registration.COOKED_MULE_MEAT.get(), "Cooked Mule Meat");
        add(Registration.RAW_BAT_MEAT.get(), "Raw Bat Meat");
        add(Registration.COOKED_BAT_MEAT.get(), "Cooked Bat Meat");
        add(Registration.RAW_OCELOT_MEAT.get(), "Raw Ocelot Meat");
        add(Registration.COOKED_OCELOT_MEAT.get(), "Cooked Ocelot Meat");
        add(Registration.RAW_WOLF_MEAT.get(), "Raw Wolf Meat");
        add(Registration.COOKED_WOLF_MEAT.get(), "Cooked Wolf Meat");
        add(Registration.BAT_WING.get(), "Bat Wing");
        add(Registration.COOKED_BAT_WING.get(), "Cooked Bat Meat");
        add(Registration.RAW_SQUID_MEAT.get(), "Raw Squid Meat");
        add(Registration.COOKED_SQUID_MEAT.get(), "Cooked Filleted Squid Meat");
        add(Registration.RAW_PARROT_MEAT.get(), "Raw Parrot Meat");
        add(Registration.COOKED_PARROT_MEAT.get(), "Cooked Parrot Meat");
        add(Registration.RAW_DRAGON_MEAT.get(), "Raw Dragon Meat");
        add(Registration.COOKED_DRAGON_MEAT.get(), "Cooked Dragon Meat");
        add(Registration.FILLETED_SQUID_MEAT.get(), "Filleted Squid Meat");


    }
}