package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.readConfig;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntityType().equals(EntityType.PLAYER)) {
            Player player = (Player) event.getEntity();
            if (player.getLocation().getY() <= 0) {
                Location spawn = readConfig.getLocation("settings.spawn", player);
                player.teleport(spawn);
                event.setCancelled(true);
            }
        }
    }
}
