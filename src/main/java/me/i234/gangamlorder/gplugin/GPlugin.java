package me.i234.gangamlorder.gplugin;

import org.bukkit.plugin.java.JavaPlugin;
import sun.jvm.hotspot.oops.Instance;

public final class GPlugin extends JavaPlugin {

    private JavaPlugin instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

    }

    @Override
    public void onDisable() {
       instance = null;
    }

    public JavaPlugin getInstance(){
        return instance;
    }
}
