package varxs.TechPack.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import varxs.TechPack.main.Main;
import varxs.TechPack.support.ItemModelProvider;

public class ItemBase extends Item implements ItemModelProvider {
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
