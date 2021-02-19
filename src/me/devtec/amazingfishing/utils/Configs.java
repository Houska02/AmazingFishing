package me.devtec.amazingfishing.utils;

import java.util.Arrays;

import me.devtec.amazingfishing.Loader;
import me.devtec.theapi.configapi.Config;

public class Configs {

	public static void loadConfig(){
		Loader.config=new Config("AmazingFishing/Config.yml");

		Loader.config.addDefault("Options.PointsManager", "USER");
		Loader.config.setComments("Options.PointsManager", Arrays.asList("# PointsManager types: VAULT, USER"));

		Loader.config.addDefault("Options.Enchants", true);
		
		Loader.config.addDefault("Options.Shop.SellFish", true);
		Loader.config.addDefault("Options.Shop.Sounds.Shop-BuyItem", true);
		Loader.config.addDefault("Options.Shop.Enabled", true);
		
		
		Loader.config.save();
	}
	public static void loadTranslation(){
		Loader.trans=new Config("AmazingFishing/Translations.yml");
		
		Loader.trans.addDefault("Prefix", "&bAmazingFishing &8&l» &7");
		Loader.trans.addDefault("Admin.ConfigReloaded", "&aReloaded configs");
		

		Loader.trans.addDefault("FishList.Topic", "&eList of fishes:");
		Loader.trans.addDefault("FishList.Format", "&7&l- %fish%");
		
		Loader.trans.addDefault("Words.Cod", "&7Cod");
		Loader.trans.addDefault("Words.Salmon", "&7Salmon");
		Loader.trans.addDefault("Words.PufferFish", "&7PufferFish");
		Loader.trans.addDefault("Words.TropicalFish", "&7TropicalFish");
		Loader.trans.addDefault("Words.Back", "&4Back");
		
		
		Loader.trans.save();
	}
	public static void loadGuis(){
		Loader.gui=new Config("AmazingFishing/GUI.yml");
		
		Loader.gui.addDefault("GUI.Help.Player.Title", "&5Help &7- &4 Player");
		Loader.gui.addDefault("GUI.Help.Player.Shop", "&bShop");
		Loader.gui.addDefault("GUI.Help.Player.Stats", "&bStats");
		Loader.gui.addDefault("GUI.Help.Player.List", "&bFish list");
		Loader.gui.addDefault("GUI.Help.Player.Enchant", "&bEnchant table");
		Loader.gui.addDefault("GUI.Help.Player.Bag", "&bBackPack");
		Loader.gui.addDefault("GUI.Help.Player.Quests", "&bQuests");
		Loader.gui.addDefault("GUI.Help.Player.Info", "&ePlayer section");
		

		Loader.gui.addDefault("GUI.Help.Admin.Title", "&5Help &7- &4 Admin");
		Loader.gui.addDefault("GUI.Help.Admin.Info", "&cAdmin section");
		Loader.gui.addDefault("GUI.Help.Admin.Reload", "&6Reload");
		Loader.gui.addDefault("GUI.Help.Admin.Tournament", "&6Tournament");
		

		Loader.gui.addDefault("GUI.SellShop.Title", "&eSell Shop");
		Loader.gui.addDefault("GUI.BuyShop.Title", "&eSell Shop");
		
		Loader.gui.save();
	}
	public static void loadShop(){
		Loader.shop=new Config("AmazingFishing/Config.yml");

		Loader.shop.addDefault("GUI.SellShop.Name", "&7TestingItem");
		Loader.shop.addDefault("GUI.SellShop.Icon", "STONE");
		Loader.shop.addDefault("GUI.SellShop.Lore", Arrays.asList("Fantastic lore!"));

		
		Loader.shop.addDefault("Items.1.Name", "&7TestingItem &e| %cost%");
		Loader.shop.addDefault("Items.1.Icon", "STONE");
		Loader.shop.addDefault("Items.1.Cost", 1);
		Loader.shop.addDefault("Items.1.Commands", Arrays.asList("say Super command"));
		Loader.shop.addDefault("Items.1.Messages", Arrays.asList("&6Some messages"));
		Loader.shop.addDefault("Items.1.Description", Arrays.asList("Fantastic lore!"));
		Loader.shop.addDefault("Items.1.Item.block.Material", "STONE");
		Loader.shop.addDefault("Items.1.Item.block.Amount", 5);
		Loader.shop.addDefault("Items.1.Item.block.Name", 5);
		Loader.shop.addDefault("Items.1.Item.block.Lore", 5);
		Loader.shop.addDefault("Items.1.Item.block.Unbreakable", true);
		Loader.shop.addDefault("Items.1.Item.block.HideEnchants", true);
		Loader.shop.addDefault("Items.1.Item.block.HideAttributes", true);
		Loader.shop.addDefault("Items.1.Item.block.Enchants", Arrays.asList("LURE:1"));
		
		Loader.shop.save();
	}
	public static void load(){
		loadConfig();
		loadTranslation();
		loadGuis();
		loadShop();
	}
}
