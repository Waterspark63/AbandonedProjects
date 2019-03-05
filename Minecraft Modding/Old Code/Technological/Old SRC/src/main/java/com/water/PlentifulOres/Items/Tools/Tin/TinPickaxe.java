package com.water.PlentifulOres.Items.Tools.Tin;

import net.minecraft.item.ItemPickaxe;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;

public class TinPickaxe extends ItemPickaxe {
	public TinPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Tin Pickaxe");
		this.setTextureName("po:tintools/tin_pickaxe");
	}
}
