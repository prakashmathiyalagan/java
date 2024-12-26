package com.practice.java11;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        new FileCreator().writeFile("Sample text");
    }

    /**
     * Write input string to a file and return file content after reading.
     *
     * @param inputString {@link String}
     * @return {@link String}
     * @throws IOException
     */
    public String writeFile(String inputString) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of("/tmp"), "demo", ".txt"), inputString);
        return Files.readString(filePath);
    }
}
