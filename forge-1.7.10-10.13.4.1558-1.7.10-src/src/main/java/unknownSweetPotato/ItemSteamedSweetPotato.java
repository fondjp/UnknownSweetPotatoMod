package unknownSweetPotato;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemSteamedSweetPotato extends ItemFood {

	private PotionEffect[] effects;

	public ItemSteamedSweetPotato(String unlocalizedName, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_,
			PotionEffect... effects) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
		this.effects = effects;
	}

}