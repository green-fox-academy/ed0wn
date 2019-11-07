package ed0wn.databaseintegration;

import ed0wn.databaseintegration.models.ToDo;
import ed0wn.databaseintegration.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseintegrationApplication implements CommandLineRunner {

  private ToDoRepository repository;

  @Autowired
  public DatabaseintegrationApplication(ToDoRepository repository){
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(DatabaseintegrationApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new ToDo("I have to learn Object Relational Mapping"));
    repository.save(new ToDo("Ma is csináltam valami"));
  }
}
