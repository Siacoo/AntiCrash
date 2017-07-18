package me.siaco.anticrash;

import me.siaco.anticrash.listener.AntiCrashListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCrash
  extends JavaPlugin
{
  public void onEnable()
  {
    PluginManager manager = Bukkit.getPluginManager();
    manager.registerEvents(new AntiCrashListener(), this);
  }
  
  public void onDisable() {}
}
