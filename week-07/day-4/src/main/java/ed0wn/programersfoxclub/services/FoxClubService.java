package ed0wn.programersfoxclub.services;

import ed0wn.programersfoxclub.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxClubService {

  private List<Fox> foxList= new ArrayList<>();

  public List<Fox> getFoxList() {
    return foxList;
  }

  public void addFox(Fox fox){
    foxList.add(fox);
  }
}
