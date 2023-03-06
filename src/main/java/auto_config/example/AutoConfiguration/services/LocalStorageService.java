package auto_config.example.AutoConfiguration.services;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;

public class LocalStorageService implements StorageService{
    private final Path rootLocation;

    public LocalStorageService(String directory) {
        this.rootLocation = Paths.get(directory);
    }

    @Override
    public void store(MultipartFile file) {

    }

    @Override
    public Resource load(String filename) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
