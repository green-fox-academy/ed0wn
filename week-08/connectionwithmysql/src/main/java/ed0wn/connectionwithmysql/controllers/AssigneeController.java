package ed0wn.connectionwithmysql.controllers;

import ed0wn.connectionwithmysql.models.Assignee;
import ed0wn.connectionwithmysql.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/assignees")
public class AssigneeController {

  IAssigneeService service;

  @Autowired
  public AssigneeController(IAssigneeService service) {
    this.service = service;
  }

  @GetMapping("")
  public String assigneeList(Model model) {
    model.addAttribute("assignee", service.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id) {
    service.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "assignee") Assignee assigneeToAdd) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String save(@ModelAttribute(name = "assignee") Assignee assigneeToAdd) {
    service.save(assigneeToAdd);
    return "redirect:/todo/assignees";
  }
}
