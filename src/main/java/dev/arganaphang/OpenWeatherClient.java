package dev.arganaphang;

import dev.arganaphang.response.WeatherResponse;
import dev.arganaphang.service.WeatherService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;

public class OpenWeatherClient {
    public static void main(String[] args) {

        String API_URL = "https://api.openweathermap.org/data/2.5/";
        Retrofit client = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        WeatherService service = client.create(WeatherService.class);

        Call<WeatherResponse> weatherCall = service.getWeather();
        try {
            WeatherResponse res = weatherCall.execute().body();
            System.out.println(res.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
