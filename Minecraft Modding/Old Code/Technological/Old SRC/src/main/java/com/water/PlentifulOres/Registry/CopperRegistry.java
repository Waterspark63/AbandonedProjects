package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.CopperIngot;
import com.water.PlentifulOres.Items.Tools.Copper.CopperAxe;
import com.water.PlentifulOres.Items.Tools.Copper.CopperHoe;
import com.water.PlentifulOres.Items.Tools.Copper.CopperPickaxe;
import com.water.PlentifulOres.Items.Tools.Copper.CopperShovel;
import com.water.PlentifulOres.Items.Tools.Copper.CopperSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class CopperRegistry {
	public static Item CopperIngot;
	
	public static Item CopperPickaxe;
	public static Item CopperShovel;
	public static Item CopperAxe;
	public static Item CopperHoe;
	public static Item CopperSword;
	
	public static Item CopperHelmet;
	public static Item CopperChestplate;
	public static Item CopperLeggings;
	public static Item CopperBoots;
	
	public static void CopperItems() {
		CopperIngot = new CopperIngot();
		
		CopperPickaxe = new CopperPickaxe(Main.CopperToolMaterial);
		CopperAxe = new CopperAxe(Main.CopperToolMaterial);
		CopperShovel = new CopperShovel(Main.CopperToolMaterial);
		CopperHoe = new CopperHoe(Main.CopperToolMaterial);
		CopperSword = new CopperSword(Main.CopperToolMaterial);
	}
	public static void CopperGameReg() {
		GameRegistry.registerItem(CopperIngot, CopperIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(CopperPickaxe, CopperPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperShovel, CopperShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperAxe, CopperAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperHoe, CopperHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperSword, CopperSword.getUnlocalizedName().substring(5));
	}
}
