package ed0wn.greenfox.controllers;

import ed0wn.greenfox.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenfoxController {
  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String greenFox(){
    return "index";
  }

  @GetMapping("gfa/list")
  public String studentList(Model model){
    model.addAttribute("students",studentService.findAll());
    return "list";
  }
}
