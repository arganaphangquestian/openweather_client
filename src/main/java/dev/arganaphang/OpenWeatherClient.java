package dev.arganaphang;

import dev.arganaphang.response.WeatherResponse;
import dev.arganaphang.service.WeatherService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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
            Date dt = new Date();
            Calendar c = Calendar.getInstance();
            SimpleDateFormat f = new SimpleDateFormat("E, dd MM yyyy");
            c.setTime(dt);
            for (int i = 0; i < Objects.requireNonNull(res).getDaily().size(); i++) {
                c.add(Calendar.DATE, 1);
                System.out.printf("%s: %s°C\n", f.format(c.getTime()), res.getDaily().get(i).getTemp().getDay());
            }
        } catch (IOException e) {
            // Error
        }
    }
}
