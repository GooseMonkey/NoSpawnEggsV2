package me.goosemonkey.NoSpawnEggsV2;

import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnEggs extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		
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
