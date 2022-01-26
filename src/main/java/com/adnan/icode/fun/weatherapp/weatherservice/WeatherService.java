package com.adnan.icode.fun.weatherapp.weatherservice;

import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;

public interface WeatherService {
	
	public CurrentWeatherByCity getCurrentWeatherByCity(String cityName,String mode);

}
