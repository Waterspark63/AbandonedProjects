package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.SilverIngot;
import com.water.PlentifulOres.Items.Tools.Silver.SilverAxe;
import com.water.PlentifulOres.Items.Tools.Silver.SilverHoe;
import com.water.PlentifulOres.Items.Tools.Silver.SilverPickaxe;
import com.water.PlentifulOres.Items.Tools.Silver.SilverShovel;
import com.water.PlentifulOres.Items.Tools.Silver.SilverSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class SilverRegistry {
	public static Item SilverIngot;
	
	public static Item SilverPickaxe;
	public static Item SilverShovel;
	public static Item SilverAxe;
	public static Item SilverHoe;
	public static Item SilverSword;
	public static void SilverItems() {
		SilverIngot = new SilverIngot();
		
		SilverPickaxe = new SilverPickaxe(Main.SilverToolMaterial);
		SilverAxe = new SilverAxe(Main.SilverToolMaterial);
		SilverShovel = new SilverShovel(Main.SilverToolMaterial);
		SilverHoe = new SilverHoe(Main.SilverToolMaterial);
		SilverSword = new SilverSword(Main.SilverToolMaterial);
	}
	public static void SilverGameReg() {
		GameRegistry.registerItem(SilverIngot, SilverIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(SilverPickaxe, SilverPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverShovel, SilverShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverAxe, SilverAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverHoe, SilverHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSword, SilverSword.getUnlocalizedName().substring(5));
	}
}
