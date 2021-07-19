package de.davidcraft.sancraft.lobby;

import org.bukkit.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffectType;

import java.io.File;

public class readConfig {
    private static FileConfiguration config;

    public static void ReadConfig() {
        config = YamlConfiguration.loadConfiguration(new File("plugins/SanCraft-Lobby", "config.yml"));
    }

    public static Long getCooldown() {
        return config.getLong("lobby.cooldown");
    }

    public static String getString(String path) {
        String string = config.getString(path);
        return string;
    }

    public static int getInt(String path) {
        Integer integer = config.getInt(path);
        return integer;
    }

    public static boolean getBoolean(String path) {
        Boolean bool = config.getBoolean(path);
        return bool;
    }

    public static Sound getSound(String path) {
        Sound sound = Sound.valueOf(readConfig.getString(path));
        return sound;
    }

    public static Location getLocation(String path, Player player) {
        Location location = new Location(player.getWorld(), config.getDouble(path + ".x"), config.getDouble(path + ".y"), config.getDouble(path + ".z"));
        location.setPitch(Float.parseFloat(readConfig.getString(path + ".pitch")));
        location.setYaw(Float.parseFloat(readConfig.getString(path + ".yaw")));
        return location;
    }

    public static ItemStack getItemStack(String path) {
        ItemStack itemstack = new ItemStack(Material.valueOf(readConfig.getString(path + ".type")));
        if (readConfig.getString(path + ".type").equalsIgnoreCase("PLAYER_HEAD")) {
            SkullMeta meta = (SkullMeta) itemstack.getItemMeta();
            meta.setDisplayName(readConfig.getString(path + ".name"));
            OfflinePlayer owner = Bukkit.getOfflinePlayer(readConfig.getString(path + ".skullowner"));
            meta.setOwningPlayer(owner);
            itemstack.setItemMeta(meta);
        } else {
            ItemMeta meta = itemstack.getItemMeta();
            meta.setDisplayName(readConfig.getString(path + ".name"));
            itemstack.setItemMeta(meta);
        }
        return itemstack;
    }

    public static PotionEffectType getEffectType(String path) {
        PotionEffectType effectType = PotionEffectType.getByName(readConfig.getString(path));
        return effectType;
    }

    public static Long getLong(String path) {
        Long longc = config.getLong(path);
        return longc;
    }
}
