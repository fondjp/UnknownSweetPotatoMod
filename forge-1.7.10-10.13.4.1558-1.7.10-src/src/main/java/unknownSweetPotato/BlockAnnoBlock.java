package unknownSweetPotato;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAnnoBlock extends Block {

	protected BlockAnnoBlock(String unlocalizedName) {
		super(Material.rock);
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName("unknownsweetpotato:" + unlocalizedName);
		setLightLevel(1.0F);
	}

}