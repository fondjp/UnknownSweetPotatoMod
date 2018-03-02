package unknownSweetPotato;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSweetPotatoBlock extends Block {

	protected BlockSweetPotatoBlock(String unlocalizedName) {
		super(Material.rock);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName("unknownsweetpotato:" + unlocalizedName);
		setLightLevel(1.0F);
	}

}