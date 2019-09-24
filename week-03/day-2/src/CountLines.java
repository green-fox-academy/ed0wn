import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    System.out.println(numberOfLines("my-file.txt"));
  }
  public static int numberOfLines (String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines= Files.readAllLines(filePath);
      return lines.size();
    }
    catch (Exception e) {
      return 0;
    }
  }
}
