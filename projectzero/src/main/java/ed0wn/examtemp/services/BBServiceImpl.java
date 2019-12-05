package ed0wn.examtemp.services;

import ed0wn.examtemp.dots.BreakingBadCharactersDTO;
import ed0wn.examtemp.models.BBCharacter;
import ed0wn.examtemp.repositories.BBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

@Service
public class BBServiceImpl implements BBService {

  private BBRepository repository;
  private BreakingBadServiceAPIImpl breakingBadServiceAPI;
  private BreakingBadAPIService badAPIService;

  @Autowired
  public BBServiceImpl(BBRepository repository, BreakingBadServiceAPIImpl breakingBadServiceAPI){
    this.repository=repository;
    this.breakingBadServiceAPI=breakingBadServiceAPI;
    this.badAPIService = breakingBadServiceAPI.getMovieAPI();
  }

  @Override
  public List<BBCharacter> findAll() {
    List<BBCharacter> characters= new ArrayList<>();
    repository.findAll().forEach(characters::add);
    return characters;
  }

  @Override
  public void saveCharacters( List<BreakingBadCharactersDTO> characters) {
   characters.forEach( bbCharacter -> repository.save(new BBCharacter(bbCharacter.getChar_id(),bbCharacter.getName(),
           bbCharacter.getBirthday(),
           bbCharacter.getStatus(),
           bbCharacter.getNickname(),
           bbCharacter.getPortrayed())));
  }

  @Override
  public void getCharacters() {
    badAPIService.getCharacters().enqueue(new Callback<List<BreakingBadCharactersDTO>>() {
      @Override
      public void onResponse(Call<List<BreakingBadCharactersDTO>> call, Response<List<BreakingBadCharactersDTO>> response) {
        saveCharacters(response.body());
      }

      @Override
      public void onFailure(Call<List<BreakingBadCharactersDTO>> call, Throwable t) {
        t.printStackTrace();
      }
    });
  }
}
