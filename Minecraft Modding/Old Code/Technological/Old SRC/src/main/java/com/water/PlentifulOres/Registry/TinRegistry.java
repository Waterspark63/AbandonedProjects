package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.TinIngot;
import com.water.PlentifulOres.Items.Tools.Tin.TinAxe;
import com.water.PlentifulOres.Items.Tools.Tin.TinHoe;
import com.water.PlentifulOres.Items.Tools.Tin.TinPickaxe;
import com.water.PlentifulOres.Items.Tools.Tin.TinShovel;
import com.water.PlentifulOres.Items.Tools.Tin.TinSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class TinRegistry {
	public static Item TinIngot;
	
	public static Item TinPickaxe;
	public static Item TinShovel;
	public static Item TinAxe; 
	public static Item TinHoe;
	public static Item TinSword;
	public static void TinItems() {
		TinIngot = new TinIngot();
		
		TinPickaxe = new TinPickaxe(Main.TinToolMaterial);
		TinAxe = new TinAxe(Main.TinToolMaterial);
		TinShovel = new TinShovel(Main.TinToolMaterial);
		TinHoe = new TinHoe(Main.TinToolMaterial);
		TinSword = new TinSword(Main.TinToolMaterial);
	}
	public static void TinGameReg() {
		GameRegistry.registerItem(TinIngot, TinIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(TinPickaxe, TinPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinShovel, TinShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinAxe, TinAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinHoe, TinHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSword, TinSword.getUnlocalizedName().substring(5));
	}
}
