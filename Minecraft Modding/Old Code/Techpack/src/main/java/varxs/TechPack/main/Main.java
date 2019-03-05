package varxs.TechPack.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import varxs.TechPack.blocks.ModBlocks;
import varxs.TechPack.client.tabComponents;
import varxs.TechPack.client.tabComputers;
import varxs.TechPack.client.tabMaterials;
import varxs.TechPack.items.ModItems;
import varxs.TechPack.proxy.CommonProxy;
import varxs.TechPack.support.Reference;
import varxs.TechPack.world.ModWorldGen;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	public static final tabComponents tabComponents = new tabComponents();
	public static final tabComputers tabComputers = new tabComputers();
	public static final tabMaterials tabMaterials = new tabMaterials();
	
	@SidedProxy(serverSide = "varxs.TechPack.proxy.CommonProxy", clientSide = "varxs.TechPack.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance(Reference.MODID)
	public static Main instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.NAME + " is Loading!");
		ModItems.init();
		ModBlocks.init();
		
		//Ore Gens
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
