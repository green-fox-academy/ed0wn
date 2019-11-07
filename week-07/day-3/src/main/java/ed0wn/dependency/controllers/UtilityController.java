package ed0wn.dependency.controllers;

import ed0wn.dependency.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String useful(Model model){
    model.addAttribute("rcolor", utilityService.randomColor());
    return "index";
  }

  @GetMapping("/useful/email")
  public String email(@RequestParam String email, Model model){
    model.addAttribute("validator",utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("useful/caesar")
  public String cesar(@RequestParam("number") int number, @RequestParam("word") String word, Model model){
    model.addAttribute("caesar", utilityService.caesar(word,number));
    return "index";
  }
}
