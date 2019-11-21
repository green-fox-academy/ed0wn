package ed0wn.exampleexam.controllers;

import ed0wn.exampleexam.exceptions.ResourceNotFoundException;
import ed0wn.exampleexam.models.Link;
import ed0wn.exampleexam.services.ILinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private ILinkService service;

  @Autowired
  MainController(ILinkService service){
    this.service=service;
  }

  @GetMapping(value = "/")
  public String add(Model model,
                    @RequestParam(required = false) String alias,
                    @RequestParam(required = false) String secretCode,
                    @RequestParam(required = false) String status,
                    @RequestParam(required = false) String url) {
    model.addAttribute("status", status == null ? "empty" : status);
    model.addAttribute("alias", alias);
    model.addAttribute("secretCode", secretCode);
    Link linkToDisplay= new Link();
    if (status != null  && status.equals("exists")) {
      linkToDisplay.setAlias(alias);
      linkToDisplay.setUrl(url);
    }
    model.addAttribute("link", linkToDisplay);
    return "index";
  }

  @PostMapping(value = "/save-link")
  public String save(@ModelAttribute(name = "link") Link linkToAdd) {
    if (service.findByAlias(linkToAdd.getAlias()) == null) {
      service.save(linkToAdd);
      return "redirect:/?alias=" + linkToAdd.getAlias() + "&secretCode=" + linkToAdd.getSecretCode() + "&status=non-exists" ;
    } else {
      return "redirect:/?status=exists&url=" +linkToAdd.getUrl() + "&alias=" + linkToAdd.getAlias();
    }
  }

  @GetMapping("/a/{alias}")
  public String goToUrl(@PathVariable String alias){
    Link storedLink = service.findByAlias(alias);
    if (storedLink != null){
      service.incrementHitCount(storedLink);
      service.save(storedLink);
      return "redirect:" + storedLink.getUrl();
    }else{
      throw new ResourceNotFoundException();
    }
  }
}
