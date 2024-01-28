package com.github.epiicthundercat.immersivefoods.setup;


import com.github.epiicthundercat.immersivefoods.Reference;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {
    public static final String TAB_NAME = "immersivefoods";



    public static void setup() {

    }

    public static void init(FMLCommonSetupEvent event) {

        FoodMessages.register();

    }

    @SubscribeEvent
    public static void onCustomTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(Reference.MODID, "immersivefoods"), builder -> builder.title(Component.translatable("itemGroup." + TAB_NAME))
                .icon(() -> new ItemStack(Registration.TOASTED_BEE.get()))
                .displayItems((enabledFeatures, output, tab) -> {

                    //Polar Bear
                    output.accept(Registration.COOKED_AXOLOTL_MEAT.get());
                    output.accept(Registration.RAW_AXOLOTL_MEAT.get());

                    //Polar Bear
                    output.accept(Registration.COOKED_BAT_MEAT.get());
                    output.accept(Registration.RAW_BAT_MEAT.get());
                    output.accept(Registration.COOKED_BAT_WING.get());

                    //Polar Bear
                    output.accept(Registration.COOKED_DOLPHIN_MEAT.get());
                    output.accept(Registration.RAW_DOLPHIN_MEAT.get());

                    //Polar Bear
                    output.accept(Registration.COOKED_DRAGON_MEAT.get());
                    output.accept(Registration.RAW_DRAGON_MEAT.get());

                    //Polar Bear
                    output.accept(Registration.DEAD_BEE.get());
                    output.accept(Registration.TOASTED_BEE.get());

                    //Soups
                    output.accept(Registration.CARROT_SOUP.get());
                    output.accept(Registration.POTATO_SOUP.get());

                    //Squid
                    output.accept(Registration.COOKED_SQUID_MEAT.get());
                    output.accept(Registration.FILLETED_SQUID_MEAT.get());
                    output.accept(Registration.RAW_SQUID_MEAT.get());

                    //Cat
                    output.accept(Registration.COOKED_CAT_MEAT.get());
                    output.accept(Registration.RAW_CAT_MEAT.get());

                    //Donkey
                    output.accept(Registration.COOKED_DONKEY_MEAT.get());
                    output.accept(Registration.RAW_DONKEY_MEAT.get());

                    //Fox
                    output.accept(Registration.COOKED_FOX_MEAT.get());
                    output.accept(Registration.RAW_FOX_MEAT.get());

                    //Horse
                    output.accept(Registration.COOKED_HORSE_MEAT.get());
                    output.accept(Registration.RAW_HORSE_MEAT.get());

                    //Llama
                    output.accept(Registration.COOKED_LLAMA_MEAT.get());
                    output.accept(Registration.RAW_LLAMA_MEAT.get());

                    //Goat
                    output.accept(Registration.COOKED_GOAT_MEAT.get());
                    output.accept(Registration.RAW_GOAT_MEAT.get());

                    //Mule
                    output.accept(Registration.COOKED_MULE_MEAT.get());
                    output.accept(Registration.RAW_MULE_MEAT.get());

                    //Ocelot
                    output.accept(Registration.COOKED_OCELOT_MEAT.get());
                    output.accept(Registration.RAW_OCELOT_MEAT.get());

                    //Parrot
                    output.accept(Registration.COOKED_PARROT_MEAT.get());
                    output.accept(Registration.RAW_PARROT_MEAT.get());

                    //Panda
                    output.accept(Registration.COOKED_PANDA_MEAT.get());
                    output.accept(Registration.RAW_PANDA_MEAT.get());

                    //Polar Bear
                    output.accept(Registration.COOKED_POLAR_BEAR_MEAT.get());
                    output.accept(Registration.RAW_POLAR_BEAR_MEAT.get());

                    //Turtle
                    output.accept(Registration.COOKED_TURTLE_MEAT.get());
                    output.accept(Registration.COOKED_TURTLE_MEAT.get());

                    //Wolf
                    output.accept(Registration.COOKED_WOLF_MEAT.get());
                    output.accept(Registration.RAW_WOLF_MEAT.get());

                    //Frog
                    output.accept(Registration.COOKED_FROG_LEGS.get());
                    output.accept(Registration.RAW_FROG_LEGS.get());


                }));
    }
}
