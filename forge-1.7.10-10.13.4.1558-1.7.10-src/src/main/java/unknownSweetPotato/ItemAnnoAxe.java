package unknownSweetPotato;

import net.minecraft.item.ItemAxe;

public class ItemAnnoAxe extends ItemAxe {

	public ItemAnnoAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}
