
package com.dinnerbone.bukkit.sample;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Handler for the /pos sample command.
 * @author SpaceManiac
 */
public class SamplePosCommand implements CommandExecutor {
    private final SamplePlugin plugin;

    public SamplePosCommand(SamplePlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;

        if (split.length == 0) {
            Location location = player.getLocation();
            player.sendMessage("You are currently at " + location.getX() +"," + location.getY() + "," + location.getZ() +
                    " with " + location.getYaw() + " yaw and " + location.getPitch() + " pitch");
            return true;
        } else if (split.length == 3) {
            try {
                double x = Double.parseDouble(split[0]);
                double y = Double.parseDouble(split[1]);
                double z = Double.parseDouble(split[2]);

                player.teleport(new Location(player.getWorld(), x, y, z));
            } catch (NumberFormatException ex) {
                player.sendMessage("Given location is invalid");
            }
            return true;
        } else {
            return false;
        }
    }
}
