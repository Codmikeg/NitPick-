package me.Codmikeg.nitpickplus;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ArmourRecipe {
	
	nitPickMain plugin;
	public ArmourRecipe(nitPickMain plugin){
		this.plugin = plugin;
	}
	
	public void init(){
		final ShapedRecipe chainmailChest = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1));
    	chainmailChest.shape("D D", "IEI", "GGG");
    	chainmailChest.setIngredient('D', Material.DIAMOND);
    	chainmailChest.setIngredient('I', Material.IRON_INGOT);
    	chainmailChest.setIngredient('E', Material.EMERALD);
    	chainmailChest.setIngredient('G', Material.GOLD_INGOT);
    	plugin.getServer().addRecipe(chainmailChest);
    	
        final ShapedRecipe chainmailLeggings = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1));
    	chainmailLeggings.shape("DED", "I I", "G G");
    	chainmailLeggings.setIngredient('D', Material.DIAMOND);
    	chainmailLeggings.setIngredient('I', Material.IRON_INGOT);
    	chainmailLeggings.setIngredient('E', Material.EMERALD);
    	chainmailLeggings.setIngredient('G', Material.GOLD_INGOT);
    	plugin.getServer().addRecipe(chainmailLeggings);
    	
        final ShapedRecipe chainmailBoots = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS, 1));
    	chainmailBoots.shape("   ", "I I", "G G");
    	chainmailBoots.setIngredient('I', Material.IRON_INGOT);
    	chainmailBoots.setIngredient('G', Material.GOLD_INGOT);
    	plugin.getServer().addRecipe(chainmailBoots);
    	
    	plugin.log.info("Recipes Added");
	}


}
