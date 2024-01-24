package com.github.epiicthundercat.immersivefoods.event;


import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.event.loot.BossFoodDropModifier;
import com.github.epiicthundercat.immersivefoods.event.loot.FoodDropModifierChance;
import com.github.epiicthundercat.immersivefoods.event.loot.FoodDropModifiers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBus {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_squid_meat_from_squid")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_panda_meat_from_panda")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_turtle_meat_from_turtle")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_dolphin_meat_from_dolphin")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_goat_meat_from_goat")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "dead_bee_from_bee")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_axolotl_meat_from_axolotl")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_cat_meat_from_cat")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_fox_meat_from_fox")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_polar_bear_meat_from_polar_bear")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_wolf_meat_from_wolf")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_llama_meat_from_llama")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_trader_llama_from_trader_llama")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_bat_meat_from_bat")),
                new FoodDropModifierChance.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "bat_wing_from_bat")),
                new BossFoodDropModifier.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_dragon_meat_from_dragon")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_parrot_meat_from_parrot")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_ocelot_meat_from_ocelot")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_donkey_meat_from_donkey")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_mule_meat_from_mule")),
                new FoodDropModifiers.Serializer().setRegistryName
                        (new ResourceLocation(Reference.MODID, "raw_horse_meat_from_horse"))

        );
    }
}
