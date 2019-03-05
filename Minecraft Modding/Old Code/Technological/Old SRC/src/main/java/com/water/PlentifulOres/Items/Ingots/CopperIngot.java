package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class CopperIngot extends Item {
	public CopperIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Copper Ingot");
		this.setTextureName("po:ingots/copper_ingot");
	}
}
