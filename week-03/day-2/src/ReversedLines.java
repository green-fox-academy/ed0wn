import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt


    Path filePath = Paths.get("reversed-lines.txt");
    Path filePath2 = Paths.get("reversed-lines2.txt");
    String newLine = "";
    List<String> lines2 = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);

        for (int j = (line.length()-1); j >= 0; j--) {
          newLine = newLine + line.charAt(j);
        }
        lines2.add(newLine);
        newLine = "";
      }
      Files.write(filePath2, lines2);
    } catch (Exception e) {

    }
  }
}