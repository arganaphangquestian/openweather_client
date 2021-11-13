package dev.arganaphang.response;

import com.squareup.moshi.Json;

public class WeatherItem{

	@Json(name = "icon")
	private String icon;

	@Json(name = "description")
	private String description;

	@Json(name = "main")
	private String main;

	@Json(name = "id")
	private int id;

	public String getIcon(){
		return icon;
	}

	public String getDescription(){
		return description;
	}

	public String getMain(){
		return main;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"WeatherItem{" + 
			"icon = '" + icon + '\'' + 
			",description = '" + description + '\'' + 
			",main = '" + main + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}