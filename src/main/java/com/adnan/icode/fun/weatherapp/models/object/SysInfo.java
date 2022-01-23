package com.adnan.icode.fun.weatherapp.models.object;

public class SysInfo {
	
    public String country;
    
    public int sunrise;
    
    public int sunset;

    public SysInfo() {
    	
    }

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSunrise() {
		return sunrise;
	}

	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}

	public int getSunset() {
		return sunset;
	}

	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
    
    
}
