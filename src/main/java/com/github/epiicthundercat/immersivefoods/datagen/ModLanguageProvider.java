package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.epiicthundercat.immersivefoods.setup.ModSetup.TAB_NAME;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput packOutput, String locale) {
        super(packOutput, Reference.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        add("itemGroup." + TAB_NAME, "Immersive Foods");

//Horse
        add(Registration.RAW_HORSE_MEAT.get(), "Raw Horse");
        add(Registration.COOKED_HORSE_MEAT.get(), "Cooked Horse Steak");
//Soups
        add(Registration.CARROT_SOUP.get(), "Carrot Soup");
        add(Registration.POTATO_SOUP.get(), "Potato Soup");
//Llama
        add(Registration.COOKED_LLAMA_MEAT.get(), "Cooked Llama");
        add(Registration.RAW_LLAMA_MEAT.get(), "Raw Llama");
//Donkey
        add(Registration.RAW_DONKEY_MEAT.get(), "Raw Donkey Meat");
        add(Registration.COOKED_DONKEY_MEAT.get(), "Cooked Donkey Steak");
//Mule
        add(Registration.RAW_MULE_MEAT.get(), "Raw Mule");
        add(Registration.COOKED_MULE_MEAT.get(), "Cooked Mule Steak");
//Ocelot
        add(Registration.RAW_OCELOT_MEAT.get(), "Raw Ocelot");
        add(Registration.COOKED_OCELOT_MEAT.get(), "Cooked Ocelot");
//Wolf
        add(Registration.RAW_WOLF_MEAT.get(), "Raw Wolf");
        add(Registration.COOKED_WOLF_MEAT.get(), "Cooked Wolf");
//Bat
        add(Registration.RAW_BAT_MEAT.get(), "Raw Bat");
        add(Registration.COOKED_BAT_MEAT.get(), "Cooked Bat");
        add(Registration.BAT_WING.get(), "Bat Wing");
        add(Registration.COOKED_BAT_WING.get(), "Cooked Bat Wing");
//Squid
        add(Registration.RAW_SQUID_MEAT.get(), "Raw Squid");
        add(Registration.FILLETED_SQUID_MEAT.get(), "Filleted Squid");
        add(Registration.COOKED_SQUID_MEAT.get(), "Cooked Filleted Squid");
//Parrot
        add(Registration.RAW_PARROT_MEAT.get(), "Raw Parrot");
        add(Registration.COOKED_PARROT_MEAT.get(), "Cooked Parrot");
//Ender Dragon
        add(Registration.RAW_DRAGON_MEAT.get(), "Raw Dragon");
        add(Registration.COOKED_DRAGON_MEAT.get(), "Cooked Dragon");
//Fox
        add(Registration.RAW_FOX_MEAT.get(), "Raw Fox");
        add(Registration.COOKED_FOX_MEAT.get(), "Cooked Fox");
//Goat
        add(Registration.RAW_GOAT_MEAT.get(), "Raw Goat");
        add(Registration.COOKED_GOAT_MEAT.get(), "Cooked Goat Chop");
//Polar Bear
        add(Registration.RAW_POLAR_BEAR_MEAT.get(), "Raw Polar Bear");
        add(Registration.COOKED_POLAR_BEAR_MEAT.get(), "Cooked Polar Bear");
//Axolotl
        add(Registration.RAW_AXOLOTL_MEAT.get(), "Raw Axolotl");
        add(Registration.COOKED_AXOLOTL_MEAT.get(), "Cooked Axolotl");
//Bee
        add(Registration.DEAD_BEE.get(), "Dead Bee");
        add(Registration.TOASTED_BEE.get(), "Toasted Bee");
//Cat
        add(Registration.RAW_CAT_MEAT.get(), "Raw Cat");
        add(Registration.COOKED_CAT_MEAT.get(), "Cooked Cat");
//Turtle
        add(Registration.RAW_TURTLE_MEAT.get(), "Raw Turtle");
        add(Registration.COOKED_TURTLE_MEAT.get(), "Cooked Turtle");
//Panda
        add(Registration.RAW_PANDA_MEAT.get(), "Raw Panda");
        add(Registration.COOKED_PANDA_MEAT.get(), "Cooked Panda");
//Dolphin
        add(Registration.RAW_DOLPHIN_MEAT.get(), "Raw Dolphin");
        add(Registration.COOKED_DOLPHIN_MEAT.get(), "Cooked Dolphin");
//Frog
        add(Registration.RAW_FROG_LEGS.get(), "Frog Leg");
        add(Registration.COOKED_FROG_LEGS.get(), "Cooked Frog Leg");

    }
}