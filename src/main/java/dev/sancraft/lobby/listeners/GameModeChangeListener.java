package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.readConfig;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameModeChangeListener implements Listener {

    @EventHandler
    public void onGameModeChange(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        String serverip = readConfig.getString("settings.serverip");
        Inventory inv = player.getInventory();
        inv.clear();
        if (!event.getNewGameMode().equals(GameMode.ADVENTURE)) return;
        ItemStack offline = readConfig.getItemStack("navbar.offline");
        if (readConfig.getBoolean("navbar.one.enabled")) {
            Integer slot = 0;
            String slotword = "one";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.two.enabled")) {
            Integer slot = 1;
            String slotword = "two";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.three.enabled")) {
            Integer slot = 2;
            String slotword = "three";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.four.enabled")) {
            Integer slot = 3;
            String slotword = "four";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.five.enabled")) {
            Integer slot = 4;
            String slotword = "five";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.six.enabled")) {
            Integer slot = 5;
            String slotword = "six";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.seven.enabled")) {
            Integer slot = 6;
            String slotword = "seven";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.eight.enabled")) {
            Integer slot = 7;
            String slotword = "eight";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
        if (readConfig.getBoolean("navbar.nine.enabled")) {
            Integer slot = 8;
            String slotword = "nine";
            ItemStack itemStack = readConfig.getItemStack("navbar." + slotword);
            if (readConfig.getString("navbar." + slotword + ".left").equals("server") || readConfig.getString("navbar." + slotword + ".right").equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, readConfig.getInt("navbar." + slotword + ".port"));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(slot, itemStack);
                } else {
                    inv.setItem(slot, offline);
                }
            } else {
                inv.setItem(slot, itemStack);
            }
        }
    }
}
