

import java.util.HashMap;
import java.util.Map;

public class ConfigurationSettingsManager {
    private static ConfigurationSettingsManager instance;

    private Map<String, String> settings;

    private ConfigurationSettingsManager() {

        settings = new HashMap<>();

        loadDefaultSettings();
    }

    public static ConfigurationSettingsManager getInstance() {

        if (instance == null) {
            instance = new ConfigurationSettingsManager();
        }
        return instance;
    }

    private void loadDefaultSettings() {

        settings.put("DB_HOST", "localhost");
        settings.put("DB_PORT", "3306");
        settings.put("DB_USERNAME", "root");
        settings.put("DB_PASSWORD", "password");

    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void updateSetting(String key, String value) {
        settings.put(key, value);
    }

    public void addSetting(String key, String value) {
        settings.put(key, value);
    }

    public void removeSetting(String key) {
        settings.remove(key);
    }

    public boolean hasSetting(String key) {
        return settings.containsKey(key);
    }

    public Map<String, String> getAllSettings() {
        return new HashMap<>(settings);
    }
}
