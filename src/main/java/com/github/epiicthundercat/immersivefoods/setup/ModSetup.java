package com.github.epiicthundercat.immersivefoods.setup;


import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.datagen.ModLootTables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {
    public static final String TAB_NAME = "immersivefoods";


    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.COOKED_PARROT_MEAT.get());
        }
    };

    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
//        bus.addListener(Ores::onBiomeLoadingEvent);
//        bus.addGenericListener(Entity.class, ManaEvents::onAttachCapabilitiesPlayer);

    }

    public static void init(FMLCommonSetupEvent event) {
//        event.enqueueWork(() -> {
//            Ores.registerConfiguredFeatures();
//            Dimensions.register();
//        });
        FoodMessages.register();

    }

//    @SubscribeEvent
//    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
//        event.put(Registration.THIEF.get(), ThiefEntity.prepareAttributes().build());
//    }

}
