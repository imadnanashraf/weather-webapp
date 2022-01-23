package com.adnan.icode.fun.weatherapp.weatherservice;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;
import com.adnan.icode.fun.weatherapp.models.object.CoOrdinates;
import com.adnan.icode.fun.weatherapp.models.object.Weather;

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
	public CurrentWeatherByCity getCurrentWeatherByCity(String cityName) {
		
		System.out.println(cityName);
		String apiUrl = 
				"https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid="+apiKey;
		System.out.println(apiUrl);
		
		CurrentWeatherByCity weatherInfo = restTemplate.getForObject(apiUrl, CurrentWeatherByCity.class);
		
		System.out.println(weatherInfo);
		    
		Weather weather = (Weather) weatherInfo.getWeather().get(0);
		
		System.out.println(weather.getDescription());
		
		return weatherInfo;
	}

}
