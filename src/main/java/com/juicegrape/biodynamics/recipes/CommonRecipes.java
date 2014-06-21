package com.juicegrape.biodynamics.recipes;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.juicegrape.biodynamics.blocks.ModBlocks;
import com.juicegrape.biodynamics.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author JuiceGrape
 *
 */
public class CommonRecipes {
	
	
	public static void initCommonRecipes() {
		
		//Redstone Bonemeal
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.enertreePlanks, 4), new Object[] {
			new ItemStack(ModBlocks.enertreeLogs)
		});
		
		//Gold Bonemeal
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.specialBonemeal, 2, 0), new Object[] {
			new ItemStack(Items.dye, 1, 15), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.redstone)
		});
		
		//Organics
		GameRegistry.addSmelting(new ItemStack(ModItems.craftingItem, 1, 2), new ItemStack(ModItems.craftingItem, 1, 1), 200);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.craftingItem, 9, 5), new ItemStack (ModItems.craftingItem, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.craftingItem, 1, 1), new Object[] {
			"aaa",
			"aaa",
			"aaa",
			Character.valueOf('a'), new ItemStack(ModItems.craftingItem, 1, 5)
		});
		
		//Redstone soil
		GameRegistry.addRecipe(new ItemStack(ModBlocks.energysoil, 1, 0), new Object[] {
			"rdr",
			"drd",
			"rdr",
			Character.valueOf('r'), new ItemStack(ModItems.specialBonemeal, 1, 0),
			Character.valueOf('d'), new ItemStack(Blocks.dirt)
		});
		
	}

}
