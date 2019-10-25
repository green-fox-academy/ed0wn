package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private long greetCount;
  private String content;

  public void setGreetCount(long id) {
    this.greetCount = id;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public String getContent() {
    return content;
  }

  public Greeting(long greetCount, String content) {
    this.greetCount = greetCount;
    this.content = content;
  }
}
