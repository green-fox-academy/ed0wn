package ed0wn.connectionwithmysql.repository;

import ed0wn.connectionwithmysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAssigneeRepository extends CrudRepository<Assignee, Long> {
  List<Assignee> findAllByName(String title);

}
