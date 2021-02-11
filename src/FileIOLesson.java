import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.nio.file.StandardOpenOption;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
//TODO: Mini Exercise
//    //
//    // 1. Create a class named FileIOLesson
//    // 2. Do your work inside of a main method
//    // 3. Write Java code to create a file named languages.txt.
//          Specify languages.txt as a relative path (Paths.get("languages.txt")).
//          Where is this file created after you run your code?
//    // 4. Run your code that creates the languages.txt file again.
//          What happens when you try to create a file that already exists?
//    // 5. Update your code to check for the presence of languages.txt before creating it.

//        Path filepath = Paths.get("languages.txt");
//        Files.createFile(filepath);
        // another way //
//        if (!Files.exists(filepath)) {
//            Files.createFile(filepath);
//        }


//TODO: Mini Exercise
//  //
// 1. Create a variable named languages that is a list of strings. Each string should be one programming language that you know.
// 1. Write the code to add the programming languages you know, each on a separate line, to languages.txt.
// 2. Run your code and open the languages.txt file. What do you notice?
// 3. Re-run your code that adds the languages. Open the languages.txt file again. What do you notice?
// 4. Modify your languages variable and remove one of the languages. Re-run your code and inspect the languages.txt file. What do you notice?

//    Path filepath = Paths.get("languages.txt");
//    List<String> languages = Arrays.asList(
//            "HTML",
//            "CSS",
//            "JavaScript",
//            "Java"
//    );
//    Files.write(filepath, languages);

        Path filepath = Paths.get("languages.txt");
        List<String> lines = Files.readAllLines(filepath);

        for (String line: lines) {
            System.out.println("Here is a language I like: " + line);
            if (line.equals("JavaScript")) {
                System.out.println("This is my favorite language!");
            }
        }
    }

}
