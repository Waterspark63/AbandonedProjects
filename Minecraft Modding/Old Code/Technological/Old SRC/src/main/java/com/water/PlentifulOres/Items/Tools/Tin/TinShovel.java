package com.water.PlentifulOres.Items.Tools.Tin;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class TinShovel extends ItemSpade {
	public TinShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Tin Shovel");
		this.setTextureName("po:tintools/tin_shovel");
	}
}
