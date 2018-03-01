package unknownSweetPotato;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "unknownsweetpotatomod", name = "Unknown Sweet Potato Mod", version = "1.0.0")
public class UnknownSweetPotatoMod {

	public static final CreativeTabs tabSweetPotatoMod = new CreativeTabSweetPotato("sweetPotatoMod");

	public static Item magic_sugar;
	public static Item sweet_potato;
	public static Item steamed_sweet_potato;
	public static Item anno_sweet_potato;
	public static Item steamed_anno_sweet_potato;
	public static Item unknown_sweet_potato;
	public static Item anno_pickaxe;
	public static Item anno_axe;
	public static Item anno_shovel;
	public static Item anno_hoe;
	public static Item anno_sword;

	public static Block sweet_potato_block;
	public static Block anno_block;

	// ("マテリアルの名前", 相当ツール（0で木、3でダイヤ）, 耐久性, 効率, 対エンティティダメージ, エンチャントの優位性);
	public static ToolMaterial materialAnnoPickaxe = EnumHelper.addToolMaterial("materialAnnoPickaxe", 3, 2000, 10.0F,
			4.0F, 15);
	public static ToolMaterial materialAnnoAxe = EnumHelper.addToolMaterial("materialAnnoAxe", 3, 2000, 10.0F, 4.0F,
			15);
	public static ToolMaterial materialAnnoShovel = EnumHelper.addToolMaterial("materialAnnoShovel", 3, 2000, 10.0F,
			4.0F, 15);
	public static ToolMaterial materialAnnoHoe = EnumHelper.addToolMaterial("materialAnnoHoe", 3, 2000, 10.0F, 4.0F,
			15);
	public static ToolMaterial materialAnnoSword = EnumHelper.addToolMaterial("materialAnnoSword", 3, 2000, 10.0F, 6.0F,
			15);

	public static EntityVillagerFondjp01 villagerFondjp01;
	public static EntityVillagerFondjp02 villagerFondjp02;
	public static int villagerFondjp01Profession = 401;
	public static int villagerFondjp02Profession = 402;
	@SidedProxy(clientSide = "unknownSweetPotato.ClientProxy")
	public static CommonProxy proxy;

	public static Achievement achievementPotato;
	public static Achievement achievementSweetPotato;
	public static Achievement achievementSteamedSweetPotato;
	public static Achievement achievementAnnoSweetPotato;
	public static Achievement achievementSteamedAnnoSweetPotato;
	public static Achievement achievementUnknownSweetPotato;
	public static Achievement achievementSweetPotatoBlock;
	public static Achievement achievementAnnoBlock;
	public static Achievement achievementUSPAte;
	public static Achievement achievementUSPLucky;
	public static Achievement achievementUSPObsidian;
	public static Achievement achievementUSPEncounter;
	public static Achievement achievementUSPEncounterComplete;
	public static Achievement achievementUSPVeryLucky;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		magic_sugar = new ItemMagicSugar("magic_sugar");
		sweet_potato = new ItemSweetPotato("sweet_potato", 2, 1.0F, false);
		steamed_sweet_potato = new ItemSteamedSweetPotato("steamed_sweet_potato", 7, 1.0F, true);
		anno_sweet_potato = new ItemAnnoSweetPotato("anno_sweet_potato", 5, 1.0F, false);
		steamed_anno_sweet_potato = new ItemSteamedAnnoSweetPotato("steamed_anno_sweet_potato", 9, 1.0F, true);
		unknown_sweet_potato = new ItemUnknownSweetPotato("unknown_sweet_potato", 7, 1.0F, false);
		anno_pickaxe = new ItemAnnoPickaxe("anno_pickaxe", materialAnnoPickaxe);
		anno_axe = new ItemAnnoAxe("anno_axe", materialAnnoAxe);
		anno_shovel = new ItemAnnoShovel("anno_shovel", materialAnnoShovel);
		anno_hoe = new ItemAnnoHoe("anno_hoe", materialAnnoHoe);
		anno_sword = new ItemAnnoSword("anno_sword", materialAnnoSword);
		sweet_potato_block = new BlockSweetPotatoBlock("sweet_potato_block");
		anno_block = new BlockAnnoBlock("anno_block");
		villagerFondjp01 = new EntityVillagerFondjp01();
		villagerFondjp02 = new EntityVillagerFondjp02();

