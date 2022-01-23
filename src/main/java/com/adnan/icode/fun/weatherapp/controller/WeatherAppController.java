package com.adnan.icode.fun.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;
import com.adnan.icode.fun.weatherapp.weatherservice.WeatherService;

@Controller
@RequestMapping("/get")
public class WeatherAppController {
	
	@Autowired
	private WeatherService currentWeatherService;
	
	@GetMapping("getCityWeather")
	public String getCityWeather(String theCityName) {
		
		CurrentWeatherByCity currentWeather = currentWeatherService.
											  getCurrentWeatherByCity(theCityName);
		
		return "index";
	}
	

}
