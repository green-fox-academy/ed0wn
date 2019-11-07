package ed0wn.dependency;

import ed0wn.dependency.services.MyColor;
import ed0wn.dependency.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(DependencyApplication.class, args);
  }

  @Autowired
  public DependencyApplication(Printer printer, @Qualifier("red") MyColor myColor){
    this.printer= printer;
    this.myColor=myColor;
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }


}
