import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    String newLine="";
    List<String> lines2 =new ArrayList<>();
    try{
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        String line=lines.get(i);

        for (int j = 0; j < line.length(); j++) {
          if (j%2 == 0){
            newLine=newLine+line.charAt(j);
          }
        }
        lines2.add(newLine);
        newLine="";
      }
      Files.write(filePath,lines2);
    }
    catch (Exception e){

    }
  }
}