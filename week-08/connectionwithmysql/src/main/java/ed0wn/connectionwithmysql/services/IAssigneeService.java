package ed0wn.connectionwithmysql.services;



import ed0wn.connectionwithmysql.models.Assignee;

import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAll();
  Assignee findById(long id);
  void save(Assignee assignee);
  void delete(long id);
  List<Assignee> findAllByName(String name);
}
