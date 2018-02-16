package fr.mrlygikas.com.youtube;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.mrlygikas.com.youtube.cmd.CMDKills;
import fr.mrlygikas.com.youtube.cmd.CMDTpa;
import fr.mrlygikas.com.youtube.events.Events;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		System.out.println("Le plugin est active !");
		registersCommands();
		registersListeners();
	}
	
	private void registersListeners() {
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new Events(), this);
	}                                 

	private void registersCommands() {
		getCommand("kills").setExecutor(new CMDKills());
		getCommand("tpa").setExecutor(new CMDTpa());
	}

	@Override
	public void onDisable() {
		System.out.println("Le plugin est desactive !");
	}
	
	public static Main getInstance() {
		return instance;
	}
	 

}
