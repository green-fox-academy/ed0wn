package ed0wn.connectionwithmysql.controllers;

import ed0wn.connectionwithmysql.models.ToDo;
import ed0wn.connectionwithmysql.repository.ToDoRepository;
import ed0wn.connectionwithmysql.services.ToDoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoServiceImp serviceImp;

  @Autowired
  public ToDoController(ToDoServiceImp serviceImp) {
    this.serviceImp = serviceImp;
  }

//  @GetMapping({"/", "/list"})
//  public String list(Model model){
//    model.addAttribute("todo", serviceImp.findAll());
//    return "todolist";
//  }

  @GetMapping({"/", "/list"})
  public String extend(@RequestParam(value = "isActive", required = false) boolean isDone, Model model) {
    List<ToDo> toDos;
    if (isDone) {
      toDos = serviceImp.findAllByDone(isDone);
      model.addAttribute("todo", toDos);
      return "todolist";
    } else if (!isDone) {
      toDos = serviceImp.findAllByDone(isDone);
      model.addAttribute("todo", toDos);
      return "todolist";
    } else {
      model.addAttribute("todo", serviceImp.findAll());
      return "todolist";
    }
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "todo") ToDo toDoToAdd) {
    return "add";
  }

  @PostMapping(value = "todo/add")
  public String save(@ModelAttribute(name = "todo") ToDo toDoToAdd) {
    serviceImp.save(toDoToAdd);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id) {
    serviceImp.delete(id);
    return "redirect:/todo/list";
  }
  @PostMapping("/search")
  public String search(@RequestParam(value = "search") String search, Model model){
    model.addAttribute("todo", serviceImp.findAllByTitle(search));
    return "todolist";
  }
}
