package dev.arganaphang.response;

import java.util.List;
import com.squareup.moshi.Json;

public class DailyItem{

	@Json(name = "moonset")
	private double moonset;

	@Json(name = "rain")
	private double rain;

	@Json(name = "sunrise")
	private double sunrise;

	@Json(name = "temp")
	private Temp temp;

	@Json(name = "moon_phase")
	private double moonPhase;

	@Json(name = "uvi")
	private double uvi;

	@Json(name = "moonrise")
	private double moonrise;

	@Json(name = "pressure")
	private double pressure;

	@Json(name = "clouds")
	private double clouds;

	@Json(name = "feels_like")
	private FeelsLike feelsLike;

	@Json(name = "wind_gust")
	private double windGust;

	@Json(name = "dt")
	private double dt;

	@Json(name = "pop")
	private double pop;

	@Json(name = "wind_deg")
	private double windDeg;

	@Json(name = "dew_point")
	private double dewPoint;

	@Json(name = "sunset")
	private double sunset;

	@Json(name = "weather")
	private List<WeatherItem> weather;

	@Json(name = "humidity")
	private double humidity;

	@Json(name = "wind_speed")
	private double windSpeed;

	public double getMoonset(){
		return moonset;
	}

	public double getRain(){
		return rain;
	}

	public double getSunrise(){
		return sunrise;
	}

	public Temp getTemp(){
		return temp;
	}

	public double getMoonPhase(){
		return moonPhase;
	}

	public double getUvi(){
		return uvi;
	}

	public double getMoonrise(){
		return moonrise;
	}

	public double getPressure(){
		return pressure;
	}

	public double getClouds(){
		return clouds;
	}

	public FeelsLike getFeelsLike(){
		return feelsLike;
	}

	public double getWindGust(){
		return windGust;
	}

	public double getDt(){
		return dt;
	}

	public double getPop(){
		return pop;
	}

	public double getWindDeg(){
		return windDeg;
	}

	public double getDewPoint(){
		return dewPoint;
	}

	public double getSunset(){
		return sunset;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public double getHumidity(){
		return humidity;
	}

	public double getWindSpeed(){
		return windSpeed;
	}

	@Override
 	public String toString(){
		return 
			"DailyItem{" + 
			"moonset = '" + moonset + '\'' + 
			",rain = '" + rain + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",temp = '" + temp + '\'' + 
			",moon_phase = '" + moonPhase + '\'' + 
			",uvi = '" + uvi + '\'' + 
			",moonrise = '" + moonrise + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",clouds = '" + clouds + '\'' + 
			",feels_like = '" + feelsLike + '\'' + 
			",wind_gust = '" + windGust + '\'' + 
			",dt = '" + dt + '\'' + 
			",pop = '" + pop + '\'' + 
			",wind_deg = '" + windDeg + '\'' + 
			",dew_point = '" + dewPoint + '\'' + 
			",sunset = '" + sunset + '\'' + 
			",weather = '" + weather + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			"}";
		}
}