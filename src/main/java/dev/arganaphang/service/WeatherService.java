package dev.arganaphang.service;

import dev.arganaphang.response.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {
    REPLACE (APIKEY) with your API KEY
    @GET("onecall?lat=-6.21462&lon=106.845131&units=metric&exclude=minutely,hourly,alert,current&appid=(APIKEY)")
    Call<WeatherResponse> getWeather();
}
