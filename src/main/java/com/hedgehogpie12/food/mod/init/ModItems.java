package com.hedgehogpie12.food.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ModItems {

	public static List<Item> items = new ArrayList();

	public static Item raw_horse_meat = new ModFood("raw_horse_meat", 3, 1.8F, true);
	public static Item cooked_horse_meat = new ModFood("cooked_horse_meat", 8, 12.8F, true);

	public static Item carrot_soup = new ModFood("carrot_soup", 6, 7.2F, false);
	public static Item potato_soup = new ModFood("potato_soup", 6, 7.2F, false);
	public static Item cooked_llama_meat = new ModFood("cooked_llama_meat", 8, 12.8F, true);
	public static Item raw_llama_meat = new ModFood("raw_llama_meat", 3, 1.8F, true);
	public static Item raw_donkey_meat = new ModFood("raw_donkey_meat", 3, 1.8F, true);
	public static Item cooked_donkey_meat = new ModFood("cooked_donkey_meat", 8, 12.8F, true);
	public static Item raw_mule_meat = new ModFood("raw_mule_meat", 3, 1.8F, true);
	public static Item cooked_mule_meat = new ModFood("cooked_mule_meat", 8, 12.8F, true);
	public static Item raw_bat_meat = new ModFood("raw_bat_meat", 3, 1.8F, true);
	public static Item cooked_bat_meat = new ModFood("cooked_bat_meat", 8, 12.8F, true);
	public static Item raw_ocelot_meat = new ModFood("raw_ocelot_meat", 3, 1.8F, true);
	public static Item cooked_ocelot_meat = new ModFood("cooked_ocelot_meat", 8, 12.8F, true);
	public static Item raw_wolf_meat = new ModFood("raw_wolf_meat", 3, 1.8F, true);
	public static Item cooked_wolf_meat = new ModFood("cooked_wolf_meat", 8, 12.8F, true);
	public static Item bat_wing = new ModFood("bat_wing", 1, 1.8F, true);
	public static Item cooked_bat_wing = new ModFood("cooked_bat_wing", 3, 5.8F, true);
	public static Item raw_squid_meat = new ModFood("raw_squid_meat", 1, 0.8F, true);
	public static Item cooked_squid_meat = new ModFood("cooked_squid_meat", 8, 12.8F, true);
	public static Item raw_parrot_meat = new ModFood("raw_parrot_meat", 3, 1.8F, true);
	public static Item cooked_parrot_meat = new ModFood("cooked_parrot_meat", 8, 12.8F, true);
	public static Item raw_dragon_meat = new ModFood("raw_dragon_meat", 6, 11.8F, true);
	public static Item cooked_dragon_meat = new ModFood("cooked_dragon_meat", 20, 20.8F, true);
	public static Item filled_squid_meat = new ModFood("filled_squid_meat", 2, 2.8F, true);

	private static List<Item> getItems() {
		return items;
		
	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : getItems()) {

			ForgeRegistries.ITEMS.register(item);
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : getItems()) {
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}

}
