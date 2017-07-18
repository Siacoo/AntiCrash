package me.siaco.anticrash.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class AntiCrashListener
  implements Listener
{
  @EventHandler
  public void onCommand(PlayerCommandPreprocessEvent event)
  {
    Player player = event.getPlayer();
    if ((event.getMessage().equalsIgnoreCase("//calc")) && (event.getMessage().equalsIgnoreCase("//eval")) && (event.getMessage().contains("//calc")) && (event.getMessage().contains("//eval")) && (event.getMessage().contains("//EVAL")) && (event.getMessage().contains("//CALC")))
    {
      event.setCancelled(true);
      player.sendMessage(ChatColor.WHITE + "Unknown command. Type \"/help\" for help.");
    }
  }
}
