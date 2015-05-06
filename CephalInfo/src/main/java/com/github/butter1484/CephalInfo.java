package com.github.butter1484;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class CephalInfo extends JavaPlugin
{
public void onEnable(){
	
}

public void onDisable(){
	
}

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	Player player = (Player) sender;
	if(cmd.getName().equalsIgnoreCase("website") && player instanceof Player){
		player.sendMessage(ChatColor.GREEN + "Check out our website at " + ChatColor.YELLOW + "http://cephal.enjin.com/");
		return true;
	}
	
	
	return false;
	
}
}
