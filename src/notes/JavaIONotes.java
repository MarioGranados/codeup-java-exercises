package notes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    }
}
