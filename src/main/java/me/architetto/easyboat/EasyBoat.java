package me.architetto.easyboat;

import me.architetto.easyboat.listener.BoatListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyBoat extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BoatListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
