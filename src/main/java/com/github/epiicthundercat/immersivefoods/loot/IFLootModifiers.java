package com.github.epiicthundercat.immersivefoods.loot;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IFLootModifiers {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Reference.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> GENERIC_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("generic_add", IFGenericItemModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BOSS_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("boss_add", IFBossItemModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CHANCE_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("chance_add", IFChanceItemModifier.CODEC);


    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
