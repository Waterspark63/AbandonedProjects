package com.water.PlentifulOres.Items.Tools.Tin;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class TinSword extends ItemSword {
	public TinSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Tin Sword");
		this.setTextureName("po:tintools/tin_sword");
	}
}
