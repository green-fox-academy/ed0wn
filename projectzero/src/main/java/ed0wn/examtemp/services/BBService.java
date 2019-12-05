package ed0wn.examtemp.services;

import ed0wn.examtemp.dots.BreakingBadCharactersDTO;
import ed0wn.examtemp.models.BBCharacter;
import ed0wn.examtemp.models.BBCharacterList;

import java.util.List;

public interface BBService {

  List<BBCharacter> findAll();
  void saveCharacters(List<BreakingBadCharactersDTO> characters);
  void getCharacters();
}
