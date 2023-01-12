package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(DataGenerator generator) {
        super(generator);
    }


    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {


        //Shaped
        ShapedRecipeBuilder.shaped(Registration.CARROT_SOUP.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern(" b ")
                .define('x', Items.CARROT)
                .define('b', Items.BOWL)
                .group("immersivefoods")
                .unlockedBy("carrot_soup", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
                .save(consumer);
        //Shaped
        ShapedRecipeBuilder.shaped(Registration.POTATO_SOUP.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern(" b ")
                .define('x', Items.POTATO)
                .define('b', Items.BOWL)
                .group("immersivefoods")
                .unlockedBy("potato_soup", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POTATO))
                .save(consumer);
        //Shapeless
        ShapelessRecipeBuilder.shapeless(Registration.FILLETED_SQUID_MEAT.get(), 1)
                .requires(Registration.RAW_SQUID_MEAT.get())
                .requires(Items.FLINT)

                .group("immersivefoods")
                .unlockedBy("has_squid", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_SQUID_MEAT.get()))
                .save(consumer);


        //Horse
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), Registration.COOKED_HORSE_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_horse", has(Registration.RAW_HORSE_MEAT.get())).save(consumer, "horse_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), Registration.COOKED_HORSE_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_horse", has(Registration.RAW_HORSE_MEAT.get())).save(consumer, "horse_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), Registration.COOKED_HORSE_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_horse", has(Registration.RAW_HORSE_MEAT.get())).save(consumer, "horse_meat_smoke");

        //Llama
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_llama", has(Registration.RAW_LLAMA_MEAT.get())).save(consumer, "llama_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_llama", has(Registration.RAW_LLAMA_MEAT.get())).save(consumer, "llama_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_llama", has(Registration.RAW_LLAMA_MEAT.get())).save(consumer, "llama_meat_smoke");

        //Bat
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_BAT_MEAT.get()), Registration.COOKED_BAT_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_bat", has(Registration.RAW_BAT_MEAT.get())).save(consumer, "bat_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_BAT_MEAT.get()), Registration.COOKED_BAT_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_bat", has(Registration.RAW_BAT_MEAT.get())).save(consumer, "bat_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_BAT_MEAT.get()), Registration.COOKED_BAT_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_bat", has(Registration.RAW_BAT_MEAT.get())).save(consumer, "bat_meat_smoke");

        //Donkey
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_donkey", has(Registration.RAW_DONKEY_MEAT.get())).save(consumer, "donkey_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_donkey", has(Registration.RAW_DONKEY_MEAT.get())).save(consumer, "donkey_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_donkey", has(Registration.RAW_DONKEY_MEAT.get())).save(consumer, "donkey_meat_smoke");

        //Mule
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_MULE_MEAT.get()), Registration.COOKED_MULE_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_mule", has(Registration.RAW_MULE_MEAT.get())).save(consumer, "mule_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_MULE_MEAT.get()), Registration.COOKED_MULE_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_mule", has(Registration.RAW_MULE_MEAT.get())).save(consumer, "mule_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_MULE_MEAT.get()), Registration.COOKED_MULE_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_mule", has(Registration.RAW_MULE_MEAT.get())).save(consumer, "mule_meat_smoke");
        //Squid
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), Registration.COOKED_SQUID_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_squid", has(Registration.FILLETED_SQUID_MEAT.get())).save(consumer, "squid_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), Registration.COOKED_SQUID_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_squid", has(Registration.FILLETED_SQUID_MEAT.get())).save(consumer, "squid_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), Registration.COOKED_SQUID_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_squid", has(Registration.FILLETED_SQUID_MEAT.get())).save(consumer, "squid_meat_smoke");

        //Ocelot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_ocelot", has(Registration.RAW_OCELOT_MEAT.get())).save(consumer, "ocelot_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_ocelot", has(Registration.RAW_OCELOT_MEAT.get())).save(consumer, "ocelot_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_ocelot", has(Registration.RAW_OCELOT_MEAT.get())).save(consumer, "ocelot_meat_smoke");

        //Wolf
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), Registration.COOKED_WOLF_MEAT.get(), 1.0f, 200)
                .unlockedBy("has_wolf", has(Registration.RAW_WOLF_MEAT.get())).save(consumer, "wolf_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), Registration.COOKED_WOLF_MEAT.get(), 1.0f, 600)
                .unlockedBy("has_wolf", has(Registration.RAW_WOLF_MEAT.get())).save(consumer, "wolf_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), Registration.COOKED_WOLF_MEAT.get(), 1.0f, 100)
                .unlockedBy("has_wolf", has(Registration.RAW_WOLF_MEAT.get())).save(consumer, "wolf_meat_smoke");

        //Dragon
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), Registration.COOKED_DRAGON_MEAT.get(), 50.0f, 400)
                .unlockedBy("has_dragon", has(Registration.RAW_DRAGON_MEAT.get())).save(consumer, "dragon_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), Registration.COOKED_DRAGON_MEAT.get(), 25.0f, 800)
                .unlockedBy("has_dragon", has(Registration.RAW_DRAGON_MEAT.get())).save(consumer, "dragon_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), Registration.COOKED_DRAGON_MEAT.get(), 100.0f, 200)
                .unlockedBy("has_dragon", has(Registration.RAW_DRAGON_MEAT.get())).save(consumer, "dragon_meat_smoke");
        //Parrot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), Registration.COOKED_PARROT_MEAT.get(), 50.0f, 400)
                .unlockedBy("has_parrot", has(Registration.RAW_PARROT_MEAT.get())).save(consumer, "parrot_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), Registration.COOKED_PARROT_MEAT.get(), 25.0f, 800)
                .unlockedBy("has_parrot", has(Registration.RAW_PARROT_MEAT.get())).save(consumer, "parrot_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), Registration.COOKED_PARROT_MEAT.get(), 100.0f, 200)
                .unlockedBy("has_parrot", has(Registration.RAW_PARROT_MEAT.get())).save(consumer, "parrot_meat_smoke");

        //BatWing
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.BAT_WING.get()), Registration.COOKED_BAT_WING.get(), 1.0f, 200)
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get())).save(consumer, "bat_wing_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.BAT_WING.get()), Registration.COOKED_BAT_WING.get(), 1.0f, 600)
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get())).save(consumer, "bat_wing_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.BAT_WING.get()), Registration.COOKED_BAT_WING.get(), 1.0f, 100)
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get())).save(consumer, "bat_wing_smoke");


    }


}

