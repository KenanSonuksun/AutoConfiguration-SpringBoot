package auto_config.example.AutoConfiguration.services;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    void store(MultipartFile file);
    Resource load(String filename);
    void deleteAll();
}
