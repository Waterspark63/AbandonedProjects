package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.ObsidianIngot;
import com.water.PlentifulOres.Items.Tools.Obsidian.ObsidianAxe;
import com.water.PlentifulOres.Items.Tools.Obsidian.ObsidianHoe;
import com.water.PlentifulOres.Items.Tools.Obsidian.ObsidianPickaxe;
import com.water.PlentifulOres.Items.Tools.Obsidian.ObsidianShovel;
import com.water.PlentifulOres.Items.Tools.Obsidian.ObsidianSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ObsidianRegistry {
	public static Item ObsidianIngot;
	
	public static Item ObsidianPickaxe;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianSword;
	public static void ObsidianItems() {
		ObsidianIngot = new ObsidianIngot();
		
		ObsidianPickaxe = new ObsidianPickaxe(Main.ObsidianToolMaterial);
		ObsidianAxe = new ObsidianAxe(Main.ObsidianToolMaterial);
		ObsidianShovel = new ObsidianShovel(Main.ObsidianToolMaterial);
		ObsidianHoe = new ObsidianHoe(Main.ObsidianToolMaterial);
		ObsidianSword = new ObsidianSword(Main.ObsidianToolMaterial);
	}
	public static void ObsidianGameReg() {
		GameRegistry.registerItem(ObsidianIngot, ObsidianIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(ObsidianPickaxe, ObsidianPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ObsidianShovel, ObsidianShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ObsidianAxe, ObsidianAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ObsidianHoe, ObsidianHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ObsidianSword, ObsidianSword.getUnlocalizedName().substring(5));
	}

}
