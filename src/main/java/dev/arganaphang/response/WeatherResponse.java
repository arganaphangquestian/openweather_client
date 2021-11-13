package dev.arganaphang.response;

import java.util.List;
import com.squareup.moshi.Json;

public class WeatherResponse {

	@Json(name = "timezone")
	private String timezone;

	@Json(name = "timezone_offset")
	private int timezoneOffset;

	@Json(name = "daily")
	private List<DailyItem> daily;

	@Json(name = "lon")
	private double lon;

	@Json(name = "lat")
	private double lat;

	public String getTimezone(){
		return timezone;
	}

	public int getTimezoneOffset(){
		return timezoneOffset;
	}

	public List<DailyItem> getDaily(){
		return daily;
	}

	public double getLon(){
		return lon;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"WeatherResponse{" +
			"timezone = '" + timezone + '\'' + 
			",timezone_offset = '" + timezoneOffset + '\'' + 
			",daily = '" + daily + '\'' + 
			",lon = '" + lon + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}