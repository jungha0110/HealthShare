package io.github.jungha.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            double damage = event.getDamage();
            for (Player allPlayer : Bukkit.getOnlinePlayers()) {
                allPlayer.damage(damage);
            }
        }
    }
}
