package me.goosemonkey.NoSpawnEggsV2;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnEggs extends JavaPlugin
{
	static ConfigMain mainConfig;
	static ConfigLocale localeConfig;
	
	@Override
	public void onEnable()
	{
		NoSpawnEggs.mainConfig = new ConfigMain(this);
		NoSpawnEggs.localeConfig = new ConfigLocale(this);
	}
	
	/**
	 * Registers a listener after checking that the plugin version allows it
	 * @param required Minimum plugin version this listener needs to work
	 * @param listener The listener
	 */
	void registerListenerClass(PluginVersion required, Listener listener)
	{
		PluginVersion current = NoSpawnEggs.getVersion();
		
		if (required == PluginVersion.FULL && current != PluginVersion.FULL)
			return;
		
		if (required == PluginVersion.MODERATE && current == PluginVersion.LIGHT)
			return;
		
		this.getServer().getPluginManager().registerEvents(listener, this);
	}
	
	/**
	 * Get the plugin's main configuration
	 * @return FileConfiguration for MainConfig.yml
	 */
	public static FileConfiguration getMainConfig()
	{
		return mainConfig.getConfig();
	}

	/**
	 * Get the plugin's locale configuration
	 * @return FileConfiguration for Locale.yml
	 */
	public static FileConfiguration getLocaleConfig()
	{
		return localeConfig.getConfig();
	}
	
	/**
	 * Gets the current version of the plugin, change this to distribute different versions
	 * @return Full, Moderate, or Light
	 */
	public static PluginVersion getVersion()
	{
		return PluginVersion.FULL;
	}
	
	public enum PluginVersion
	{
		FULL, MODERATE, LIGHT
	}
}
