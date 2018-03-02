package unknownSweetPotato;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSweetPotato extends CreativeTabs {

	// クリエイティブタブのアイコン画像や名称の登録クラス
	public CreativeTabSweetPotato(String type) {
		super(type);
	}

	@Override
	public String getTranslatedTabLabel() {
		return "Sweet Potato Mod";
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(UnknownSweetPotatoMod.sweet_potato_block);
	}

}