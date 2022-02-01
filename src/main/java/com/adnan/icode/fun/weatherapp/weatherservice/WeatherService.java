package com.adnan.icode.fun.weatherapp.weatherservice;

import com.adnan.icode.fun.weatherapp.main.models.CurrentAirPollution;
import com.adnan.icode.fun.weatherapp.main.models.CurrentOneCall;
import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;

public interface WeatherService {
	
	public CurrentWeatherByCity getCurrentWeatherByCity(String cityName,String mode);
	
	public CurrentAirPollution getAirPollutionData(float lat, float lon);
	
	public CurrentOneCall getCurrentOneCall(float lat, float lon, String option);

}
