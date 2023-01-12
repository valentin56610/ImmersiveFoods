 package com.hedgehogpie12.food.mod.init;
 
 import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
 
 public class ModFood extends ItemFood
 {
   public ModFood(String name, int amount, float saturation, boolean isWolfFood) {
    super(amount, saturation, isWolfFood);
    this.setRegistryName(name.toLowerCase());
	this.setUnlocalizedName(name.toLowerCase());
	this.setCreativeTab(CreativeTabs.FOOD);
	addToItems(this);
   }
   private void addToItems(Item item) {

	   
		ModItems.items.add(item);
			
			
		}
 }


