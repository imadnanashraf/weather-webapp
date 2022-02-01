package com.adnan.icode.fun.weatherapp.weatherservice;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adnan.icode.fun.weatherapp.main.models.CurrentAirPollution;
import com.adnan.icode.fun.weatherapp.main.models.CurrentOneCall;
import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;
import com.adnan.icode.fun.weatherapp.models.object.CoOrdinates;
import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.adnan.icode.fun.weatherapp.models.object.onecall.Hourly;

@Service
public class WeatherServiceImpl implements WeatherService {
		
	@Value("${weather.api.key}")
	private String apiKey;
	
	private RestTemplate restTemplate;
	
	@Autowired
	public WeatherServiceImpl(RestTemplate theRestTemplate) {
		restTemplate = theRestTemplate;
	}
	
	
	@Override
	public CurrentWeatherByCity getCurrentWeatherByCity(String cityName,String mode) {
		if(mode==null) {
			mode = "metric";
		}
		System.out.println(cityName);
		String apiUrl = 
				"https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units="+mode+"&appid="+apiKey;
		System.out.println(apiUrl);
		
		CurrentWeatherByCity weatherInfo = restTemplate.getForObject(apiUrl, CurrentWeatherByCity.class);
			
		return weatherInfo;
	}


	@Override
	public CurrentAirPollution getAirPollutionData(float lat, float lon) {
		String apiUrl = 
				"http://api.openweathermap.org/data/2.5/air_pollution?lat="+lat+"&lon="+lon+"&appid="+apiKey;
		
		CurrentAirPollution airPollutionInfo = 
				restTemplate.getForObject(apiUrl, CurrentAirPollution.class);
		
		
		
		return airPollutionInfo;
	}


	@Override
	public CurrentOneCall getCurrentOneCall(float lat, float lon, String option) {
		String apiUrl = null;
		
		if(option == "hourly") {
			
			apiUrl = "https://api.openweathermap.org/data/2.5/onecall?lat="+lat+"&lon="+lon+"&exclude=current,minutely,daily&units=metric&appid="+apiKey;
		}
		
		if(option == "daily") {
			
			apiUrl = "https://api.openweathermap.org/data/2.5/onecall?lat="+lat+"&lon="+lon+"&exclude=current,minutely,hourly&units=metric&appid="+apiKey;
		}
		System.out.println(apiUrl);
		
		CurrentOneCall currentHrDy = restTemplate.
									 getForObject(apiUrl, CurrentOneCall.class);
		
		System.out.println(currentHrDy.getHourly().get(0).getTemp());
		
		return currentHrDy;
	}


	
	

}
