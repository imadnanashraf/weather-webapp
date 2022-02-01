package com.adnan.icode.fun.weatherapp.models.object.onecall;

import java.util.List;

import com.adnan.icode.fun.weatherapp.models.object.Weather;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {

    public int dt;
    
    public int sunrise;
    
    public int sunset;
    
    public int moonrise;
    
    public int moonset;
       
    public DayTemp temp;
    
    public int pressure;
    
    public int humidity;
    
    public float dew_point;
    
    public float wind_speed;
    
    public int wind_deg;
    
    public float wind_gust;
    
    public List<Weather> weather;
    
    public int clouds;
    
    public float uvi;

	

}
