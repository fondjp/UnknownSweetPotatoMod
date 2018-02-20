package unknownSweetPotato;

import net.minecraft.item.ItemSpade;

public class ItemAnnoShovel extends ItemSpade {

	public ItemAnnoShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}
