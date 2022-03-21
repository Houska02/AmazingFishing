package me.devtec.amazingfishing;

import java.util.UUID;

import org.bukkit.Bukkit;

import me.devtec.amazingfishing.utils.placeholders.Placeholders;
import me.devtec.amazingfishing.utils.placeholders.Placeholders.TopType;
import me.devtec.shared.placeholders.PlaceholderExpansion;
import me.devtec.shared.utility.StringUtils;

public class PAPISupport {
	public static void load() {
		Loader.reg=new PlaceholderExpansion("amazingfishing") {
			@Override
			public String apply(String identifier, UUID playerId) {
			   	
			   	/*
			   	 * Placeholders:
			   	 * 
			   	 * amazingfishing_<CO>_<Poznávadlo | TYP NĚČEHO>_<POZNÁVADLO | NÁZEV>_<POZNÁVADLO>
			   	 * 
			   	 * %amazingfishing_<tournament | treasures | shop | records | fish>_
			   	 *
			   	 * %amazingfishing_tournament_<played | placements | TOURNAMENT TYPE>
			   	 * %amazingfishing_tournament_<TOURNAMENT>_<played | placement>%
			   	 *
			   	 * %amazingfishing_treasures_<caught | TREASURE>
			   	 * %amazingfishing_treasures_<TREASURE>_caught%
			   	 * 
			   	 * %amazingfishing_shop_gained_<exp | money | points>%
			   	 *
			   	 *%amazingfishing_records_<TYP RYBY: COD,...>_<jméno ryby>_<Weight | lenght>%
			   	 *
			   	 *%amazingfishing_fish_<caught | eaten | sold>%
			   	 *%amazingfishing_fish_<TYP>_<caught | eaten | sold>%
			   	 *%amazingfishing_fish_<TYP>_<jméno ryby>_<caught | eaten | sold>%
			   	 */
			   	
					/*
					 * %amazingfishing_tournaments_wins_<1-4>%
					 * %amazingfishing_fish_caught_<1-4>%
					 */
			   	if(identifier.startsWith("tournaments_wins_")) {
			   		int pos = StringUtils.getInt(identifier.replace("tournaments_wins_", ""));
			   		return Placeholders.getTop(TopType.TOURNAMENTS_WINS, pos);
			   	}
			   	if(identifier.startsWith("fish_caught_")) {
			   		int pos = StringUtils.getInt(identifier.replace("fish_caught_", ""));
			   		return Placeholders.getTop(TopType.FISH_CAUGHT, pos);
			   	}
			       /*
			       Check if the player is online,
			       You should do this before doing anything regarding players
			        */
			       if(playerId == null){
			           return null;
			       }    	
			       if(identifier.startsWith("tournament")|| identifier.startsWith("treasures") || identifier.startsWith("shop") || identifier.startsWith("records")
			       		|| identifier.startsWith("fish")) {
			       	return Placeholders.getStatistics(Bukkit.getPlayer(playerId), identifier);
			       }


			       return null;
			}
		}.register();
	}
}
