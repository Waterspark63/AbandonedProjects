package varxs.tuts.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import varxs.tuts.items.ItemModelProvider;
import varxs.tuts.main.Main;

public class TutorialAxe extends ItemAxe implements ItemModelProvider {
	protected String name;

	public TutorialAxe(ToolMaterial material, String name) {
		super(material);
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
	public TutorialAxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
