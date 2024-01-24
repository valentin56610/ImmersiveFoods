package com.github.epiicthundercat.immersivefoods.event.loot;


import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.IFConfig;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

//For Guaranteed Drops
public class FoodDropModifiers extends LootModifier {

    private final Item addition;

    protected FoodDropModifiers(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
//One UNLESS.
        generatedLoot.add(new ItemStack(addition, context.getRandom().nextInt(Math.min(context.getLootingModifier() + 1, 4)) + IFConfig.GENERIC_MOB_DROP.get()));



        return generatedLoot;
    }

    @SubscribeEvent
    public static void registerModifiers(RegistryEvent.Register<GlobalLootModifierSerializer<?>> registryEvent) {

        registryEvent.getRegistry().register(new FoodDropModifiers.Serializer().setRegistryName(Reference.MODID, "global_loot_modifiers"));
    }

    public static class Serializer extends GlobalLootModifierSerializer<FoodDropModifiers> {

        @Override
        public FoodDropModifiers read(ResourceLocation name, JsonObject object, LootItemCondition[] conditionsIn) {

            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new FoodDropModifiers(conditionsIn, addition);
        }

        @Override
        public JsonObject write(FoodDropModifiers instance) {

            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }

}