package ed0wn.examtemp.controllers;

import ed0wn.examtemp.services.BBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  private BBService service;

  @Autowired
  public MyRestController(BBService service) {
    this.service = service;
  }

  @GetMapping("/list")
  public ResponseEntity<?> getAllChar() {
    return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
  }

  @PutMapping("/data")
  public ResponseEntity<?> saveAllChar(){
    service.getCharacters();
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
