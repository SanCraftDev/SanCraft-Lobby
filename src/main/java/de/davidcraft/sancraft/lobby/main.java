package de.davidcraft.sancraft.lobby;

import de.davidcraft.sancraft.lobby.listeners.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public final class main extends JavaPlugin {

    public static ArrayList<Player> cooldown = new ArrayList<Player>();
    private static String prefix = ChatColor.GRAY + "[" + ChatColor.GOLD + "Lobby" + ChatColor.GRAY + "]";
    private static main instance;
    private static FileConfiguration config;

    public static String getPrefix() {
        return prefix + " ";
    }

    public static main getInstance() {
        return instance;
    }

    public static void connect(Player player, String server) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(b);
        out.writeUTF("Connect");
        out.writeUTF(server);
        player.sendPluginMessage(getInstance(), "BungeeCord", b.toByteArray());
    }

    @Override
    public void onEnable() {
        config = getConfig();
        Bukkit.getConsoleSender().sendMessage(main.getPrefix() + ChatColor.GREEN + "Das Plugin wurde erfolgreich gestartet!");
        instance = this;
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        listenerRegistration();
        loadConfig();
        readConfig.ReadConfig();

        World world = Bukkit.getServer().getWorlds().get(0);
        world.setGameRule(GameRule.SHOW_DEATH_MESSAGES, false);
        world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);
        world.setDifficulty(Difficulty.PEACEFUL);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(main.getPrefix() + ChatColor.DARK_RED + "Das Plugin wurde erfolgreich gestoppt!");
    }

    private void listenerRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new DropListener(), this);
        pluginManager.registerEvents(new InventoryClickListener(), this);
        pluginManager.registerEvents(new InteractListener(), this);
        pluginManager.registerEvents(new GameModeChangeListener(), this);
        pluginManager.registerEvents(new DamageListener(), this);
    }

    private void loadConfig() {
        if ((new File("plugins/SanCraft-Lobby/config.yml")).exists()) {
            config = this.getConfig();
            config.options().copyDefaults(true);
            Bukkit.getConsoleSender().sendMessage(main.getPrefix() + ChatColor.GREEN + "Config Datei erstellt und geladen!");
        } else {
            saveDefaultConfig();
            config = this.getConfig();
            config.options().copyDefaults(true);
            Bukkit.getConsoleSender().sendMessage(main.getPrefix() + ChatColor.GREEN + "Config Datei geladen!");
        }
    }

}
