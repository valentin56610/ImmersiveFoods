package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.common.FoodValues;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {


    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().stacksTo(64).tab(ModSetup.ITEM_GROUP);
    public static final Item.Properties ONESTACK_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
    //Food Items
    public static final RegistryObject<Item> RAW_HORSE_MEAT = ITEMS.register("raw_horse_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_HORSE_FOOD)));
    //Items Here
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_HORSE_FOOD)));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BowlFoodItem(ONESTACK_PROPERTIES.stacksTo(1).food(FoodValues.CARROT_SOUP_FOOD)));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new BowlFoodItem(ONESTACK_PROPERTIES.stacksTo(1).food(FoodValues.POTATO_SOUP_FOOD)));
    public static final RegistryObject<Item> COOKED_LLAMA_MEAT = ITEMS.register("cooked_llama_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_LLAMA_FOOD)));
    public static final RegistryObject<Item> RAW_LLAMA_MEAT = ITEMS.register("raw_llama_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_LLAMA_FOOD)));
    public static final RegistryObject<Item> RAW_DONKEY_MEAT = ITEMS.register("raw_donkey_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_DONKEY_FOOD)));
    public static final RegistryObject<Item> COOKED_DONKEY_MEAT = ITEMS.register("cooked_donkey_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_DONKEY_FOOD)));
    public static final RegistryObject<Item> RAW_MULE_MEAT = ITEMS.register("raw_mule_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_MULE_FOOD)));
    public static final RegistryObject<Item> COOKED_MULE_MEAT = ITEMS.register("cooked_mule_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_MULE_FOOD)));
    public static final RegistryObject<Item> RAW_BAT_MEAT = ITEMS.register("raw_bat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_BAT_FOOD)));
    public static final RegistryObject<Item> COOKED_BAT_MEAT = ITEMS.register("cooked_bat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_BAT_FOOD)));
    public static final RegistryObject<Item> RAW_OCELOT_MEAT = ITEMS.register("raw_ocelot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_OCELOT_FOOD)));
    public static final RegistryObject<Item> COOKED_OCELOT_MEAT = ITEMS.register("cooked_ocelot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_OCELOT_FOOD)));
    public static final RegistryObject<Item> RAW_WOLF_MEAT = ITEMS.register("raw_wolf_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_WOLF_FOOD)));
    public static final RegistryObject<Item> COOKED_WOLF_MEAT = ITEMS.register("cooked_wolf_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_WOLF_FOOD)));
    public static final RegistryObject<Item> BAT_WING = ITEMS.register("bat_wing", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_BAT_WING_FOOD)));
    public static final RegistryObject<Item> COOKED_BAT_WING = ITEMS.register("cooked_bat_wing", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_BAT_WING_FOOD)));
    public static final RegistryObject<Item> RAW_SQUID_MEAT = ITEMS.register("raw_squid_meat", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COOKED_SQUID_MEAT = ITEMS.register("cooked_squid_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_SQUID_FOOD)));
    public static final RegistryObject<Item> RAW_PARROT_MEAT = ITEMS.register("raw_parrot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_PARROT_MEAT = ITEMS.register("cooked_parrot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    public static final RegistryObject<Item> RAW_DRAGON_MEAT = ITEMS.register("raw_dragon_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_DRAGON_FOOD)));
    public static final RegistryObject<Item> COOKED_DRAGON_MEAT = ITEMS.register("cooked_dragon_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_DRAGON_FOOD)));
    public static final RegistryObject<Item> FILLETED_SQUID_MEAT = ITEMS.register("filleted_squid_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.FILLETED_SQUID_FOOD)));

    //Polar Bear
    public static final RegistryObject<Item> RAW_POLAR_BEAR_MEAT = ITEMS.register("raw_polar_bear_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_POLAR_BEAR_MEAT = ITEMS.register("cooked_polar_bear_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    //AXOLOTL
    public static final RegistryObject<Item> RAW_AXOLOTL_MEAT = ITEMS.register("raw_axolotl_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_AXOLOTL_MEAT = ITEMS.register("cooked_axolotl_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    //GOAT
    public static final RegistryObject<Item> RAW_GOAT_MEAT = ITEMS.register("raw_goat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_GOAT_MEAT = ITEMS.register("cooked_goat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_HORSE_FOOD)));
    //FOX
    public static final RegistryObject<Item> RAW_FOX_MEAT = ITEMS.register("raw_fox_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_WOLF_FOOD)));
    public static final RegistryObject<Item> COOKED_FOX_MEAT = ITEMS.register("cooked_fox_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_WOLF_FOOD)));
    //BEE
    public static final RegistryObject<Item> DEAD_BEE = ITEMS.register("dead_bee", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_BAT_FOOD)));
    public static final RegistryObject<Item> TOASTED_BEE = ITEMS.register("toasted_bee", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_BAT_FOOD)));
    //CAT
    public static final RegistryObject<Item> RAW_CAT_MEAT = ITEMS.register("raw_cat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_CAT_MEAT = ITEMS.register("cooked_cat_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    //PANDA
    public static final RegistryObject<Item> RAW_PANDA_MEAT = ITEMS.register("raw_panda_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_PANDA_MEAT = ITEMS.register("cooked_panda_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_HORSE_FOOD)));
    //TURTLE
    public static final RegistryObject<Item> RAW_TURTLE_MEAT = ITEMS.register("raw_turtle_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_TURTLE_MEAT = ITEMS.register("cooked_turtle_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    //DOLPHIN
    public static final RegistryObject<Item> RAW_DOLPHIN_MEAT = ITEMS.register("raw_dolphin_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_SQUID_FOOD)));
    public static final RegistryObject<Item> COOKED_DOLPHIN_MEAT = ITEMS.register("cooked_dolphin_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_SQUID_FOOD)));


    /**
     * TO ADD:
     * POLAR BEAR RAW AND COOKED - NEED Texture
     * AXOLOTL RAW AND COOKED - DONE
     * GOAT raw and Cooked // PELT? - NEED TEXTURE - DONE
     * FOX - Drops RAW and Cooked - Need Texture
     * Bee - Drops Bee - Cookable - DONE
     * Turtle - Raw and Cooked - DONE
     * Panda - Raw and Cooked - DONE
     * Dolphin // Raw and Cooked // Dolphin fin Soup - DONE
     */


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(bus);


    }


    //TAG KEYS ARE CREATED HERE AND THEN CALLED IN THE TAGS

    // public static final TagKey<Item> BUD_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(HempFarmer.MODID, "bud"));


}
