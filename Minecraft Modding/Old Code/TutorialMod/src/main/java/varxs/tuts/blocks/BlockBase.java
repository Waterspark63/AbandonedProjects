package varxs.tuts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import varxs.tuts.items.ItemModelProvider;
import varxs.tuts.main.Main;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;

	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
	}

	@Override
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);

	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
