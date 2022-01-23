package com.adnan.icode.fun.weatherapp.main.models;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Clouds;
import com.adnan.icode.fun.weatherapp.models.object.CoOrdinates;
import com.adnan.icode.fun.weatherapp.models.object.SysInfo;
import com.adnan.icode.fun.weatherapp.models.object.Temperature;
import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.adnan.icode.fun.weatherapp.models.object.Wind;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeatherByCity {
	
	private CoOrdinates coord;
	
	private List<Weather> weather;
	
//	private String base;
	
	private Temperature main;
	
	private int visibility;
	
	private Wind wind;
	
	private Clouds clouds;
	
	private SysInfo sys;
	
	private int timezone;
   
	private int id;
    
	private String name;
    
	private int cod;
	
	public CurrentWeatherByCity() {
		
	}

	public CoOrdinates getCoord() {
		return coord;
	}

	public void setCoord(CoOrdinates coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Temperature getMain() {
		return main;
	}

	public void setMain(Temperature main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public SysInfo getSys() {
		return sys;
	}

	public void setSys(SysInfo sys) {
		this.sys = sys;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "CurrentWeatherByCity [coord=" + coord + ", weather=" + weather + ", main=" + main + ", visibility="
				+ visibility + ", wind=" + wind + ", clouds=" + clouds + ", sys=" + sys + ", timezone=" + timezone
				+ ", id=" + id + ", name=" + name + ", cod=" + cod + ", getCoord()=" + getCoord() + ", getWeather()="
				+ getWeather() + ", getMain()=" + getMain() + ", getVisibility()=" + getVisibility() + ", getWind()="
				+ getWind() + ", getClouds()=" + getClouds() + ", getSys()=" + getSys() + ", getTimezone()="
				+ getTimezone() + ", getId()=" + getId() + ", getName()=" + getName() + ", getCod()=" + getCod()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
	
	
	

}
