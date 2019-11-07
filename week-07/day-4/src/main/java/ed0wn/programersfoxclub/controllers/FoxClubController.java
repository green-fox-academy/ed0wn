package ed0wn.programersfoxclub.controllers;

import ed0wn.programersfoxclub.models.Fox;
import ed0wn.programersfoxclub.services.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxClubController {

  private FoxClubService service;

  @Autowired
  public FoxClubController(FoxClubService service){
    this.service=service;
  }

  @GetMapping(value = {"/"})
  public String index(){
    return "index";
  }

  @GetMapping(value = "/login")
  public String addNewFox(@ModelAttribute(name = "fox") Fox foxToAdd) {
    return "login";
  }

  @PostMapping(value = "/login")
  public String saveNewFox(@ModelAttribute(name = "fox") Fox foxToAdd, @RequestParam(name = "name") String name) {
    foxToAdd.setName(name);
    service.addFox(foxToAdd);
    return "redirect:/name?="+foxToAdd.getName();
  }
}
