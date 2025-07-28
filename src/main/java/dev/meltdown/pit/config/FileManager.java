package dev.meltdown.pit.config;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class FileManager {

    private final YamlConfiguration config;

    public FileManager(JavaPlugin plugin) {
        File configFile = new File(plugin.getDataFolder(), "meltdown.yml");
        if (!configFile.exists()) {
            saveResource(plugin.getResource("meltdown.yml"), configFile);
        }
        config = YamlConfiguration.loadConfiguration(configFile);
    }

    private void saveResource(InputStream in, File destination) {
        try {
            Files.copy(in, destination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public YamlConfiguration getConfig() {
        return this.config;
    }

}