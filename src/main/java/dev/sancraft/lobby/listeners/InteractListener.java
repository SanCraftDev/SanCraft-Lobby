package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.config;
import dev.sancraft.lobby.main;
import dev.sancraft.lobby.navbar;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

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
        }, (Long) main.getValue(config.SETTINGS_COOLDOWN));
        if (event.getAction().isRightClick()) {
            if ((Boolean) main.getValue(config.NAVBAR_ONE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_ONE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_ONE_TYPE))) {
                    if (main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_ONE_COMMAND));
                    if (main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_ONE_MESSAGE));
                    if (main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_ONE_SERVER));
                    if (main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_ONE_X), (Double) main.getValue(config.NAVBAR_ONE_Y), (Double) main.getValue(config.NAVBAR_ONE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_ONE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_ONE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_TWO_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_TWO_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_TWO_TYPE))) {
                    if (main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_TWO_COMMAND));
                    if (main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_TWO_MESSAGE));
                    if (main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_TWO_SERVER));
                    if (main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_TWO_X), (Double) main.getValue(config.NAVBAR_TWO_Y), (Double) main.getValue(config.NAVBAR_TWO_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_TWO_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_TWO_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_THREE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_THREE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_THREE_TYPE))) {
                    if (main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_THREE_COMMAND));
                    if (main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_THREE_MESSAGE));
                    if (main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_THREE_SERVER));
                    if (main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_THREE_X), (Double) main.getValue(config.NAVBAR_THREE_Y), (Double) main.getValue(config.NAVBAR_THREE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_THREE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_THREE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_FOUR_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_FOUR_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_FOUR_TYPE))) {
                    if (main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_FOUR_COMMAND));
                    if (main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_FOUR_MESSAGE));
                    if (main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_FOUR_SERVER));
                    if (main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_FOUR_X), (Double) main.getValue(config.NAVBAR_FOUR_Y), (Double) main.getValue(config.NAVBAR_FOUR_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_FOUR_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_FOUR_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_FIVE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_FIVE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_FIVE_TYPE))) {
                    if (main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_FIVE_COMMAND));
                    if (main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_FIVE_MESSAGE));
                    if (main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_FIVE_SERVER));
                    if (main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_FIVE_X), (Double) main.getValue(config.NAVBAR_FIVE_Y), (Double) main.getValue(config.NAVBAR_FIVE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_FIVE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_FIVE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_SIX_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_SIX_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_SIX_TYPE))) {
                    if (main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_SIX_COMMAND));
                    if (main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_SIX_MESSAGE));
                    if (main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_SIX_SERVER));
                    if (main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_SIX_X), (Double) main.getValue(config.NAVBAR_SIX_Y), (Double) main.getValue(config.NAVBAR_SIX_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_SIX_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_SIX_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_SEVEN_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_SEVEN_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_SEVEN_TYPE))) {
                    if (main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_SEVEN_COMMAND));
                    if (main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_SEVEN_MESSAGE));
                    if (main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_SEVEN_SERVER));
                    if (main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_SEVEN_X), (Double) main.getValue(config.NAVBAR_SEVEN_Y), (Double) main.getValue(config.NAVBAR_SEVEN_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_SEVEN_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_SEVEN_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_EIGHT_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_EIGHT_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_EIGHT_TYPE))) {
                    if (main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_EIGHT_COMMAND));
                    if (main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_EIGHT_MESSAGE));
                    if (main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_EIGHT_SERVER));
                    if (main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_EIGHT_X), (Double) main.getValue(config.NAVBAR_EIGHT_Y), (Double) main.getValue(config.NAVBAR_EIGHT_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_EIGHT_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_EIGHT_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_NINE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_NINE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_NINE_TYPE))) {
                    if (main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_NINE_COMMAND));
                    if (main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_NINE_MESSAGE));
                    if (main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_NINE_SERVER));
                    if (main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_NINE_X), (Double) main.getValue(config.NAVBAR_NINE_Y), (Double) main.getValue(config.NAVBAR_NINE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_NINE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_NINE_YAW)));
                        player.teleport(teleport);
                    }
                }
        } else {
            if ((Boolean) main.getValue(config.NAVBAR_ONE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_ONE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_ONE_TYPE))) {
                    if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_ONE_COMMAND));
                    if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_ONE_MESSAGE));
                    if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_ONE_SERVER));
                    if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_ONE_X), (Double) main.getValue(config.NAVBAR_ONE_Y), (Double) main.getValue(config.NAVBAR_ONE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_ONE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_ONE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_TWO_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_TWO_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_TWO_TYPE))) {
                    if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_TWO_COMMAND));
                    if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_TWO_MESSAGE));
                    if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_TWO_SERVER));
                    if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_TWO_X), (Double) main.getValue(config.NAVBAR_TWO_Y), (Double) main.getValue(config.NAVBAR_TWO_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_TWO_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_TWO_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_THREE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_THREE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_THREE_TYPE))) {
                    if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_THREE_COMMAND));
                    if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_THREE_MESSAGE));
                    if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_THREE_SERVER));
                    if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_THREE_X), (Double) main.getValue(config.NAVBAR_THREE_Y), (Double) main.getValue(config.NAVBAR_THREE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_THREE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_THREE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_FOUR_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_FOUR_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_FOUR_TYPE))) {
                    if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_FOUR_COMMAND));
                    if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_FOUR_MESSAGE));
                    if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_FOUR_SERVER));
                    if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_FOUR_X), (Double) main.getValue(config.NAVBAR_FOUR_Y), (Double) main.getValue(config.NAVBAR_FOUR_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_FOUR_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_FOUR_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_FIVE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_FIVE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_FIVE_TYPE))) {
                    if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_FIVE_COMMAND));
                    if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_FIVE_MESSAGE));
                    if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_FIVE_SERVER));
                    if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_FIVE_X), (Double) main.getValue(config.NAVBAR_FIVE_Y), (Double) main.getValue(config.NAVBAR_FIVE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_FIVE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_FIVE_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_SIX_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_SIX_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_SIX_TYPE))) {
                    if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_SIX_COMMAND));
                    if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_SIX_MESSAGE));
                    if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_SIX_SERVER));
                    if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_SIX_X), (Double) main.getValue(config.NAVBAR_SIX_Y), (Double) main.getValue(config.NAVBAR_SIX_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_SIX_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_SIX_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_SEVEN_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_SEVEN_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_SEVEN_TYPE))) {
                    if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_SEVEN_COMMAND));
                    if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_SEVEN_MESSAGE));
                    if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_SEVEN_SERVER));
                    if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_SEVEN_X), (Double) main.getValue(config.NAVBAR_SEVEN_Y), (Double) main.getValue(config.NAVBAR_SEVEN_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_SEVEN_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_SEVEN_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_EIGHT_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_EIGHT_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_EIGHT_TYPE))) {
                    if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_EIGHT_COMMAND));
                    if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_EIGHT_MESSAGE));
                    if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_EIGHT_SERVER));
                    if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_EIGHT_X), (Double) main.getValue(config.NAVBAR_EIGHT_Y), (Double) main.getValue(config.NAVBAR_EIGHT_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_EIGHT_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_EIGHT_YAW)));
                        player.teleport(teleport);
                    }
                }
            if ((Boolean) main.getValue(config.NAVBAR_NINE_ENABLED))
                if (event.getItem().getItemMeta().getDisplayName().equals((String) main.getValue(config.NAVBAR_NINE_NAME)) && event.getItem().getType().equals((String) main.getValue(config.NAVBAR_NINE_TYPE))) {
                    if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals(null)) return;
                    if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals("command"))
                        player.performCommand((String) main.getValue(config.NAVBAR_NINE_COMMAND));
                    if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals("message"))
                        player.sendMessage((String) main.getValue(config.NAVBAR_NINE_MESSAGE));
                    if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals("server"))
                        main.connect(player, (String) main.getValue(config.NAVBAR_NINE_SERVER));
                    if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals("teleport")) {
                        Location teleport = new Location(player.getWorld(), (Double) main.getValue(config.NAVBAR_NINE_X), (Double) main.getValue(config.NAVBAR_NINE_Y), (Double) main.getValue(config.NAVBAR_NINE_Z));
                        teleport.setPitch(Float.parseFloat((String) main.getValue(config.NAVBAR_NINE_PITCH)));
                        teleport.setYaw(Float.parseFloat((String) main.getValue(config.NAVBAR_NINE_YAW)));
                        player.teleport(teleport);
                    }
                }
            Inventory inv = player.getInventory();
            inv.clear();
            navbar.generateNavbar(inv);
        }
    }
}