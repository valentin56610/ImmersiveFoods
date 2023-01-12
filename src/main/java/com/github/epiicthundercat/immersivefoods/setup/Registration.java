package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.common.FoodValues;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {


    //   public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);
    // private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Reference.MODID);
    // private static final DeferredRegister<MenuType<?>> MENU = DeferredRegister.create(ForgeRegistries.CONTAINERS, Reference.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // BLOCKS.register(bus);
        ITEMS.register(bus);
        //  BLOCK_ENTITIES.register(bus);
        // MENU.register(bus);

    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
    //   public static final BlockBehaviour.Properties BLOCK_PROPERTIES = new BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.5f);// BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.5f);
    //Items Here

    //Food Items
    public static final RegistryObject<Item> RAW_HORSE_MEAT = ITEMS.register("raw_horse_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_HORSE_FOOD)));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BowlFoodItem(ITEM_PROPERTIES.stacksTo(1).food(FoodValues.CARROT_SOUP_FOOD)));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new BowlFoodItem(ITEM_PROPERTIES.stacksTo(1).food(FoodValues.POTATO_SOUP_FOOD)));
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
    public static final RegistryObject<Item> RAW_SQUID_MEAT = ITEMS.register("raw_squid_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_SQUID_FOOD)));
    public static final RegistryObject<Item> COOKED_SQUID_MEAT = ITEMS.register("cooked_squid_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_SQUID_FOOD)));
    public static final RegistryObject<Item> RAW_PARROT_MEAT = ITEMS.register("raw_parrot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_PARROT_MEAT = ITEMS.register("cooked_parrot_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_PARROT_FOOD)));
    public static final RegistryObject<Item> RAW_DRAGON_MEAT = ITEMS.register("raw_dragon_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.RAW_DRAGON_FOOD)));
    public static final RegistryObject<Item> COOKED_DRAGON_MEAT = ITEMS.register("cooked_dragon_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.COOKED_DRAGON_FOOD)));
    public static final RegistryObject<Item> FILLETED_SQUID_MEAT = ITEMS.register("filleted_squid_meat", () -> new Item(ITEM_PROPERTIES.food(FoodValues.FILLETED_SQUID_FOOD)));


    //Blocks Here
    // public static final RegistryObject<Block> LIME_DIRT = BLOCKS.register("lime_dirt", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)));


    //TAG KEYS ARE CREATED HERE AND THEN CALLED IN THE TAGS
    //BUD
    // public static final TagKey<Item> BUD_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(HempFarmer.MODID, "bud"));


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {

        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));

    }


}
