package ed0wn.examtemp.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Service
public class BreakingBadServiceAPIImpl {

  private Retrofit getConnectionToBBApi(String url) {
        Gson gson = new GsonBuilder()
        .setLenient()
        .create();

    return new Retrofit
            .Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();
  }

  public BreakingBadAPIService getMovieAPI() {
    return getConnectionToBBApi("https://www.breakingbadapi.com/api/").create(BreakingBadAPIService.class);
  }
//
//  private static final String BASE_URL = "https://www.breakingbadapi.com/api/";
//
//  private static Retrofit.Builder builder = new Retrofit.Builder()
//          .baseUrl(BASE_URL)
//          .addConverterFactory(GsonConverterFactory.create());
//
//  private static Retrofit retrofit = builder.build();
//  private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//
//  BreakingBadAPIService breakingBadService = retrofit.create(BreakingBadAPIService.class);
}
