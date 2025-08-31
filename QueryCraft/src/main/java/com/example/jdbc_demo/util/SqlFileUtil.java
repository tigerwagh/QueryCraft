package com.example.jdbc_demo.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class SqlFileUtil {

    public static String readSqlFile(String fileName) {
        try {
            ClassPathResource resource = new ClassPathResource("sql/" + fileName);
            Path path = resource.getFile().toPath();
            return Files.readString(path);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read SQL file: " + fileName, e);
        }
    }
}