package com.adnan.icode.fun.weatherapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adnan.icode.fun.weatherapp.main.models.CurrentAirPollution;
import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;
import com.adnan.icode.fun.weatherapp.models.object.AirPollutionIndex;
import com.adnan.icode.fun.weatherapp.models.object.CoOrdinates;
import com.adnan.icode.fun.weatherapp.models.object.SysInfo;
import com.adnan.icode.fun.weatherapp.models.object.Temperature;
import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.adnan.icode.fun.weatherapp.models.object.Wind;
import com.adnan.icode.fun.weatherapp.testConditioner.AirTester;
import com.adnan.icode.fun.weatherapp.unixtimestamp.HumanTime;
import com.adnan.icode.fun.weatherapp.weatherservice.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherAppController {
	 
	
	//no units defined
	String mode=null;
	
	
	@Autowired
	private WeatherService currentWeatherService;
	
	@Value("${maps.api.key}")
	private String mapApiKey;
	
	@GetMapping("/welcome")
	public String welcomme(Model theModel,
						   HttpServletRequest request) {
		
		String theCityName="";
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			
			for(Cookie tempCookie : cookies) {
				
				if("weatherApp.city".equals(tempCookie.getName())) {
					
					theCityName = tempCookie.getValue().replaceAll("-"," ");
					
				}
				
			}
			
		}else {
			theCityName = "srinagar";
		}
		
		theModel.addAttribute("city", theCityName);
		theModel.addAttribute("mapApiKey", mapApiKey);
		
		
		return "welcomeuser";
	}
	
	
	@GetMapping("/getCityWeather")
	public String getCityWeather(@RequestParam("city") String theCityName,
								 Model theModel,
								 HttpServletResponse response) {
		
		
		//get current city data
		CurrentWeatherByCity currentWeather = currentWeatherService.
											  getCurrentWeatherByCity(theCityName,mode);
				
		
		
		Weather cWeather = currentWeather.getWeather().get(0);
		Temperature cTemp	= currentWeather.getMain();
		Wind cWind = currentWeather.getWind();
		SysInfo cSys = currentWeather.getSys();
		//testing
		CoOrdinates cCor = currentWeather.getCoord();
		
		//get current city pollution data
		CurrentAirPollution currentAirPollutionTemplate = currentWeatherService.
												  getAirPollutionData(cCor.getLat(), cCor.getLon());
		
		AirPollutionIndex currentAirPollution =	currentAirPollutionTemplate.getList().get(0);
		
		//adding airpollution to model attribute
		
		float airIndex = currentAirPollution.getMain().getAqi();
		theModel.addAttribute("airIndex", airIndex);
		
		AirTester tempAirTester = new AirTester();
		String AirHealth = tempAirTester.airIndexTester(airIndex);
		theModel.addAttribute("review", AirHealth);
		
		airIndex = airIndex / 5 * 100;
		int airIndexPercent = (int) airIndex;
		theModel.addAttribute("airIndexPercent", airIndexPercent);
		
		float no2 = currentAirPollution.getComponents().getNo2();
		theModel.addAttribute("no2", no2);
		
		no2 = no2 / 400 * 100;
		int no2Percent = (int) no2;
		
		// so that percent does not exceed 100
		if(no2Percent >= 100) {
			no2Percent = 100;
		}
		
		theModel.addAttribute("no2Percent", no2Percent);
		System.out.println(no2);
		
		float pm10 = currentAirPollution.getComponents().getPm10();
		theModel.addAttribute("pm10", pm10);
		
		pm10 = pm10/180 * 100;
		int pm10Percent = (int) pm10;
		
		// so that percent does not exceed 100
		if(pm10Percent >= 100) {
			pm10Percent = 100;
		}
		
		theModel.addAttribute("pm10Percent", pm10Percent);
		
		float o3 = currentAirPollution.getComponents().getO3();
		theModel.addAttribute("o3", o3);
		
		o3 = o3 / 240 * 100;
		int o3Percent = (int) o3;
		
		// so that percent does not exceed 100
		if(o3Percent >= 100) {
			o3Percent = 100;
		}
		
		theModel.addAttribute("o3Percent", o3Percent);
		
		float pm25 = currentAirPollution.getComponents().getPm2_5();
		theModel.addAttribute("pm25", pm25);
		
		pm25 = pm25 / 110 * 100;
		int pm25Percent = (int) pm25;
		
		// so that percent does not exceed 100
		if(pm25Percent >= 100) {
			pm25Percent = 100;
		}
		
		theModel.addAttribute("pm25Percent", pm25Percent);
		
		
		//weather
		theModel.addAttribute("main", cWeather.getMain());
		theModel.addAttribute("description", cWeather.getDescription());
		theModel.addAttribute("icon", cWeather.getIcon());
		
		//temp
		theModel.addAttribute("temp", cTemp.getTemp());
		theModel.addAttribute("temp_min", cTemp.getTemp_min());
		theModel.addAttribute("temp_max", cTemp.getTemp_max());
		theModel.addAttribute("pressure", cTemp.getPressure());
		theModel.addAttribute("pressure", cTemp.getPressure());
		
		//visiblity
		theModel.addAttribute("visibility", currentWeather.getVisibility());
		
		//wind
		theModel.addAttribute("speed", cWind.getSpeed());
		theModel.addAttribute("gust", cWind.getGust());
		
		//SysInfo
		theModel.addAttribute("country", cSys.getCountry());
		
		HumanTime temHumanTime = new HumanTime();
		String sunrise = temHumanTime.unixTimeToHumanReadable(cSys.sunrise+currentWeather.getTimezone());
		String sunset = temHumanTime.unixTimeToHumanReadable(cSys.sunset+currentWeather.getTimezone());
		
		theModel.addAttribute("sunrise", sunrise);
		theModel.addAttribute("sunset", sunset);
		
		theModel.addAttribute("lat", cCor.getLat());
		theModel.addAttribute("lng", cCor.getLon());
	
		
		// name
		theModel.addAttribute("name", currentWeather.getName());
		System.out.println(currentWeather.getName());
		
		theCityName = currentWeather.getName().replaceAll(" ", "-");
	
		//creating cookie
		Cookie weatherCookie = new Cookie("weatherApp.city", theCityName);
		
		//cookie life span
		weatherCookie.setMaxAge(60*60*24*365);
		
		//adding the cookie
		response.addCookie(weatherCookie);
		
		
		//adding maps api key
		theModel.addAttribute("mapApiKey", mapApiKey);
		
		
		
		return "currentweather";
	}


	
	
	
	

}
