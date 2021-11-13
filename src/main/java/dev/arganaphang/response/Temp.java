package dev.arganaphang.response;

import com.squareup.moshi.Json;

public class Temp{

	@Json(name = "min")
	private double min;

	@Json(name = "max")
	private double max;

	@Json(name = "eve")
	private double eve;

	@Json(name = "night")
	private double night;

	@Json(name = "day")
	private double day;

	@Json(name = "morn")
	private double morn;

	public double getMin(){
		return min;
	}

	public double getMax(){
		return max;
	}

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
			"Temp{" + 
			"min = '" + min + '\'' + 
			",max = '" + max + '\'' + 
			",eve = '" + eve + '\'' + 
			",night = '" + night + '\'' + 
			",day = '" + day + '\'' + 
			",morn = '" + morn + '\'' + 
			"}";
		}
}