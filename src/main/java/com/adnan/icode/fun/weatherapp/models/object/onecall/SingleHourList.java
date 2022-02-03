package com.adnan.icode.fun.weatherapp.models.object.onecall;

public class SingleHourList {
		
	 private float temp;
	
	 private int pressure;
	 
	 private int humidity;
	  
	 private float dew_point;
	 
	 private float uvi;
	 
	 private int clouds;
	 
	 private int visibility;
	 
	 private float wind_speed;
	 
	 private float wind_gust;
	 
	 private String description;
	 
	 private String icon;
	 
	 private String dateTime;
	 
	 public SingleHourList() {
		 
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	 
	 
}
