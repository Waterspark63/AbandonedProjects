package com.water.PlentifulOres.Items.Ingots;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item;

public class UraniumIngot extends Item {
	public UraniumIngot() {
		super();
		this.setCreativeTab(Main.tabPlentifulOresOre);
		this.setUnlocalizedName("Uranium Ingot");
		this.setTextureName("po:ingots/uranium_ingot");
	}
}
