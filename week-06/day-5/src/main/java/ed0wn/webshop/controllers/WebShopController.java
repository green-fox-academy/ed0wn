package ed0wn.webshop.controllers;

import ed0wn.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

  List<ShopItem> shopItems = new ArrayList<>();
  public WebShopController(){
    shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport",1000.0, 5));
    shopItems.add(new ShopItem("Printer","Some HP printer that will print pages", 3000.0,2));
    shopItems.add(new ShopItem("Coca cola", "0.5l standard coke",25.0,0));
    shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike",300.0,1));
  }

  @GetMapping("webshop")
  public String webShopList(Model model){
    model.addAttribute("shopItems", shopItems);
    return "index";
  }

  @GetMapping("webshop/only-available")
  public String onlyAvailable(Model model){
    model.addAttribute("shopItems", shopItems.stream().filter(shopItem -> shopItem.getQuantity()>0).collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("webshop/cheapest-first")
  public String cheapestFirst(Model model){
    model.addAttribute("shopItems", shopItems.stream().sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("webshop/contains-nike")
  public String containsNike(Model model){
    model.addAttribute("shopItems", shopItems.stream().filter(shopItem -> shopItem.getDescription().toLowerCase().contains("nike")).collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("webshop/average-stock")
  public String averageStock(Model model){
    model.addAttribute("shopItems", shopItems.stream().mapToDouble(ShopItem::getQuantity).average().getAsDouble());
    return "average";
  }
}
