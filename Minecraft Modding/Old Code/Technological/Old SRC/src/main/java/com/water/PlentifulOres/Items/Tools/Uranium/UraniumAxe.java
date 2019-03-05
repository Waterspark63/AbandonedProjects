package com.water.PlentifulOres.Items.Tools.Uranium;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class UraniumAxe extends ItemAxe {
	public UraniumAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Uranium Axe");
		this.setTextureName("po:uraniumtools/uranium_axe");
	}
}
