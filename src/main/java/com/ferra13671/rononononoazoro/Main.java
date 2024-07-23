package com.ferra13671.rononononoazoro;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Creating a new nickname for RononoaZoro...");

            Path folderPath = Paths.get("Result");

            if (!Files.exists(folderPath)) {
                Files.createDirectory(folderPath);
            }

            for (int a = 0; a < 2; a++) {
                Path path = Paths.get("Result/RononoaZoro" + a + ".txt");

                if (Files.exists(path)) {
                    File file = path.toFile();
                    file.delete();
                }

                Files.createFile(path);

                BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);

                writer.write("Ronono");

                for (int i = 0; i < 55000; i++) {
                    StringBuilder chars = new StringBuilder();
                    while (chars.length() < 10000) {
                        chars.append(GenerateRandomChar.getNextChar());
                    }
                    writer.write(chars + System.lineSeparator());
                }

                writer.write("Zoro");

                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}