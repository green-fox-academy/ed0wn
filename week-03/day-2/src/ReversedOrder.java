import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    Path filePath = Paths.get("reversed-order.txt");
    Path filePath2 = Paths.get("reversed-order2.txt");
    String newLine = "";
    List<String> lines2 = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = (lines.size()-1); i >= 0; i--) {
        String line = lines.get(i);

        for (int j = 0; j < line.length(); j++) {
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