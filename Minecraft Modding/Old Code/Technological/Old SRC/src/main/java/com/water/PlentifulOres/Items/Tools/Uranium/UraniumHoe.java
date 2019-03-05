package com.water.PlentifulOres.Items.Tools.Uranium;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class UraniumHoe extends ItemHoe {
	public UraniumHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Uranium Hoe");
		this.setTextureName("po:uraniumtools/uranium_hoe");
	}
}
