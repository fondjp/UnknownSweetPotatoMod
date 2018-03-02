package unknownSweetPotato;

import net.minecraft.item.ItemPickaxe;

public class ItemAnnoPickaxe extends ItemPickaxe {

	public ItemAnnoPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}
