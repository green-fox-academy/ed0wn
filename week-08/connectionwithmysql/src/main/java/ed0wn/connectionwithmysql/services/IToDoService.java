package ed0wn.connectionwithmysql.services;

import ed0wn.connectionwithmysql.models.ToDo;

import java.util.List;

public interface IToDoService {
  List<ToDo> findAll();
  ToDo findById(long id);
  void save(ToDo toDo);
  void delete(long id);
  List<ToDo> findAllByTitle(String title);
  List<ToDo> findAllByDone(boolean done);
}
