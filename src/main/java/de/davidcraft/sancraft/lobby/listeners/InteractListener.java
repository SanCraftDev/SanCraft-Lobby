package de.davidcraft.sancraft.lobby.listeners;

import de.davidcraft.sancraft.lobby.main;
import de.davidcraft.sancraft.lobby.readConfig;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
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
        if (player.getGameMode().equals(GameMode.CREATIVE)) return;
        if (main.cooldown.contains(player)) return;
        main.cooldown.add(player);
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main.getInstance(), new Runnable() {
            public void run() {
                main.cooldown.remove(player);
            }
        }, readConfig.getLong("settings.cooldown"));
        ItemStack actionItem = player.getInventory().getItemInMainHand();
        ItemStack offline = readConfig.getItemStack("navbar.offline");
        ItemStack oneItem;
        ItemStack twoItem;
        ItemStack threeItem;
        ItemStack fourItem;
        ItemStack fiveItem;
        ItemStack sixItem;
        ItemStack sevenItem;
        ItemStack eightItem;
        ItemStack nineItem;
        if (readConfig.getBoolean("navbar.one.enabled")) {
            oneItem = readConfig.getItemStack("navbar.one");
        } else {
            oneItem = offline;
        }
        if (readConfig.getBoolean("navbar.two.enabled")) {
            twoItem = readConfig.getItemStack("navbar.two");
        } else {
            twoItem = offline;
        }
        if (readConfig.getBoolean("navbar.three.enabled")) {
            threeItem = readConfig.getItemStack("navbar.three");
        } else {
            threeItem = offline;
        }
        if (readConfig.getBoolean("navbar.four.enabled")) {
            fourItem = readConfig.getItemStack("navbar.four");
        } else {
            fourItem = offline;
        }
        if (readConfig.getBoolean("navbar.five.enabled")) {
            fiveItem = readConfig.getItemStack("navbar.five");
        } else {
            fiveItem = offline;
        }
        if (readConfig.getBoolean("navbar.six.enabled")) {
            sixItem = readConfig.getItemStack("navbar.six");
        } else {
            sixItem = offline;
        }
        if (readConfig.getBoolean("navbar.seven.enabled")) {
            sevenItem = readConfig.getItemStack("navbar.seven");
        } else {
            sevenItem = offline;
        }
        if (readConfig.getBoolean("navbar.eight.enabled")) {
            eightItem = readConfig.getItemStack("navbar.eight");
        } else {
            eightItem = offline;
        }
        if (readConfig.getBoolean("navbar.nine.enabled")) {
            nineItem = readConfig.getItemStack("navbar.nine");
        } else {
            nineItem = offline;
        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(oneItem.getItemMeta().getDisplayName())) {
            String slot = "one";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(twoItem.getItemMeta().getDisplayName())) {
            String slot = "two";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(threeItem.getItemMeta().getDisplayName())) {
            String slot = "three";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(fourItem.getItemMeta().getDisplayName())) {
            String slot = "four";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(fiveItem.getItemMeta().getDisplayName())) {
            String slot = "five";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(sixItem.getItemMeta().getDisplayName())) {
            String slot = "six";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(sevenItem.getItemMeta().getDisplayName())) {
            String slot = "seven";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(eightItem.getItemMeta().getDisplayName())) {
            String slot = "eight";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
        if (actionItem.getType().equals(oneItem.getType()) && actionItem.getItemMeta().getDisplayName().equals(nineItem.getItemMeta().getDisplayName())) {
            String slot = "nine";
            String left = readConfig.getString("navbar." + slot + ".left");
            String right = readConfig.getString("navbar." + slot + ".right");
            if (left.equalsIgnoreCase("server") || left.equalsIgnoreCase("teleport") || left.equalsIgnoreCase("cmd") || left.equalsIgnoreCase("cmdconsole")) {
                if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
                    if (left.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (left.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (left.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (left.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
                if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (right.equalsIgnoreCase("server")) {
                        player.sendMessage(readConfig.getString("settings.message.connect").replace("%server%", readConfig.getString("navbar." + slot + ".server")));
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect1"), 1, 1);
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.connect2"), 1, 1);
                        main.connect(player, "navbar." + slot + ".server");
                    }
                    if (right.equalsIgnoreCase("teleport")) {
                        player.playSound(player.getLocation(), readConfig.getSound("settings.sound.teleport"), 1, 1);
                        player.teleport(readConfig.getLocation("navbar." + slot, player));
                    }
                    if (right.equalsIgnoreCase("cmd")) {
                        player.performCommand(readConfig.getString("navbar." + slot + "cmd"));
                    }
                    if (right.equalsIgnoreCase("cmdconsole")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), readConfig.getString("navbar." + slot + "cmd"));
                    }
                }
            }

        }
    }
}
