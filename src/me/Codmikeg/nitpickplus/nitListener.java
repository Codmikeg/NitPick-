package me.Codmikeg.nitpickplus;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class nitListener implements Listener {
	nitPickMain plugin;
	
	public nitListener(nitPickMain plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onLavaDamage(EntityDamageEvent event){
		Entity e = event.getEntity();
		
		lavaGod.checkArmour(e, event);
		
		
	}
}
