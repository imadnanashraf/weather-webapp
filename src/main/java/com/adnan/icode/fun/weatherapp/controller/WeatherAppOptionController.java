package com.adnan.icode.fun.weatherapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adnan.icode.fun.weatherapp.main.models.CurrentOneCall;
import com.adnan.icode.fun.weatherapp.models.object.onecall.Hourly;
import com.adnan.icode.fun.weatherapp.models.object.onecall.HourlySimplifiedContainer;
import com.adnan.icode.fun.weatherapp.weatherservice.WeatherService;

@Controller
@RequestMapping("/weather/option")
public class WeatherAppOptionController {
	
	
	
	@Autowired
	private WeatherService currentWeatherService;
	
	@GetMapping("/oneHour")
	public String getOneHour(@RequestParam("lat") float lat,
							 @RequestParam("lon") float lon,
							 @RequestParam("page") int pNum,
							 @RequestParam("city") String city,
							 Model theModel) {
		
		//calling service onecall api for data
		CurrentOneCall tempCurrentOneCall = currentWeatherService.
											getCurrentOneCall(lat, lon, "hourly");
		
		
		
		//object simplifier
		HourlySimplifiedContainer hourContainer = new HourlySimplifiedContainer
													(tempCurrentOneCall.getHourly(), tempCurrentOneCall.getTimezone_offset());
		
		//city name
		theModel.addAttribute("city", city);
		// hourly info
		theModel.addAttribute("hourlyInfo", hourContainer.getHourLists());
		//for pagination
		theModel.addAttribute("lat", lat);
		theModel.addAttribute("lng", lon);
		
		//page Info
		double hourSize = hourContainer.getHourLists().size();

		double perPage = 16;
		
		int totalPage = (int) Math.ceil((double)hourSize/perPage);
		
		// adding total page dynamically
		List<Integer> totalPageList = new ArrayList<>();
		for(int i = 1; i <= totalPage;i++) {
		totalPageList.add(i);
			
		}
		
		theModel.addAttribute("totalPage", totalPageList);
		
		//adding current page
		theModel.addAttribute("page", pNum);
		
		System.out.println(totalPage);
		
		return "onehour";
	}

}
