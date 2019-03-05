package com.water.PlentifulOres.Items.Tools.Tin;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class TinAxe extends ItemAxe {
	public TinAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Tin Axe");
		this.setTextureName("po:tintools/tin_axe");
	}
}
