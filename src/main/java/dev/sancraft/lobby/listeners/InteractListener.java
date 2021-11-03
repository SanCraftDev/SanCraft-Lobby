package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.main;
import dev.sancraft.lobby.readConfig;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.io.IOException;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) throws IOException {
        Player player = event.getPlayer();
        if (player.getGameMode().equals(GameMode.CREATIVE)) return;
        if (main.cooldown.contains(player)) return;
        main.cooldown.add(player);
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main.getInstance(), new Runnable() {
            public void run() {
                main.cooldown.remove(player);
            }
        }, readConfig.getLong("settings.cooldown"));
        Location psPosition = readConfig.getLocation("navbar.one", player);
        Location spawnPosition = readConfig.getLocation("navbar.three", player);
        Location testPosition = readConfig.getLocation("navbar.seven", player);
        Location a24Position = readConfig.getLocation("navbar.nine", player);
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.GRASS_BLOCK)) {
                main.connect(player, "ps");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BEDROCK)) {
                main.connect(player, "one");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BLAZE_POWDER)) {
                player.performCommand("morph");
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.COMMAND_BLOCK)) {
                main.connect(player, "test");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BOOKSHELF)) {
                main.connect(player, "a24");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.FEATHER)) {
                player.performCommand("fly");
            }
        } else if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.GRASS_BLOCK)) {
                player.teleport(psPosition);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BEDROCK)) {
                player.teleport(spawnPosition);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BLAZE_POWDER)) {
                player.performCommand("morph");
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.COMMAND_BLOCK)) {
                player.teleport(testPosition);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.BOOKSHELF)) {
                player.teleport(a24Position);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            } else if (player.getInventory().getItemInMainHand().getType().equals(Material.FEATHER)) {
                player.performCommand("fly");
            }
        }
    }

}
