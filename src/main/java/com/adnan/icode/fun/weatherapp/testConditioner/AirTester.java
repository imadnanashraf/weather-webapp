package com.adnan.icode.fun.weatherapp.testConditioner;

public class AirTester {
	
	public String airIndexTester(float condition) {
		if(condition == 1) {
			return "AQI: Good";
		}
		if(condition == 2) {
			return "AQI: Fair";
		}
		if (condition == 3) {
			return "AQI: Moderate";
		}
		if(condition == 4) {
			return "AQI: Poor";
		}
		if(condition == 5) {
			return "AQI: Very Poor";
		}
		
		return "Not Available";
	}

}
