package ed0wn.redditproject.controllers;

import ed0wn.redditproject.models.Post;
import ed0wn.redditproject.services.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PostController {

  private IPostService service;

  @Autowired
  public PostController(IPostService service){
    this.service=service;
  }

  @GetMapping(value = {"", "/", "/{page}"})
  public String main(@PathVariable(name = "page", required = false) Integer page, Model model){
    if (page == null) {
      page = 0;
    }
    List<Post> postList;
    postList=service.findAll().stream().sorted(Comparator.comparingInt(Post::getVotes).reversed()).collect(Collectors.toList());
    model.addAttribute("posts",postList.stream().skip(page*10).limit(10).collect(Collectors.toList()));
    model.addAttribute("next", page + 1);
    if (page>1) {
      model.addAttribute("previous", page - 1);
    }
    else{
      model.addAttribute("previous", page =0);
    }
    return "index";
  }

  @GetMapping(value = "/submit")
  public String add(@ModelAttribute(name = "post") Post postToAdd) {
    return "submit";
  }

  @PostMapping(value = "/submit")
  public String save(@ModelAttribute(name = "dog") Post postToAdd) {
    service.save(postToAdd);
    return "redirect:/";
  }

  @GetMapping(value = "/upvote/{id}")
  public String upvote(@PathVariable(name = "id") long id) {
    service.upVote(id);
    return "redirect:/";
  }

  @GetMapping(value = "/downvote/{id}")
  public String downvote(@PathVariable(name = "id") long id) {
    service.downVote(id);
    return "redirect:/";
  }
}
