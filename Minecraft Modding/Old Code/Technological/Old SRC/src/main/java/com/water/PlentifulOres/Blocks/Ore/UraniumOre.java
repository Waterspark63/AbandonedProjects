package com.water.PlentifulOres.Blocks.Ore;

import com.water.PlentifulOres.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UraniumOre extends Block {
	public UraniumOre(Material material) {
		super(material);
		this.setHardness(0.5F);
		this.setBlockName("UraniumOre");
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setBlockTextureName("po:ore/uranium_ore");
		this.setLightLevel(0.2F);
		this.setStepSound(this.soundTypeSnow);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
