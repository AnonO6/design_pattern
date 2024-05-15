package singleton;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of the configuration settings manager
        ConfigurationSettingsManager configManager = ConfigurationSettingsManager.getInstance();

        // Get a configuration setting
        String dbHost = configManager.getSetting("DB_HOST");
        System.out.println("Database Host: " + dbHost);

        // Update a configuration setting
        configManager.updateSetting("DB_HOST", "newhost.example.com");

        // Get the updated configuration setting
        String updatedDbHost = configManager.getSetting("DB_HOST");
        System.out.println("Updated Database Host: " + updatedDbHost);

        // Add a new configuration setting
        configManager.addSetting("API_KEY", "123456789");
        String apiKey = configManager.getSetting("API_KEY");
        System.out.println("API Key: " + apiKey);

        // Remove a configuration setting
        configManager.removeSetting("API_KEY");
        boolean hasApiKey = configManager.hasSetting("API_KEY");
        System.out.println("Has API Key: " + hasApiKey);

        // Get all configuration settings
        Map<String, String> allSettings = configManager.getAllSettings();
        System.out.println("All Settings:");
        for (Map.Entry<String, String> entry : allSettings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
