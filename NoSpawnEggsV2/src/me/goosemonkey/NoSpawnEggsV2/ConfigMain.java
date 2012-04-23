package me.goosemonkey.NoSpawnEggsV2;

import me.goosemonkey.NoSpawnEggsV2.NoSpawnEggs.PluginVersion;

import org.bukkit.plugin.java.JavaPlugin;

public class ConfigMain extends ConfigAbstract
{
	public ConfigMain(JavaPlugin inst)
	{
		super(inst);
	}

	@Override
	public String getHeader()
	{
		return "";
	}

	@Override
	public void setDefaultValues()
	{
		this.checkSet("configVersion", 2, PluginVersion.LIGHT);
	}

	@Override
	public String getName()
	{
		return "Config";
	}
}
