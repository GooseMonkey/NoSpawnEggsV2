package me.goosemonkey.NoSpawnEggsV2;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnEggs extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		
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
