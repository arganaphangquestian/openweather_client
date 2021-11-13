package dev.arganaphang.service;

import dev.arganaphang.response.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {
    @GET("onecall?lat=-6.21462&lon=106.845131&units=metric&exclude=minutely,hourly,alert,current&appid=78dc786c8d79f9719a00dbec32cb28b2")
    Call<WeatherResponse> getWeather();
}
