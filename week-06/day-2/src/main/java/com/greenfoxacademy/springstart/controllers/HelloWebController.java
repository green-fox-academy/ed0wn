package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
  AtomicLong atomicLong= new AtomicLong();
  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name",  name);
    model.addAttribute("id", atomicLong.incrementAndGet());
    return "greeting";
  }

//  @RequestMapping("/web/hellos")
//  public String foreignGreeting(@PathVariable ()@RequestParam String[] hellos, Model model) {
//    hellos = new String[]{"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
//            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
//            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
//            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
//    model.addAttribute("name", hellos);
//    model.addAttribute("id", atomicLong.incrementAndGet());
//    return "greeting";
//  }
//  @RequestMapping("/products/{code}")
//  public String greeting(@PathVariable(value = "code") String code,
//                           @RequestParam(value = "category", required = false) String category) {
//    return "greeting";
//  }
}
