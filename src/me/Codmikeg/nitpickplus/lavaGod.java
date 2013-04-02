package me.Codmikeg.nitpickplus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;

public class lavaGod {
	nitPickMain plugin;
	public lavaGod(nitPickMain plugin){
		this.plugin = plugin;
	}
	public static void checkArmour(Entity e, Event event){
		if(e instanceof Player){
        	Player player = (Player)e;
        	ItemStack helmet = player.getInventory().getHelmet();
        	ItemStack chest = player.getInventory().getChestplate();
        	ItemStack pants = player.getInventory().getLeggings();
        	ItemStack boots = player.getInventory().getBoots();
	        
	        if(((EntityDamageEvent) event).getCause() == EntityDamageEvent.DamageCause.DROWNING){
	        	Bukkit.broadcastMessage("FUUUCK");
	        	if(helmet != null && helmet.getType() != Material.AIR){
	        		Bukkit.broadcastMessage("HELMET ON NOT GLASSS");
		            if(helmet.getType() == Material.GLASS){
		            	Bukkit.broadcastMessage("CANCELLING EVENT");
		                ((EntityDamageEvent) event).setCancelled(true);
		               
		            }
		            else{
			        	Bukkit.broadcastMessage("KILL THE FUCKER");
		            }
	        	}
	        }
	        if(((EntityDamageEvent) event).getCause() == EntityDamageEvent.DamageCause.LAVA || ((EntityDamageEvent) event).getCause() == EntityDamageEvent.DamageCause.FIRE_TICK || ((EntityDamageEvent) event).getCause() == EntityDamageEvent.DamageCause.FIRE){
	        	if(boots != null && boots.getType() != Material.AIR){
	        		if(boots.getType() == Material.CHAINMAIL_BOOTS){
	        			if(pants != null && pants.getType() != Material.AIR){
		        			if(pants.getType() == Material.CHAINMAIL_LEGGINGS){
		        				if(chest != null && chest.getType() != Material.AIR){
			        				if(chest.getType() == Material.CHAINMAIL_CHESTPLATE){
			        					if(helmet != null && helmet.getType() != Material.AIR){
				        					if(helmet.getType() == Material.GLASS){
				        						((EntityDamageEvent) event).setCancelled(true);
				        						if(((EntityEvent) event).getEntity().getMaxFireTicks() > 1){
				        							((EntityEvent) event).getEntity().setFireTicks(0);
				        						}
				        					}
			        					}
			        				}
		        				}
		        			}
		        		}
	        		}
	        	}
	        }
		}
	}
}
