package com.water.PlentifulOres.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GameReg_Recipes {
	public static void RegisterRecipes() {
//		GameRegistry.addRecipe(new ItemStack(Main.Table, 2 /**Number of Items*/), new Object[] {"WWW","SWS"," W ",'W',Blocks.planks, 'S',Blocks.wooden_slab});
		GameRegistry.addRecipe(new ItemStack(CopperRegistry.CopperPickaxe), new Object[] {"CCC"," S "," S ",'C',CopperRegistry.CopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(CopperRegistry.CopperShovel), new Object[] {"C","S","S",'C',CopperRegistry.CopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(CopperRegistry.CopperAxe), new Object[] {"CC","CS"," S",'C',CopperRegistry.CopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(CopperRegistry.CopperHoe), new Object[] {"CC"," S"," S",'C',CopperRegistry.CopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(CopperRegistry.CopperSword), new Object[] {"C","C","S",'C',CopperRegistry.CopperIngot,'S',Items.stick});

		GameRegistry.addRecipe(new ItemStack(LeadRegistry.LeadPickaxe), new Object[] {"CCC"," S "," S ",'C',LeadRegistry.LeadIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LeadRegistry.LeadShovel), new Object[] {"C","S","S",'C',LeadRegistry.LeadIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LeadRegistry.LeadAxe), new Object[] {"CC","CS"," S",'C',LeadRegistry.LeadIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LeadRegistry.LeadHoe), new Object[] {"CC"," S"," S",'C',LeadRegistry.LeadIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LeadRegistry.LeadSword), new Object[] {"C","C","S",'C',LeadRegistry.LeadIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(ObsidianRegistry.ObsidianPickaxe), new Object[] {"CCC"," S "," S ",'C',ObsidianRegistry.ObsidianIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ObsidianRegistry.ObsidianShovel), new Object[] {"C","S","S",'C',ObsidianRegistry.ObsidianIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ObsidianRegistry.ObsidianAxe), new Object[] {"CC","CS"," S",'C',ObsidianRegistry.ObsidianIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ObsidianRegistry.ObsidianHoe), new Object[] {"CC"," S"," S",'C',ObsidianRegistry.ObsidianIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ObsidianRegistry.ObsidianSword), new Object[] {"C","C","S",'C',ObsidianRegistry.ObsidianIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(SilverRegistry.SilverPickaxe), new Object[] {"CCC"," S "," S ",'C',SilverRegistry.SilverIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SilverRegistry.SilverShovel), new Object[] {"C","S","S",'C',SilverRegistry.SilverIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SilverRegistry.SilverAxe), new Object[] {"CC","CS"," S",'C',SilverRegistry.SilverIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SilverRegistry.SilverHoe), new Object[] {"CC"," S"," S",'C',SilverRegistry.SilverIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SilverRegistry.SilverSword), new Object[] {"C","C","S",'C',SilverRegistry.SilverIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(TinRegistry.TinPickaxe), new Object[] {"CCC"," S "," S ",'C',TinRegistry.TinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(TinRegistry.TinShovel), new Object[] {"C","S","S",'C',TinRegistry.TinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(TinRegistry.TinAxe), new Object[] {"CC","CS"," S",'C',TinRegistry.TinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(TinRegistry.TinHoe), new Object[] {"CC"," S"," S",'C',TinRegistry.TinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(TinRegistry.TinSword), new Object[] {"C","C","S",'C',TinRegistry.TinIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(UraniumRegistry.UraniumPickaxe), new Object[] {"CCC"," S "," S ",'C',UraniumRegistry.UraniumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(UraniumRegistry.UraniumShovel), new Object[] {"C","S","S",'C',UraniumRegistry.UraniumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(UraniumRegistry.UraniumAxe), new Object[] {"CC","CS"," S",'C',UraniumRegistry.UraniumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(UraniumRegistry.UraniumHoe), new Object[] {"CC"," S"," S",'C',UraniumRegistry.UraniumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(UraniumRegistry.UraniumSword), new Object[] {"C","C","S",'C',UraniumRegistry.UraniumIngot,'S',Items.stick});
	}
}
