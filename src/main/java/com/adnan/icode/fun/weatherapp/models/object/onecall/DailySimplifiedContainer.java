package com.adnan.icode.fun.weatherapp.models.object.onecall;

import java.util.ArrayList;
import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.adnan.icode.fun.weatherapp.unixtimestamp.HumanTime;

public class DailySimplifiedContainer {
	
	private List<Daily> tempDaily;
	
	private List<Weather> tempWeathers;
	
	private List<String> tempCurrentDateTime;
	
	private List<String> tempSunRiseDateTime;
	
	private List<String> tempSunSetDateTime;
	
	private List<String> tempMoonRiseDateTime;
	
	private List<String> tempMoonSetDateTime;
	
	private List<SingleDayList> dayLists;
	
	public DailySimplifiedContainer(List<Daily> tempDailyContainer, int timeOffSet) {
		
		tempDaily = tempDailyContainer;
		
		tempWeathers = new ArrayList<Weather>();
		
		tempCurrentDateTime = new ArrayList<String>();
		
		tempSunRiseDateTime = new ArrayList<String>();
		
		tempSunSetDateTime = new ArrayList<String>();
		
		tempMoonRiseDateTime = new ArrayList<String>();
		
		tempMoonSetDateTime = new ArrayList<String>();
		
		dayLists = new ArrayList<>();
		
		HumanTime tempTimeConverter = new HumanTime();
		
		int tempTime ;
		
		String dateContainer;
		
		 int loop = tempDailyContainer.size();
		
		
		for(int i = 0; i < loop; i++) {
			
			tempWeathers.add(i, tempDaily.get(i).getWeather().get(0));
		
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempDaily.get(i).getDt();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			tempCurrentDateTime.add(dateContainer);
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempDaily.get(i).getSunrise();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			dateContainer = (dateContainer.substring(dateContainer.indexOf(" ")+1));
			
			tempSunRiseDateTime.add(dateContainer);
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempDaily.get(i).getSunset();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			dateContainer = (dateContainer.substring(dateContainer.indexOf(" ")+1));
			
			tempSunSetDateTime.add(dateContainer);
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempDaily.get(i).getMoonrise();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			dateContainer = (dateContainer.substring(dateContainer.indexOf(" ")+1));
			
			tempMoonRiseDateTime.add(dateContainer);
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			tempTime = timeOffSet + tempDaily.get(i).getMoonset();
			
			dateContainer = tempTimeConverter.unixTimeToHumanReadable(tempTime);
			
			dateContainer = (dateContainer.substring(dateContainer.indexOf(" ")+1));
			
			tempMoonSetDateTime.add(dateContainer);
			
		}
		
	
		
		
		for(int i = 0; i < loop; i++) {
			
			SingleDayList tempSingleDayListContainer = new SingleDayList();
			
			tempSingleDayListContainer.setDayTemp(tempDaily.get(i).getTemp().getDay());
			
			tempSingleDayListContainer.setDayMax(tempDaily.get(i).getTemp().getMax());
			
			tempSingleDayListContainer.setDayMin(tempDaily.get(i).getTemp().getMin());
			
			tempSingleDayListContainer.setNightTemp(tempDaily.get(i).getTemp().getNight());
			
			tempSingleDayListContainer.setEveningTemp(tempDaily.get(i).getTemp().getEve());
			
			tempSingleDayListContainer.setMorningTemp(tempDaily.get(i).getTemp().getMorn());
			
			tempSingleDayListContainer.setPressure(tempDaily.get(i).getPressure());
			
			tempSingleDayListContainer.setHumidity(tempDaily.get(i).getHumidity());
			
			tempSingleDayListContainer.setDew_point(tempDaily.get(i).getDew_point());
					
			tempSingleDayListContainer.setWind_speed(tempDaily.get(i).getWind_speed());
			
			tempSingleDayListContainer.setWind_gust(tempDaily.get(i).getWind_gust());
			
			tempSingleDayListContainer.setDescription(tempWeathers.get(i).getDescription());
			
			tempSingleDayListContainer.setIcon(tempWeathers.get(i).getIcon());
			
			tempSingleDayListContainer.setClouds(tempDaily.get(i).getClouds());
			
			tempSingleDayListContainer.setUvi(tempDaily.get(i).getUvi());
			
			tempSingleDayListContainer.setDateTime(tempCurrentDateTime.get(i));
			
			tempSingleDayListContainer.setSunRise(tempSunRiseDateTime.get(i));			
			
			tempSingleDayListContainer.setSunSet(tempSunSetDateTime.get(i));
			
			tempSingleDayListContainer.setMoonRise(tempMoonRiseDateTime.get(i));
			
			tempSingleDayListContainer.setMoonSet(tempMoonSetDateTime.get(i));
			
			
			dayLists.add(i, tempSingleDayListContainer);
			
		}
		
		
		
		
	}

	public List<Daily> getTempDaily() {
		return tempDaily;
	}

	public void setTempDaily(List<Daily> tempDaily) {
		this.tempDaily = tempDaily;
	}



	public List<Weather> getTempWeathers() {
		return tempWeathers;
	}

	public void setTempWeathers(List<Weather> tempWeathers) {
		this.tempWeathers = tempWeathers;
	}

	public List<String> getTempCurrentDateTime() {
		return tempCurrentDateTime;
	}

	public void setTempCurrentDateTime(List<String> tempCurrentDateTime) {
		this.tempCurrentDateTime = tempCurrentDateTime;
	}

	public List<String> getTempSunRiseDateTime() {
		return tempSunRiseDateTime;
	}

	public void setTempSunRiseDateTime(List<String> tempSunRiseDateTime) {
		this.tempSunRiseDateTime = tempSunRiseDateTime;
	}

	public List<String> getTempSunSetDateTime() {
		return tempSunSetDateTime;
	}

	public void setTempSunSetDateTime(List<String> tempSunSetDateTime) {
		this.tempSunSetDateTime = tempSunSetDateTime;
	}

	public List<String> getTempMoonRiseDateTime() {
		return tempMoonRiseDateTime;
	}

	public void setTempMoonRiseDateTime(List<String> tempMoonRiseDateTime) {
		this.tempMoonRiseDateTime = tempMoonRiseDateTime;
	}

	public List<String> getTempMoonSetDateTime() {
		return tempMoonSetDateTime;
	}

	public void setTempMoonSetDateTime(List<String> tempMoonSetDateTime) {
		this.tempMoonSetDateTime = tempMoonSetDateTime;
	}

	public List<SingleDayList> getDayLists() {
		return dayLists;
	}

	public void setDayLists(List<SingleDayList> dayLists) {
		this.dayLists = dayLists;
	}

	
	

}
