package dev.sancraft.lobby.listeners;

import dev.sancraft.lobby.navbar;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.inventory.Inventory;

public class GameModeChangeListener implements Listener {

    @EventHandler
    public void onGameModeChange(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        inv.clear();
        if (!event.getNewGameMode().equals(GameMode.ADVENTURE)) return;
        navbar.generateNavbar(inv);
    }
}
