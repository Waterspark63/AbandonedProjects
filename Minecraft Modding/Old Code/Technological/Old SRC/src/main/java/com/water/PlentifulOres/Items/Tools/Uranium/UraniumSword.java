package com.water.PlentifulOres.Items.Tools.Uranium;

import com.water.PlentifulOres.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class UraniumSword extends ItemSword {
	public UraniumSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.tabPlentifulOresTools);
		this.setUnlocalizedName("Uranium Sword");
		this.setTextureName("po:uraniumtools/uranium_sword");
	}
}
