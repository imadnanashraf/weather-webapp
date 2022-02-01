package com.adnan.icode.fun.weatherapp.main.models;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.onecall.Daily;
import com.adnan.icode.fun.weatherapp.models.object.onecall.Hourly;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentOneCall {
	
	private int timezone_offset;
	
	private List<Hourly> hourly;
	
	private List<Daily> daily;

	public int getTimezone_offset() {
		return timezone_offset;
	}

	public void setTimezone_offset(int timezone_offset) {
		this.timezone_offset = timezone_offset;
	}

	public List<Hourly> getHourly() {
		return hourly;
	}

	public void setHourly(List<Hourly> hourly) {
		this.hourly = hourly;
	}

	public List<Daily> getDaily() {
		return daily;
	}

	public void setDaily(List<Daily> daily) {
		this.daily = daily;
	}
	
	

}
