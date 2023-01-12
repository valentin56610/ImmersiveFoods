package com.hedgehogpie12.food.mod.proxy;

import com.hedgehogpie12.food.mod.handler.MobDropsHandler;
import com.hedgehogpie12.food.mod.init.ModConfigHandler;
import com.hedgehogpie12.food.mod.init.ModItems;
import com.hedgehogpie12.food.mod.init.ModRecipes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
		ModConfigHandler.init();
		ModRecipes.init();
	}

	private void register(FMLPreInitializationEvent preEvent) {
		ModItems.register(preEvent);
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());

		// MinecraftForge.EVENT_BUS.register(new REventHandler());

	}

	public void registerRenders(FMLInitializationEvent event) {

	}

	public void registerRender(FMLInitializationEvent event) {
	}

}
