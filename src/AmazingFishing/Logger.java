package AmazingFishing;

import org.bukkit.Bukkit;

import me.DevTec.AmazingFishing.Loader;

public class Logger {
	public static void info(String p, String fish, String type, double length, double weight) {
		if(Loader.c.getBoolean("Options.LogCaughtFishToConsole")) {
			if(Loader.c.exists("Types."+type+"."+fish+".Name"))fish=Loader.c.getString("Types."+type+"."+fish+".Name");
			Loader.msgCmd(p+" caught "+fish+" ("+length+"cm, "+weight+"kg)", Bukkit.getConsoleSender());
			//[Owner] Straiker123 caught Shark (184.45cm, 11.08kg) - in console
		}
	}
}
