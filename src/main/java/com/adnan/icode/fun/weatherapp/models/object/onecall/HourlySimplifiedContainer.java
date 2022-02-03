package com.adnan.icode.fun.weatherapp.models.object.onecall;

import java.util.ArrayList;
import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.adnan.icode.fun.weatherapp.unixtimestamp.HumanTime;

public class HourlySimplifiedContainer {
	
	private List<Hourly> tempHours;
	
	private List<Weather> tempWeathers;
	
	private List<String> tempDateTime;
	
	//container for single list
	private List<SingleHourList> hourLists;
	
	
	
	public HourlySimplifiedContainer() {
		
	}
	
	//simplifier for Hours, Weather, DateTime
	public HourlySimplifiedContainer(List<Hourly> tempHourlyContainer, int timeOffSet) {
		
		tempHours = tempHourlyContainer;
		
		tempWeathers = new ArrayList<Weather>();
		
		tempDateTime = new ArrayList<String>();
		
		hourLists = new ArrayList<>();
		
		HumanTime tempTimeConverter = new HumanTime();
		
		
		int tempTime ;
		
		String dateContainer;
		
		 int loop = tempHourlyContainer.size();
		
		
		for(int i = 0; i < loop; i++) {
			
			tempWeathers.add(i, tempHours.get(i).getWeather().get(0));
		
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempHours.get(i).getDt();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			tempDateTime.add(dateContainer);
			
		}
		

		
		
		
		
		for(int i = 0; i < loop; i++) {
			
			SingleHourList tempSingleHourListContainer = new SingleHourList();
			
			tempSingleHourListContainer.setTemp(tempHours.get(i).getTemp());
			
			tempSingleHourListContainer.setPressure(tempHours.get(i).getPressure());
			
			tempSingleHourListContainer.setHumidity(tempHours.get(i).getHumidity());
			
			tempSingleHourListContainer.setDew_point(tempHours.get(i).getDew_point());
			
			tempSingleHourListContainer.setUvi(tempHours.get(i).getUvi());
			
			tempSingleHourListContainer.setClouds(tempHours.get(i).getClouds());
			
			tempSingleHourListContainer.setVisibility(tempHours.get(i).getVisibility());
			
			tempSingleHourListContainer.setWind_speed(tempHours.get(i).getWind_speed());
			
			tempSingleHourListContainer.setWind_gust(tempHours.get(i).getWind_gust());
			
			tempSingleHourListContainer.setDescription(tempWeathers.get(i).getDescription());
			
			tempSingleHourListContainer.setIcon(tempWeathers.get(i).getIcon());
			
			tempSingleHourListContainer.setDateTime(tempDateTime.get(i));
			
			hourLists.add(i, tempSingleHourListContainer);
			
		}
		
	}
	
	

	public List<SingleHourList> getHourLists() {
		return hourLists;
	}

	public void setHourLists(List<SingleHourList> hourLists) {
		this.hourLists = hourLists;
	}

	public List<Hourly> getTempHours() {
		return tempHours;
	}

	public void setTempHours(List<Hourly> tempHours) {
		this.tempHours = tempHours;
	}

	public List<Weather> getTempWeathers() {
		return tempWeathers;
	}

	public void setTempWeathers(List<Weather> tempWeathers) {
		this.tempWeathers = tempWeathers;
	}

	public List<String> getTempDateTime() {
		return tempDateTime;
	}

	public void setTempDateTime(List<String> tempDateTime) {
		this.tempDateTime = tempDateTime;
	}
	
	
	

}
