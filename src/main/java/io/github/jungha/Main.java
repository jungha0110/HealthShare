package io.github.jungha;

import io.github.jungha.listener.DamageListener;
import io.github.jungha.listener.RegainHealthListener;
import lombok.Getter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Getter
    private static JavaPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        registerEvents(
                new DamageListener(),
                new RegainHealthListener()
        );
    }

    private void registerEvents(Listener... listeners) {
        for (Listener listener : listeners) {
            getServer().getPluginManager().registerEvents(listener, instance);
        }
    }
}