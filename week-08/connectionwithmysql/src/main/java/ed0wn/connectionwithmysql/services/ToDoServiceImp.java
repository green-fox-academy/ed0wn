package ed0wn.connectionwithmysql.services;

import ed0wn.connectionwithmysql.models.ToDo;
import ed0wn.connectionwithmysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceImp implements IToDoService{

  private ToDoRepository repository;

  @Autowired
  public ToDoServiceImp(ToDoRepository repository){
    this.repository=repository;
  }

  @Override
  public List<ToDo> findAll() {
    List<ToDo> toDoList = new ArrayList<>();
    repository.findAll().forEach(toDoList::add);
    return toDoList;
  }

  @Override
  public ToDo findById(long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void save(ToDo toDo) {
  repository.save(toDo);
  }

  @Override
  public void delete(long id) {
    repository.deleteById(id);

  }

  @Override
  public List<ToDo> findAllByTitle(String title) {
    return repository.findAllByTitle(title);
  }

  @Override
  public List<ToDo> findAllByDone(boolean done) {
    return repository.findAllByDone(done);
  }
}
