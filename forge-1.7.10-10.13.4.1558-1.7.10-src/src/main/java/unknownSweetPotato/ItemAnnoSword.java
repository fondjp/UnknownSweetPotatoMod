package unknownSweetPotato;

import net.minecraft.item.ItemSword;

public class ItemAnnoSword extends ItemSword {

	public ItemAnnoSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}
