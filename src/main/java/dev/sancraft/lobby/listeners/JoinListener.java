package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.config;
import dev.sancraft.lobby.main;
import dev.sancraft.lobby.navbar;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (main.cooldown.contains(player)) main.cooldown.remove(player);
        Location spawn = new Location(player.getWorld(), (Double) main.getValue(config.SETTINGS_SPAWN_X), (Double) main.getValue(config.SETTINGS_SPAWN_Y), (Double) main.getValue(config.SETTINGS_SPAWN_Z));
        spawn.setPitch(Float.parseFloat((String) main.getValue(config.SETTINGS_SPAWN_PITCH)));
        spawn.setYaw(Float.parseFloat((String) main.getValue(config.SETTINGS_SPAWN_YAW)));
        player.teleport(spawn);
        player.setGameMode(GameMode.ADVENTURE);
        player.addPotionEffect(new PotionEffect((PotionEffectType) main.getValue(config.SETTINGS_EFFECT_TYPE), (Integer) main.getValue(config.SETTINGS_EFFECT_DURATION), (Integer) main.getValue(config.SETTINGS_EFFECT_AMPLIFIER), true, (Boolean) main.getValue(config.SETTINGS_EFFECT_PARTICLES)));
        Inventory inv = player.getInventory();
        inv.clear();
        navbar.generateNavbar(inv);
    }
}
