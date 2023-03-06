package auto_config.example.AutoConfiguration.config;

import auto_config.example.AutoConfiguration.services.LocalStorageService;
import auto_config.example.AutoConfiguration.services.StorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "storage.type", havingValue = "local", matchIfMissing = true)
public class LocalStorageConfiguration {
    @Value("${storage.local.directory}")
    private String directory;

    @Bean
    public StorageService localStorageService() {
        return new LocalStorageService(directory);
    }
}
