package com.water.PlentifulOres.Registry;

import com.water.PlentifulOres.Blocks.Ore.CopperOre;
import com.water.PlentifulOres.Blocks.Ore.LeadOre;
import com.water.PlentifulOres.Blocks.Ore.ObsidianOre;
import com.water.PlentifulOres.Blocks.Ore.SilverOre;
import com.water.PlentifulOres.Blocks.Ore.TinOre;
import com.water.PlentifulOres.Blocks.Ore.UraniumOre;
import com.water.PlentifulOres.Items.Ingots.LeadIngot;
import com.water.PlentifulOres.Items.Tools.Lead.LeadAxe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadHoe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadPickaxe;
import com.water.PlentifulOres.Items.Tools.Lead.LeadShovel;
import com.water.PlentifulOres.Items.Tools.Lead.LeadSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreRegistry {
	public static Block CopperOre;
	public static Block LeadOre;
	public static Block ObsidianOre;
	public static Block SilverOre;
	public static Block TinOre;
	public static Block UraniumOre;
	
	public static void OreBlocks() {
		CopperOre = new CopperOre(Material.rock);
		LeadOre = new LeadOre(Material.rock);
		ObsidianOre = new ObsidianOre(Material.rock);
		SilverOre = new SilverOre(Material.rock);
		TinOre = new TinOre(Material.rock);
		UraniumOre = new UraniumOre(Material.rock);
		
	}
	public static void OreGameReg() {
		
		GameRegistry.registerBlock(CopperOre, CopperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LeadOre, LeadOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ObsidianOre, ObsidianOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SilverOre, SilverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TinOre, TinOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(UraniumOre, UraniumOre.getUnlocalizedName().substring(5));
	}
}
