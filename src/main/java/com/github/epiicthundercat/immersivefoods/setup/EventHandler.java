package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.datagen.ModLootTables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;

public class EventHandler {


    public static void registerEvents() {
        MinecraftForge.EVENT_BUS.addListener(EventHandler::lootLoad);

    }

    public static final Multimap<ResourceLocation, ResourceLocation> LOOT_TABLE_INJECT = MultimapBuilder.hashKeys().hashSetValues().build();

    static {


        LOOT_TABLE_INJECT.put(EntityType.SQUID.getDefaultLootTable(), ModLootTables.BAT);

        LOOT_TABLE_INJECT.put(EntityType.ENDER_DRAGON.getDefaultLootTable(), ModLootTables.DRAGON);

        LOOT_TABLE_INJECT.put(EntityType.PARROT.getDefaultLootTable(), ModLootTables.PARROT);

        LOOT_TABLE_INJECT.put(EntityType.WOLF.getDefaultLootTable(), ModLootTables.WOLF);

        LOOT_TABLE_INJECT.put(EntityType.MULE.getDefaultLootTable(), ModLootTables.MULE);

        LOOT_TABLE_INJECT.put(EntityType.HORSE.getDefaultLootTable(), ModLootTables.HORSE);

        LOOT_TABLE_INJECT.put(EntityType.DONKEY.getDefaultLootTable(), ModLootTables.DONKEY);

        LOOT_TABLE_INJECT.put(EntityType.OCELOT.getDefaultLootTable(), ModLootTables.OCELOT);

        LOOT_TABLE_INJECT.put(EntityType.LLAMA.getDefaultLootTable(), ModLootTables.LLAMA);

        LOOT_TABLE_INJECT.put(EntityType.SQUID.getDefaultLootTable(), ModLootTables.SQUID);
    }

    public static void lootLoad(LootTableLoadEvent event) {
        for (ResourceLocation resourceLocation : LOOT_TABLE_INJECT.keys()) {
            if (event.getName().equals(resourceLocation)) {
                for (ResourceLocation ref : LOOT_TABLE_INJECT.get(resourceLocation)) {
                    event.getTable().addPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)).add(LootTableReference.lootTableReference(ref)).build());
                }
                break;
            }
        }
    }
}


