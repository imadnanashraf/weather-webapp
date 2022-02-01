package com.adnan.icode.fun.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adnan.icode.fun.weatherapp.main.models.CurrentOneCall;
import com.adnan.icode.fun.weatherapp.weatherservice.WeatherService;

@Controller
@RequestMapping("/weather/option")
public class WeatherAppOptionController {
	
	@Autowired
	private WeatherService currentWeatherService;
	
	@GetMapping("/oneHour")
	public String getOneHour(@RequestParam("lat") float lat,
							 @RequestParam("lon") float lon,
							 Model theModel) {
		
		CurrentOneCall tempCurrentOneCall = currentWeatherService.getCurrentOneCall(lat, lon, "hourly");
		
		System.out.println("in one hour");
		
		return "onehour";
	}

}
