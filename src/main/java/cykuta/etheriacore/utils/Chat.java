package cykuta.etheriacore.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Chat {
    public static String color(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void playerMsg( Player player, String msg){
        player.sendMessage(Chat.color(msg));
    }

    public static void consoleMsg(String msg){
        Bukkit.getConsoleSender().sendMessage(Chat.color(msg));
    }
}
