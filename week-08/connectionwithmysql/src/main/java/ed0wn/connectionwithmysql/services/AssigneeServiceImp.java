package ed0wn.connectionwithmysql.services;

import ed0wn.connectionwithmysql.models.Assignee;
import ed0wn.connectionwithmysql.repository.IAssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private IAssigneeRepository iAssigneeRepository;

  @Autowired
  public AssigneeServiceImp (IAssigneeRepository repository){
    this.iAssigneeRepository=repository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> toDoList = new ArrayList<>();
    iAssigneeRepository.findAll().forEach(toDoList::add);
    return toDoList;
  }

  @Override
  public Assignee findById(long id) {
    return iAssigneeRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Assignee assignee) {
  iAssigneeRepository.save(assignee);
  }

  @Override
  public void delete(long id) {
  iAssigneeRepository.deleteById(id);
  }

  @Override
  public List<Assignee> findAllByName(String name) {
    return iAssigneeRepository.findAllByName(name);
  }
}
