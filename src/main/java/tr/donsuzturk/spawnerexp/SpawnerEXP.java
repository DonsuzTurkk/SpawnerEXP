package tr.donsuzturk.spawnerexp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnerEXP extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this );
        getLogger().info("Eklenti aktif edildi!");
    }

    @EventHandler
    public void spawnerKirma(final BlockBreakEvent e) {
        final Block block = e.getBlock();
        if (block.getType() == Material.MOB_SPAWNER) {
            e.setExpToDrop(0);
        }
    }

}
