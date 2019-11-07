package ed0wn.connectionwithmysql.repository;

import ed0wn.connectionwithmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Long> {
  List<ToDo> findAllByTitle(String title);

  List<ToDo> findAllByDone(boolean done);
}
