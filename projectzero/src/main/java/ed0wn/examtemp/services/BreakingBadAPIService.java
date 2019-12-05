package ed0wn.examtemp.services;


import ed0wn.examtemp.dots.BreakingBadCharactersDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface BreakingBadAPIService {

  @GET("/api/characters")
  Call<List<BreakingBadCharactersDTO>> getCharacters();

  @GET("/api/characters/{id}")
  Call<BreakingBadCharactersDTO> getCharacter(@Path("id") Long id);
}
