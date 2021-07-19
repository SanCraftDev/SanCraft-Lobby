package de.davidcraft.sancraft.lobby.listeners;

import de.davidcraft.sancraft.lobby.main;
import de.davidcraft.sancraft.lobby.readConfig;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) throws IOException {
        Player player = event.getPlayer();
        player.sendMessage("1");
        if (player.getGameMode().equals(GameMode.CREATIVE)) return;
        player.sendMessage("2");
        if (main.cooldown.contains(player)) return;
        player.sendMessage("3");
        main.cooldown.add(player);
        player.sendMessage("4");
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main.getInstance(), new Runnable() {
            public void run() {
                main.cooldown.remove(player);
            }
        }, readConfig.getLong("settings.cooldown"));
        player.sendMessage("5");
        ItemStack playerItem = player.getInventory().getItemInMainHand();
        player.sendMessage("6");
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            player.sendMessage("7");
            String action = "left";
            if (readConfig.getBoolean("navnar.one.enabled")) {
                String slotword = "one";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.two.enabled")) {
                String slotword = "two";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.three.enabled")) {
                String slotword = "three";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.four.enabled")) {
                String slotword = "four";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.five.enabled")) {
                String slotword = "five";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.six.enabled")) {
                String slotword = "six";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.seven.enabled")) {
                String slotword = "seven";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.eight.enabled")) {
                String slotword = "eight";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.nine.enabled")) {
                String slotword = "nine";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            }
        } else if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            String action = "right";
            if (readConfig.getBoolean("navnar.one.enabled")) {
                String slotword = "one";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.two.enabled")) {
                String slotword = "two";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.three.enabled")) {
                String slotword = "three";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.four.enabled")) {
                String slotword = "four";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.five.enabled")) {
                String slotword = "five";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.six.enabled")) {
                String slotword = "six";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.seven.enabled")) {
                String slotword = "seven";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.eight.enabled")) {
                String slotword = "eight";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            } else if (readConfig.getBoolean("navnar.nine.enabled")) {
                String slotword = "nine";
                if (readConfig.getString("navbar." + slotword + ".type").equals(playerItem.getType()) && readConfig.getString("navbar." + slotword + ".name").equalsIgnoreCase(playerItem.getItemMeta().getDisplayName())) {
                    if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slotword + ".server")));
                        Sound sound1 = readConfig.getSound("settings.sounds.connect1");
                        Sound sound2 = readConfig.getSound("settings.sounds.connect2");
                        player.playSound(player.getLocation(), sound1, 1, 1);
                        player.playSound(player.getLocation(), sound2, 1, 1);
                        main.connect(player, readConfig.getString("navbar." + slotword + ".server"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("teleport")) {
                        Location location = readConfig.getLocation("navbar." + slotword, player);
                        Sound sound = readConfig.getSound("settings.sounds.teleport");
                        player.playSound(player.getLocation(), sound, 1, 1);
                        player.teleport(location);
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slotword + ".cmd"));
                    } else if (readConfig.getString("navbar." + slotword + "." + action).equalsIgnoreCase("cmd")) {
                        player.performCommand("navbar." + slotword + ".cmd");
                    }
                }
            }
        }
        player.sendMessage("END");
    }
}