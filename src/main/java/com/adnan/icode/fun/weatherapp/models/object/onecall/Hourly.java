package com.adnan.icode.fun.weatherapp.models.object.onecall;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Weather;

public class Hourly {
	
	private int dt;
	
	private float temp;
	
	 public int pressure;
	 
	 public int humidity;
	  
	 public float dew_point;
	 
	 public float uvi;
	 
	 public int clouds;
	 
	 public int visibility;
	 
	 public float wind_speed;
	 
	 public float wind_gust;
	    
	 public List<Weather> weather;

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public float getDew_point() {
		return dew_point;
	}

	public void setDew_point(float dew_point) {
		this.dew_point = dew_point;
	}

	public float getUvi() {
		return uvi;
	}

	public void setUvi(float uvi) {
		this.uvi = uvi;
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public float getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(float wind_speed) {
		this.wind_speed = wind_speed;
	}

	public float getWind_gust() {
		return wind_gust;
	}

	public void setWind_gust(float wind_gust) {
		this.wind_gust = wind_gust;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	 
	 
	    

}
