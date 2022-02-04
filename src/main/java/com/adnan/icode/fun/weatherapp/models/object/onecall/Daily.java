package com.adnan.icode.fun.weatherapp.models.object.onecall;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {

    private int dt;
    
    private int sunrise;
    
    private int sunset;
    
    private int moonrise;
    
    private int moonset;
       
    private DayTemp temp;
    
    private int pressure;
    
    private int humidity;
    
    private float dew_point;
    
    private float wind_speed;
    
    private int wind_deg;
    
    private float wind_gust;
    
    private List<Weather> weather;
    
    private int clouds;
    
    private float uvi;

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public int getSunrise() {
		return sunrise;
	}

	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}

	public int getSunset() {
		return sunset;
	}

	public void setSunset(int sunset) {
		this.sunset = sunset;
	}

	public int getMoonrise() {
		return moonrise;
	}

	public void setMoonrise(int moonrise) {
		this.moonrise = moonrise;
	}

	public int getMoonset() {
		return moonset;
	}

	public void setMoonset(int moonset) {
		this.moonset = moonset;
	}

	public DayTemp getTemp() {
		return temp;
	}

	public void setTemp(DayTemp temp) {
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

	public float getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(float wind_speed) {
		this.wind_speed = wind_speed;
	}

	public int getWind_deg() {
		return wind_deg;
	}

	public void setWind_deg(int wind_deg) {
		this.wind_deg = wind_deg;
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

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public float getUvi() {
		return uvi;
	}

	public void setUvi(float uvi) {
		this.uvi = uvi;
	}
    
    

	

}
