package varxs.TechPack.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import varxs.TechPack.main.Main;
import varxs.TechPack.support.ItemModelProvider;

public class ModBlocks {
	
	public static BlockBase oreCopper;
	public static BlockBase oreTin;
	public static BlockBase oreLead;
	
	public static BlockBase ComputerTower;
	
	public static void init() {
		oreCopper = register(new BlockOre("oreCopper").setCreativeTab(Main.tabMaterials));
		oreTin = register(new BlockOre("oreTin").setCreativeTab(Main.tabMaterials));
		oreLead = register(new BlockOre("oreLead").setCreativeTab(Main.tabMaterials));
		ComputerTower = register(new Block("ComputerTower").setCreativeTab(Main.tabComputers));
		
		
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {

		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);

		}

		if (block instanceof ItemModelProvider) {
			((ItemModelProvider) block).registerItemModel(itemBlock);
		}
		
		if (block instanceof BlockTileEntity) {
			GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
