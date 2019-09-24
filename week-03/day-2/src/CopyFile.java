import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    copy("my-file.txt","new-file.txt");
  }
  public static boolean copy (String name1, String name2){
    Path filePath = Paths.get(name1);
    Path filePath2 = Paths.get(name2);
    try {
      List<String> lines= Files.readAllLines(filePath);
      for (int i = 0; i<lines.size(); i++) {
        Files.write(filePath2, lines);
      }
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }


  }
}
