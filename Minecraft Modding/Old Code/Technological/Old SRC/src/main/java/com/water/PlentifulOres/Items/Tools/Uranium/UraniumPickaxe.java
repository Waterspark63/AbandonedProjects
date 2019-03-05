package com.water.PlentifulOres.Items.Tools.Uranium;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class UraniumPickaxe extends ItemPickaxe {
	public UraniumPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Uranium Pickaxe");
		this.setTextureName("po:uraniumtools/uranium_pickaxe");
	}
}
