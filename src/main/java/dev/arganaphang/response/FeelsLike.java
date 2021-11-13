package dev.arganaphang.response;

import com.squareup.moshi.Json;

public class FeelsLike{

	@Json(name = "eve")
	private double eve;

	@Json(name = "night")
	private double night;

	@Json(name = "day")
	private double day;

	@Json(name = "morn")
	private double morn;

	public double getEve(){
		return eve;
	}

	public double getNight(){
		return night;
	}

	public double getDay(){
		return day;
	}

	public double getMorn(){
		return morn;
	}

	@Override
 	public String toString(){
		return 
			"FeelsLike{" + 
			"eve = '" + eve + '\'' + 
			",night = '" + night + '\'' + 
			",day = '" + day + '\'' + 
			",morn = '" + morn + '\'' + 
			"}";
		}
}