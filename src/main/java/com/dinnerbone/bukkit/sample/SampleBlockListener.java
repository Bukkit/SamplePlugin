
package com.dinnerbone.bukkit.sample;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * Sample block listener
 * @author Dinnerbone
 */
public class SampleBlockListener implements Listener {
    @EventHandler
    public void onBlockPhysics(BlockPhysicsEvent event) {
        Block block = event.getBlock();

        if ((block.getType() == Material.SAND) || (block.getType() == Material.GRAVEL)) {
            Block above = block.getRelative(BlockFace.UP);
            if (above.getType() == Material.IRON_BLOCK) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBlockCanBuild(BlockCanBuildEvent event) {
        Material mat = event.getMaterial();

        if (mat.equals(Material.CACTUS)) {
            event.setBuildable(true);
        }
    }
}
