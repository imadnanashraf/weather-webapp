package com.adnan.icode.fun.weatherapp.weatherservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adnan.icode.fun.weatherapp.main.models.CurrentWeatherByCity;
import com.adnan.icode.fun.weatherapp.models.object.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {
		
	@Value("${weather.api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public CurrentWeatherByCity getCurrentWeatherByCity(String cityName) {
		
		String apiUrl = 
				"api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid="+apiKey;
		
		CurrentWeatherByCity weatherInfo = restTemplate.getForObject(apiUrl, CurrentWeatherByCity.class);
		
		System.out.println(weatherInfo);
		
		return weatherInfo;
	}

}
