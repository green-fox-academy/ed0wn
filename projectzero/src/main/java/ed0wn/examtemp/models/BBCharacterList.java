package ed0wn.examtemp.models;

import ed0wn.examtemp.dots.BreakingBadCharactersDTO;

import java.util.ArrayList;
import java.util.List;

public class BBCharacterList {
  List<BreakingBadCharactersDTO> list;

  public BBCharacterList() {
    list = new ArrayList<>();
  }

  public BBCharacterList(List<BreakingBadCharactersDTO> list) {
    this.list = list;
  }

  public List<BreakingBadCharactersDTO> getList() {
    return list;
  }

  public void setList(List<BreakingBadCharactersDTO> list) {
    this.list = list;
  }
}
