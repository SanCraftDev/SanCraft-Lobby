package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.config;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import static dev.sancraft.lobby.main.getValue;

public class DamageListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntityType().equals(EntityType.PLAYER)) {
            Player player = (Player) event.getEntity();
            if (player.getLocation().getY() <= 0) {
                Location spawn = new Location(player.getWorld(), (Double) getValue(config.SETTINGS_SPAWN_X), (Double) getValue(config.SETTINGS_SPAWN_Y), (Double) getValue(config.SETTINGS_SPAWN_Z));
                spawn.setPitch(Float.parseFloat((String) getValue(config.SETTINGS_SPAWN_PITCH)));
                spawn.setYaw(Float.parseFloat((String) getValue(config.SETTINGS_SPAWN_YAW)));
                player.teleport(spawn);
                event.setCancelled(true);
            }
        }
    }
}
