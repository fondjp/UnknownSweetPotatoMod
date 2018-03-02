package unknownSweetPotato;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUnknownSweetPotato extends CreativeTabs {

	// クリエイティブタブのアイコン画像や名称の登録クラス
	public CreativeTabUnknownSweetPotato(String type) {
		super(type);
	}

	@Override
	public String getTranslatedTabLabel() {
		return "Unknown Sweet Potato Mod";
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(UnknownSweetPotatoMod.anno_block);
	}

}