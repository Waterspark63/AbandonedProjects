package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Main;
import com.water.PlentifulOres.Items.Ingots.LeadIngot;
import com.water.PlentifulOres.Items.Tools.Lead.LeadAxe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadHoe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadPickaxe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadShovel;
import com.water.PlentifulOres.Items.Tools.Lead.LeadSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LeadRegistry {
	public static Item LeadIngot;
	
	public static Item LeadPickaxe;
	public static Item LeadShovel;
	public static Item LeadAxe;
	public static Item LeadHoe;
	public static Item LeadSword;
	public static void LeadItems() {
		LeadIngot = new LeadIngot();
		
		LeadPickaxe = new LeadPickaxe(Main.LeadToolMaterial);
		LeadAxe = new LeadAxe(Main.LeadToolMaterial);
		LeadShovel = new LeadShovel(Main.LeadToolMaterial);
		LeadHoe = new LeadHoe(Main.LeadToolMaterial);
		LeadSword = new LeadSword(Main.LeadToolMaterial);
	}
	public static void LeadGameReg() {
		GameRegistry.registerItem(LeadIngot, LeadIngot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(LeadPickaxe, LeadPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LeadShovel, LeadShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LeadAxe, LeadAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LeadHoe, LeadHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LeadSword, LeadSword.getUnlocalizedName().substring(5));
	}

}
