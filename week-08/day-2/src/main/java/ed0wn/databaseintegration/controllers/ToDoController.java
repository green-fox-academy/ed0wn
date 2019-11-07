package ed0wn.databaseintegration.controllers;

import ed0wn.databaseintegration.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository){
    this.repository=repository;
  }
  @GetMapping({"/", "/list"})
  public String list(Model model){
    model.addAttribute("todo", repository.findAll());
    return "todolist";
  }
}
