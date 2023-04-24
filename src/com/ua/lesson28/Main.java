package com.ua.lesson28;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter buf = new BufferedWriter(new FileWriter("test.txt"))) {
            buf.write("hkfhdkjkfgdhghkfhfgdh");
            buf.close();
        } catch (IOException ee) {

        }

        try {
            Path testPath = Paths.get("test.txt");
            Files.readAllLines(testPath).forEach(System.out::println);
        } catch (IOException io) {
        }
    }

}
