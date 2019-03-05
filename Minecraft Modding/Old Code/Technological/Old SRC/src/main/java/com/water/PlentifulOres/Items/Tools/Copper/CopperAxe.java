package com.water.PlentifulOres.Items.Tools.Copper;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class CopperAxe extends ItemAxe {
	public CopperAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Copper Axe");
		this.setTextureName("po:coppertools/copper_axe");
	}
}
