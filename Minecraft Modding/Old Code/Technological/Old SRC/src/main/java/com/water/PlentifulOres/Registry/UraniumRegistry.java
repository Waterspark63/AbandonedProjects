package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.UraniumIngot;
import com.water.PlentifulOres.Items.Tools.Uranium.UraniumAxe;
import com.water.PlentifulOres.Items.Tools.Uranium.UraniumHoe;
import com.water.PlentifulOres.Items.Tools.Uranium.UraniumPickaxe;
import com.water.PlentifulOres.Items.Tools.Uranium.UraniumShovel;
import com.water.PlentifulOres.Items.Tools.Uranium.UraniumSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class UraniumRegistry {
	public static Item UraniumIngot;
	
	public static Item UraniumPickaxe;
	public static Item UraniumShovel;
	public static Item UraniumAxe;
	public static Item UraniumHoe;
	public static Item UraniumSword;
	public static void UraniumItems() {
		UraniumIngot = new UraniumIngot();
		
		UraniumPickaxe = new UraniumPickaxe(Main.UraniumToolMaterial);
		UraniumAxe = new UraniumAxe(Main.UraniumToolMaterial);
		UraniumShovel = new UraniumShovel(Main.UraniumToolMaterial);
		UraniumHoe = new UraniumHoe(Main.UraniumToolMaterial);
		UraniumSword = new UraniumSword(Main.UraniumToolMaterial);
	}
	public static void UraniumGameReg() {
		GameRegistry.registerItem(UraniumIngot, UraniumIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(UraniumPickaxe, UraniumPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UraniumShovel, UraniumShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UraniumAxe, UraniumAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UraniumHoe, UraniumHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UraniumSword, UraniumSword.getUnlocalizedName().substring(5));
	}
}
