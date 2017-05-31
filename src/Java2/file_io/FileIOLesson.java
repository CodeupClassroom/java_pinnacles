package Java2.file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get("data", "info.txt");

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar", "mango");
        Files.write(
            Paths.get("data", "info.txt"),
            groceryList,
            StandardOpenOption.APPEND
        );

        List<String> lines = Files.readAllLines(dataFile);
        for (String line : lines) {
            System.out.println(line);
        }

    }
}
