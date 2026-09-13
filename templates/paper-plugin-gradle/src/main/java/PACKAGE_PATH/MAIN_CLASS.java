package PACKAGE_NAME;

import org.bukkit.plugin.java.JavaPlugin;

public class MAIN_CLASS extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PROJECT_NAME has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("PROJECT_NAME has been disabled!");
    }
}
