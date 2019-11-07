package ed0wn.databaseintegration.repository;

import ed0wn.databaseintegration.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Long> {
}
