package com.water.PlentifulOres;

import com.water.PlentifulOres.Blocks.Ore.OreGen;
import com.water.PlentifulOres.Initialization.InitializeBlocks;
import com.water.PlentifulOres.Initialization.InitializeTools_Ingots;
import com.water.PlentifulOres.Registry.CopperRegistry;
import com.water.PlentifulOres.Registry.GameReg_Recipes;
import com.water.PlentifulOres.Registry.OreRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(name = Constants.NAME, modid = Constants.MODID, version = Constants.VERSION, acceptedMinecraftVersions = Constants.MCVERSION)
public class Main {
	
//	public static Block Table;
	
	public static final Item.ToolMaterial CopperToolMaterial = EnumHelper.addToolMaterial("coppertoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	public static final Item.ToolMaterial SilverToolMaterial = EnumHelper.addToolMaterial("silvertoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	public static final Item.ToolMaterial TinToolMaterial = EnumHelper.addToolMaterial("tintoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	public static final Item.ToolMaterial LeadToolMaterial = EnumHelper.addToolMaterial("leadtoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	public static final Item.ToolMaterial UraniumToolMaterial = EnumHelper.addToolMaterial("uraniumtoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	public static final Item.ToolMaterial ObsidianToolMaterial = EnumHelper.addToolMaterial("obsidiantoolmaterial", 4, 2000, 20.0F, 5.0F, 30);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {	
		InitializeTools_Ingots.InitItems();
		InitializeBlocks.InitBlocks();

		InitializeTools_Ingots.InitRegistry();
		InitializeBlocks.InitRegistry();
		
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	    
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Alive.AliveCheck();
		GameReg_Recipes.RegisterRecipes();	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	public static CreativeTabs tabPlentifulOres = new CreativeTabs("tabPlentifulOres") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(Items.golden_apple).getItem();
		}
	};

	public static CreativeTabs tabPlentifulOresTools = new CreativeTabs("tabPlentifulOresTools") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(CopperRegistry.CopperAxe).getItem();
		}
	};
	
	public static CreativeTabs tabPlentifulOresArmor = new CreativeTabs("tabPlentifulOresArmor") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(Items.golden_apple).getItem();
		}
	};
	
	public static CreativeTabs tabPlentifulOresOre = new CreativeTabs("tabPlentifulOresOre") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(OreRegistry.CopperOre).getItem();
		}
	};
}
