package com.water.PlentifulOres.Items.Tools.Tin;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class TinHoe extends ItemHoe {
	public TinHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Tin Hoe");
		this.setTextureName("po:tintools/tin_hoe");
	}
}
