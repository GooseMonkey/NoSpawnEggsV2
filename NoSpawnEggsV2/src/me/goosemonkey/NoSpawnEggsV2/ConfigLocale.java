package me.goosemonkey.NoSpawnEggsV2;

import org.bukkit.plugin.java.JavaPlugin;

public class ConfigLocale extends ConfigAbstract
{
	public ConfigLocale(JavaPlugin inst)
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
		
	}

	@Override
	public String getName()
	{
		return "Locale";
	}
}
