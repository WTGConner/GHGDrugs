package nl.gewoonhdgaming.drugs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
		
		@Override
		public void onEnable() {
			loadConfiguration();
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.GOLD + "-------{De Sexuele Plugin}------");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.YELLOW + "     Created by: WTGConner     ");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.YELLOW + "    Plugin Status: Enabled     ");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.GOLD + "--------------------------------");
		}
		
		@Override
		public void onDisable() {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.GOLD + "-------{De Sexuele Plugin}------");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.YELLOW + "     Created by: WTGConner     ");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.YELLOW + "    Plugin Status: Disabled    ");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Sex] " + ChatColor.GOLD + "--------------------------------");
		}

	    public void loadConfiguration(){
	        getConfig().options().copyDefaults(true);
	        getConfig().addDefault("key.default", "Dont_Remove_Me!");
	        saveConfig();
	        getLogger().info("Configuratie Herladen");
	        Bukkit.broadcastMessage("De Sexuele Plugin is geladen");
	}
}