		GameRegistry.registerItem(magic_sugar, "magic_sugar");
		GameRegistry.registerItem(sweet_potato, "sweet_potato");
		GameRegistry.registerItem(steamed_sweet_potato, "steamed_sweet_potato");
		GameRegistry.registerItem(anno_sweet_potato, "anno_sweet_potato");
		GameRegistry.registerItem(steamed_anno_sweet_potato, "steamed_anno_sweet_potato");
		GameRegistry.registerItem(unknown_sweet_potato, "unknown_sweet_potato");
		GameRegistry.registerItem(anno_pickaxe, "anno_pickaxe");
		GameRegistry.registerItem(anno_axe, "anno_axe");
		GameRegistry.registerItem(anno_shovel, "anno_shovel");
		GameRegistry.registerItem(anno_hoe, "anno_hoe");
		GameRegistry.registerItem(anno_sword, "anno_sword");
		GameRegistry.registerBlock(sweet_potato_block, "sweet_potato_block");
		GameRegistry.registerBlock(anno_block, "anno_block");
		VillagerRegistry.instance().registerVillagerId(villagerFondjp01Profession);
		VillagerRegistry.instance().registerVillagerId(villagerFondjp02Profession);
		VillagerRegistry.instance().registerVillageTradeHandler(villagerFondjp01Profession, villagerFondjp01);
		VillagerRegistry.instance().registerVillageTradeHandler(villagerFondjp02Profession, villagerFondjp02);

		proxy.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.registry();

		achievementPotato = new Achievement("achievement.potato", "potato", -2, 0, new ItemStack(Items.potato), null)
				.initIndependentStat().registerStat();
		achievementSweetPotato = new Achievement("achievement.sweetPotato", "sweetPotato", 0, 0,
				new ItemStack(this.sweet_potato), achievementPotato).registerStat();
		achievementSteamedSweetPotato = new Achievement("achievement.steamedSweetPotato", "steamedSweetPotato", 0, -2,
				new ItemStack(this.steamed_sweet_potato), achievementSweetPotato).registerStat();
		achievementAnnoSweetPotato = new Achievement("achievement.annoSweetPotato", "annoSweetPotato", 2, -1,
				new ItemStack(this.anno_sweet_potato), achievementSweetPotato).registerStat();
		achievementSteamedAnnoSweetPotato = new Achievement("achievement.steamedAnnoSweetPotato",
				"steamedAnnoSweetPotato", 2, -3, new ItemStack(this.steamed_anno_sweet_potato),
				achievementAnnoSweetPotato).registerStat();
		achievementUnknownSweetPotato = new Achievement("achievement.unknownSweetPotato", "unknownSweetPotato", -2, 3,
				new ItemStack(this.unknown_sweet_potato), achievementAnnoSweetPotato).registerStat();
		achievementSweetPotatoBlock = new Achievement("achievement.sweetPotatoBlock", "sweetPotatoBlock", 4, -2,
				this.sweet_potato_block, achievementSweetPotato).registerStat();
		achievementAnnoBlock = new Achievement("achievement.annoBlock", "annoBlock", 4, -1, this.anno_block,
				achievementAnnoSweetPotato).registerStat();
		achievementUSPAte = new Achievement("achievement.USPAte", "USPAte", -1, 4, this.unknown_sweet_potato,
				achievementUnknownSweetPotato).registerStat();
		achievementUSPLucky = new Achievement("achievement.USPLucky", "USPLucky", 1, 4, Items.golden_apple,
				achievementUSPAte).registerStat();
		achievementUSPObsidian = new Achievement("achievement.USPObsidian", "USPObsidian", 1, 5, Blocks.obsidian,
				achievementUSPAte).registerStat();
		achievementUSPEncounter = new Achievement("achievement.USPEncounter", "USPEncounter", 1, 6, Items.emerald,
				achievementUSPAte).registerStat();
		achievementUSPEncounterComplete = new Achievement("achievement.USPEncounterComplete", "USPEncounterComplete", 3,
				6, Blocks.emerald_block, achievementUSPEncounter).registerStat();
		achievementUSPVeryLucky = new Achievement("achievement.USPVeryLucky", "USPVeryLucky", 2, 7,
				new ItemStack(Items.golden_apple, 1), achievementUSPAte).setSpecial().registerStat();

		AchievementPage.registerAchievementPage(new AchievementPage("Unknown Sweet Potato",
				new Achievement[] { achievementPotato, achievementSweetPotato, achievementSteamedSweetPotato,
						achievementAnnoSweetPotato, achievementSteamedAnnoSweetPotato, achievementUnknownSweetPotato,
						achievementSweetPotatoBlock, achievementAnnoBlock, achievementUSPAte, achievementUSPLucky,
						achievementUSPObsidian, achievementUSPEncounter, achievementUSPEncounterComplete ,achievementUSPVeryLucky }));

		FMLCommonHandler.instance().bus().register(new AchievementOnEvent());
	}

}