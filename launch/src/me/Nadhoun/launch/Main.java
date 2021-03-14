package me.Nadhoun.launch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("launch")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("You are not a player...");
                return true;
            }
            Player player = (Player) sender;

            if (args.length == 0) {
                player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
                player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Weeeeeee!");
                return true;
            }
            player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Weeeeeee!");
            return true;
        }
        return false;
    }
}
