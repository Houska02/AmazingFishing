package me.devtec.amazingfishing.utils;

import me.devtec.amazingfishing.Loader;
import me.devtec.amazingfishing.gui.Shop.ShopType;

public class Trans {
	public static String s(String s) {
		return Loader.trans.getString(s);
	}
	public static String help_player_title() {
		return Loader.gui.getString("GUI.Help.Player.Title");
	}
	public static String help_player_info() {
		return Loader.gui.getString("GUI.Help.Player.Info");
	}
	public static String help_player_shop() {
		return Loader.gui.getString("GUI.Help.Player.Title");
	}	
	public static String help_player_stats() {
		return Loader.gui.getString("GUI.Help.Player.Stats");
	}
	public static String help_player_list() {
		return Loader.gui.getString("GUI.Help.Player.List");
	}
	public static String help_player_enchants() {
		return Loader.gui.getString("GUI.Help.Player.Enchant");
	}
	public static String help_player_bag() {
		return Loader.gui.getString("GUI.Help.Player.Bag");
	}
	public static String help_player_quests() {
		return Loader.gui.getString("GUI.Help.Player.Quests");
	}
	
	
	public static String help_admin_info() {
		return Loader.gui.getString("GUI.Help.Admin.Infp");
	}
	public static String help_admin_title() {
		return Loader.gui.getString("GUI.Help.Admin.Title");
	}
	public static String help_admin_reload() {
		return Loader.gui.getString("GUI.Help.Admin.Reload");
	}
	public static String help_admin_tournament() {
		return Loader.gui.getString("GUI.Help.Admin.Tournament");
	}
	
	public static String shop_title(ShopType type) {
		if(type==ShopType.Sell)
			return Loader.gui.getString("GUI.SellShop.Title");
		else
			return Loader.gui.getString("GUI.BuyShop.Title");
	}
	
	public static String words_cod() {
		return Loader.trans.getString("Words.Cod");
	}
	public static String words_salmon() {
		return Loader.trans.getString("Words.Salmon");
	}
	public static String words_pufferfish() {
		return Loader.trans.getString("Words.PufferFish");
	}
	public static String words_tropicalfish() {
		return Loader.trans.getString("Words.TropicalFish");
	}
	public static String words_back() {
		return Loader.trans.getString("Words.TropicalFish");
	}
}
