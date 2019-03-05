package com.water.PlentifulOres.Items.Tools.Copper;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {
	public CopperHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Copper Hoe");
		this.setTextureName("po:coppertools/copper_hoe");
	}
}
