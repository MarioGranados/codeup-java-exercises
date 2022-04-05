package notes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIONotes {
    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);

        for(int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("src/notes/wcw.txt");
        System.out.println(myPath);

        System.out.println(Files.exists(myPath));

        printPoem(myPath);

        String directory = "./src/notes/data";

        String fileName = "groceryList.txt";

        Path dataDir = Paths.get(directory);

        Path dataDirAndFile = Paths.get(directory, fileName);


        //creates file if it dones'tn exist
        if(Files.notExists(dataDir)) {
            Files.createDirectories(dataDir);
        }
        if(Files.notExists(dataDirAndFile)) {
            Files.createFile(dataDirAndFile);
        }

        List<String> groceries = Arrays.asList("coffee", "milk", "dogFood", "bread");

        System.out.println(groceries);

        //re-writes to the list
        Files.write(dataDirAndFile, groceries);

        List<String> cheese = Arrays.asList("Cheddar Cheese", "Colby Jack");
        //adds to list
        Files.write(dataDirAndFile, cheese, StandardOpenOption.APPEND);

        List<String> updatedGroceriesList = Files.readAllLines(dataDirAndFile);

        System.out.println(updatedGroceriesList);

        for (int i = 0; i < updatedGroceriesList.size(); i++) {
            System.out.println(i + 1 + " " + updatedGroceriesList.get(i));
        }

        List<String> printGroceries = Files.readAllLines(dataDirAndFile);

        List<String> newList = new ArrayList<>();

        for(String line : printGroceries) {
            if(line.equals("Cheddar Cheese")) {
                newList.add("Vegan Cheese");
                continue;
            }
            newList.add(line);
        }

        System.out.println("newList: " + newList);

    }
}
