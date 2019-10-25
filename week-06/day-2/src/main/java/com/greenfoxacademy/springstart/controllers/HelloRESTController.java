package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {
  AtomicLong atomicLong= new AtomicLong();
  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name){
    Greeting greeting= new Greeting(atomicLong.addAndGet(1),"Hello, " + name + "!");
    return greeting;
  }
}
