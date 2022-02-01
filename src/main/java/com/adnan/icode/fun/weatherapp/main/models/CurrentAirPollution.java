package com.adnan.icode.fun.weatherapp.main.models;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.AirPollutionIndex;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentAirPollution {
	
	private List<AirPollutionIndex> list;

	public List<AirPollutionIndex> getList() {
		return list;
	}

	public void setList(List<AirPollutionIndex> list) {
		this.list = list;
	}
	
	

}
