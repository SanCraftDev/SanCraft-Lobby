package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.config;
import dev.sancraft.lobby.main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameModeChangeListener implements Listener {

    @EventHandler
    public void onGameModeChange(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        String serverip = (String) main.getValue(config.SETTINGS_IP);
        Inventory inv = player.getInventory();
        inv.clear();
        if (!event.getNewGameMode().equals(GameMode.ADVENTURE)) return;
        ItemStack offlineItem = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_OFFLINE_ITEM_TYPE)));
        ItemMeta offlineItemMeta = offlineItem.getItemMeta();
        offlineItemMeta.setDisplayName((String) main.getValue(config.NAVBAR_OFFLINE_ITEM_NAME));
        offlineItem.setItemMeta(offlineItemMeta);
        //Slot One
        if ((Boolean) main.getValue(config.NAVBAR_ONE_ENABLED)) {
            ItemStack NAVBAR_ONE_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_ONE_TYPE)));
            ItemMeta NAVBAR_ONE_META = NAVBAR_ONE_ITEM.getItemMeta();
            NAVBAR_ONE_META.setDisplayName((String) main.getValue(config.NAVBAR_ONE_NAME));
            NAVBAR_ONE_ITEM.setItemMeta(NAVBAR_ONE_META);
            if (main.getValue(config.NAVBAR_ONE_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_ONE_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_ONE_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(0, NAVBAR_ONE_ITEM);
                } else {
                    inv.setItem(0, offlineItem);
                }
            } else {
                inv.setItem(0, NAVBAR_ONE_ITEM);
            }
        }
        //Slot Two
        if ((Boolean) main.getValue(config.NAVBAR_TWO_ENABLED)) {
            ItemStack NAVBAR_TWO_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_TWO_TYPE)));
            ItemMeta NAVBAR_TWO_META = NAVBAR_TWO_ITEM.getItemMeta();
            NAVBAR_TWO_META.setDisplayName((String) main.getValue(config.NAVBAR_TWO_NAME));
            NAVBAR_TWO_ITEM.setItemMeta(NAVBAR_TWO_META);
            if (main.getValue(config.NAVBAR_TWO_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_TWO_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_TWO_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(1, NAVBAR_TWO_ITEM);
                } else {
                    inv.setItem(1, offlineItem);
                }
            } else {
                inv.setItem(1, NAVBAR_TWO_ITEM);
            }
        }
        //Slot Three
        if ((Boolean) main.getValue(config.NAVBAR_THREE_ENABLED)) {
            ItemStack NAVBAR_THREE_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_THREE_TYPE)));
            ItemMeta NAVBAR_THREE_META = NAVBAR_THREE_ITEM.getItemMeta();
            NAVBAR_THREE_META.setDisplayName((String) main.getValue(config.NAVBAR_THREE_NAME));
            NAVBAR_THREE_ITEM.setItemMeta(NAVBAR_THREE_META);
            if (main.getValue(config.NAVBAR_THREE_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_THREE_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_THREE_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(2, NAVBAR_THREE_ITEM);
                } else {
                    inv.setItem(2, offlineItem);
                }
            } else {
                inv.setItem(2, NAVBAR_THREE_ITEM);
            }
        }
        //Slot Four
        if ((Boolean) main.getValue(config.NAVBAR_FOUR_ENABLED)) {
            ItemStack NAVBAR_FOUR_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_FOUR_TYPE)));
            ItemMeta NAVBAR_FOUR_META = NAVBAR_FOUR_ITEM.getItemMeta();
            NAVBAR_FOUR_META.setDisplayName((String) main.getValue(config.NAVBAR_FOUR_NAME));
            NAVBAR_FOUR_ITEM.setItemMeta(NAVBAR_FOUR_META);
            if (main.getValue(config.NAVBAR_FOUR_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_FOUR_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_FOUR_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(3, NAVBAR_FOUR_ITEM);
                } else {
                    inv.setItem(3, offlineItem);
                }
            } else {
                inv.setItem(3, NAVBAR_FOUR_ITEM);
            }
        }
        //Slot Five
        if ((Boolean) main.getValue(config.NAVBAR_FIVE_ENABLED)) {
            ItemStack NAVBAR_FIVE_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_FIVE_TYPE)));
            ItemMeta NAVBAR_FIVE_META = NAVBAR_FIVE_ITEM.getItemMeta();
            NAVBAR_FIVE_META.setDisplayName((String) main.getValue(config.NAVBAR_FIVE_NAME));
            NAVBAR_FIVE_ITEM.setItemMeta(NAVBAR_FIVE_META);
            if (main.getValue(config.NAVBAR_FIVE_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_FIVE_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_FIVE_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(4, NAVBAR_FIVE_ITEM);
                } else {
                    inv.setItem(4, offlineItem);
                }
            } else {
                inv.setItem(4, NAVBAR_FIVE_ITEM);
            }
        }
        //Slot Six
        if ((Boolean) main.getValue(config.NAVBAR_SIX_ENABLED)) {
            ItemStack NAVBAR_SIX_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_SIX_TYPE)));
            ItemMeta NAVBAR_SIX_META = NAVBAR_SIX_ITEM.getItemMeta();
            NAVBAR_SIX_META.setDisplayName((String) main.getValue(config.NAVBAR_SIX_NAME));
            NAVBAR_SIX_ITEM.setItemMeta(NAVBAR_SIX_META);
            if (main.getValue(config.NAVBAR_SIX_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_SIX_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_SIX_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(5, NAVBAR_SIX_ITEM);
                } else {
                    inv.setItem(5, offlineItem);
                }
            } else {
                inv.setItem(5, NAVBAR_SIX_ITEM);
            }
        }
        //Slot Seven
        if ((Boolean) main.getValue(config.NAVBAR_SEVEN_ENABLED)) {
            ItemStack NAVBAR_SEVEN_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_SEVEN_TYPE)));
            ItemMeta NAVBAR_SEVEN_META = NAVBAR_SEVEN_ITEM.getItemMeta();
            NAVBAR_SEVEN_META.setDisplayName((String) main.getValue(config.NAVBAR_SEVEN_NAME));
            NAVBAR_SEVEN_ITEM.setItemMeta(NAVBAR_SEVEN_META);
            if (main.getValue(config.NAVBAR_SEVEN_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_SEVEN_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_SEVEN_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(6, NAVBAR_SEVEN_ITEM);
                } else {
                    inv.setItem(6, offlineItem);
                }
            } else {
                inv.setItem(6, NAVBAR_SEVEN_ITEM);
            }
        }
        //Slot Eight
        if ((Boolean) main.getValue(config.NAVBAR_EIGHT_ENABLED)) {
            ItemStack NAVBAR_EIGHT_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_EIGHT_TYPE)));
            ItemMeta NAVBAR_EIGHT_META = NAVBAR_EIGHT_ITEM.getItemMeta();
            NAVBAR_EIGHT_META.setDisplayName((String) main.getValue(config.NAVBAR_EIGHT_NAME));
            NAVBAR_EIGHT_ITEM.setItemMeta(NAVBAR_EIGHT_META);
            if (main.getValue(config.NAVBAR_EIGHT_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_EIGHT_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_EIGHT_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(7, NAVBAR_EIGHT_ITEM);
                } else {
                    inv.setItem(7, offlineItem);
                }
            } else {
                inv.setItem(7, NAVBAR_EIGHT_ITEM);
            }
        }
        //Slot Nine
        if ((Boolean) main.getValue(config.NAVBAR_NINE_ENABLED)) {
            ItemStack NAVBAR_NINE_ITEM = new ItemStack(Material.valueOf((String) main.getValue(config.NAVBAR_NINE_TYPE)));
            ItemMeta NAVBAR_NINE_META = NAVBAR_NINE_ITEM.getItemMeta();
            NAVBAR_NINE_META.setDisplayName((String) main.getValue(config.NAVBAR_NINE_NAME));
            NAVBAR_NINE_ITEM.setItemMeta(NAVBAR_NINE_META);
            if (main.getValue(config.NAVBAR_NINE_LEFT_CLICK).equals("Server") || main.getValue(config.NAVBAR_NINE_RIGHT_CLICK).equals("server")) {
                boolean online;
                try {
                    Socket socket = new Socket(serverip, (Integer) main.getValue(config.NAVBAR_NINE_PORT));
                    // ONLINE
                    socket.close();
                    online = true;
                } catch (UnknownHostException e) {
                    online = false;
                } catch (IOException e) {
                    online = false;
                }
                if (online) {
                    inv.setItem(8, NAVBAR_NINE_ITEM);
                } else {
                    inv.setItem(8, offlineItem);
                }
            } else {
                inv.setItem(8, NAVBAR_NINE_ITEM);
            }
        }
    }
}
