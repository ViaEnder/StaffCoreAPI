package de.lacodev.rsystem;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	public void onEnable() {
		getLogger().warning("PLEASE DELETE THIS API, ITS INTEGRATED IN STAFFCORE WITH THE SAME PACKAGE NAMES!");

		getServer().getPluginManager().disablePlugin(this);
	}


}
