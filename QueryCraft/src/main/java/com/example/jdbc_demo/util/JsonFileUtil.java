package com.example.jdbc_demo.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

@Component
public class JsonFileUtil {
    public static String readJsonFile(String fileName) throws IOException {
        try {
            ClassPathResource resource = new ClassPathResource("json/" + fileName);
            Path path = resource.getFile().toPath();
            return Files.readString(path);
        } catch (IOException e) {
            throw new IOException("Error reading JSON file: " + fileName, e);
        }
    }
}
