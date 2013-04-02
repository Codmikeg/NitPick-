package me.Codmikeg.nitpickplus;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class nitPickMain extends JavaPlugin{
	public final Logger log = Logger.getLogger("Minecraft");
	private ArmourRecipe ar;
	
	@Override
	public void onEnable(){
        getServer().getPluginManager().registerEvents(new nitListener(this), this);
		ar = new ArmourRecipe(this);
		ar.init();
        PluginDescriptionFile pdfFile = this.getDescription();
        this.log.info(pdfFile.getName() + " " + " v" + pdfFile.getVersion() + " : Has been enabled!");
        
        
	}
	@Override
	public void onDisable(){
		this.getLogger().info("Plugin has been disabled!");
    	getServer().clearRecipes();
    	this.getLogger().info("Recipes Cleared");
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(commandLabel.equalsIgnoreCase("test")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				player.sendMessage("It works!");
			}
			else{
				log.warning("You must be a player!");
			}
			
		}
		return false;
	}

}
