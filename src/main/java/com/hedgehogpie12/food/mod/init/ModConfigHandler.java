package com.hedgehogpie12.food.mod.init;

import java.io.File;

import com.hedgehogpie12.food.mod.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModConfigHandler {
	public static Configuration CONFIG;
	private static String DEF_CAT = "Mob Drops";

	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent e) {
		if (e.getModID().equals(Reference.MODID)) {
			init();
		}
	}

	public static void init() {
		if (CONFIG == null) {
			CONFIG = new Configuration(new File(Reference.CONFIG_FILE));
			MinecraftForge.EVENT_BUS.register(new ModConfigHandler());
		}
//DROPS
		Reference.DRAGON_DROP_AMOUNT = CONFIG.getInt("Dragon Drop Amount", DEF_CAT, 19, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.BAT_DROP_AMOUNT = CONFIG.getInt("Bat Drop Amount", DEF_CAT, 1, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.BAT_WING_DROP_AMOUNT = CONFIG.getInt("Bat Wing Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.MULE_DROP_AMOUNT = CONFIG.getInt("Mule Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.OCELOT_DROP_AMOUNT = CONFIG.getInt("Ocelot Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.DONKEY_DROP_AMOUNT = CONFIG.getInt("Donkey Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.PARROT_DROP_AMOUNT = CONFIG.getInt("Parrot Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.WOLF_DROP_AMOUNT = CONFIG.getInt("Wolf Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.SQUID_DROP_AMOUNT = CONFIG.getInt("Squid Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.HORSE_DROP_AMOUNT = CONFIG.getInt("Horse Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");
		Reference.LLAMA_DROP_AMOUNT = CONFIG.getInt("Llama Drop Amount", DEF_CAT, 2, 0, 2147483647,
				"Increase or Decrease drop *amount* not RATE!(Note: Remember high numbers can be more laggy as it creates more entities!)");

		if (CONFIG.hasChanged()) {
			CONFIG.save();
		}
	}
}
