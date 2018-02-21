package unknownSweetPotato;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "unknownsweetpotatomod", name = "Unknown Sweet Potato Mod", version = "1.0.0")
public class UnknownSweetPotatoMod {

	public static final CreativeTabs tabSweetPotatoMod = new CreativeTabSweetPotato("sweetPotatoMod");

	public static Item magic_sugar;
	public static Item sweet_potato;
	public static Item steamed_sweet_potato;
	public static Item anno_sweet_potato;
	public static Item unknown_sweet_potato;
	public static Item anno_pickaxe;
	public static Item anno_axe;
	public static Item anno_shovel;
	public static Item anno_hoe;
	public static Item anno_sword;

	public static Block sweet_potato_block;
	public static Block anno_block;

	//("マテリアルの名前", 相当ツール（0で木、3でダイヤ）, 耐久性, 効率, 対エンティティダメージ, エンチャントの優位性);
	public static ToolMaterial materialAnnoPickaxe = EnumHelper.addToolMaterial("materialAnnoPickaxe", 3, 2000, 10.0F, 4.0F, 15);
	public static ToolMaterial materialAnnoAxe = EnumHelper.addToolMaterial("materialAnnoAxe", 3, 2000, 10.0F, 4.0F, 15);
	public static ToolMaterial materialAnnoShovel = EnumHelper.addToolMaterial("materialAnnoShovel", 3, 2000, 10.0F, 4.0F, 15);
	public static ToolMaterial materialAnnoHoe = EnumHelper.addToolMaterial("materialAnnoHoe", 3, 2000, 10.0F, 4.0F, 15);
	public static ToolMaterial materialAnnoSword = EnumHelper.addToolMaterial("materialAnnoSword", 3, 2000, 10.0F, 5.0F, 15);

	public static EntityVillagerFondjp villagerFondjp;
	public static int villagerFondjpProfession = 40;
	@SidedProxy(clientSide = "unknownSweetPotato.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		magic_sugar = new ItemMagicSugar("magic_sugar");
		sweet_potato = new ItemSweetPotato("sweet_potato", 2, 1.0F, false);
		steamed_sweet_potato = new ItemSteamedSweetPotato("steamed_sweet_potato", 8, 1.0F, true);
		anno_sweet_potato = new ItemAnnoSweetPotato("anno_sweet_potato", 6, 1.0F, true);
		unknown_sweet_potato = new ItemUnknownSweetPotato("unknown_sweet_potato", 12, 1.0F, false);
		anno_pickaxe = new ItemAnnoPickaxe("anno_pickaxe", materialAnnoPickaxe);
		anno_axe = new ItemAnnoAxe("anno_axe", materialAnnoAxe);
		anno_shovel = new ItemAnnoShovel("anno_shovel", materialAnnoShovel);
		anno_hoe = new ItemAnnoHoe("anno_hoe", materialAnnoHoe);
		anno_sword = new ItemAnnoSword("anno_sword", materialAnnoSword);
		sweet_potato_block = new BlockSweetPotatoBlock("sweet_potato_block");
		anno_block = new BlockAnnoBlock("anno_block");
		villagerFondjp = new EntityVillagerFondjp();

		GameRegistry.registerItem(magic_sugar, "magic_sugar");
		GameRegistry.registerItem(sweet_potato, "sweet_potato");
		GameRegistry.registerItem(steamed_sweet_potato, "steamed_sweet_potato");
		GameRegistry.registerItem(anno_sweet_potato, "anno_sweet_potato");
		GameRegistry.registerItem(unknown_sweet_potato, "unknown_sweet_potato");
		GameRegistry.registerItem(anno_pickaxe, "anno_pickaxe");
		GameRegistry.registerItem(anno_axe, "anno_axe");
		GameRegistry.registerItem(anno_shovel, "anno_shovel");
		GameRegistry.registerItem(anno_hoe, "anno_hoe");
		GameRegistry.registerItem(anno_sword, "anno_sword");
		GameRegistry.registerBlock(sweet_potato_block, "sweet_potato_block");
		GameRegistry.registerBlock(anno_block, "anno_block");
		VillagerRegistry.instance().registerVillagerId(villagerFondjpProfession);
		proxy.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.registry();
	}

}