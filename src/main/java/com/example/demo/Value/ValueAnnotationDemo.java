package com.example.demo.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo { 
    @Value("${name}")
	private String DefaultName;

	public String getDefaultName() {
		return DefaultName;
	}

	public void setDefaultName(String defaultName) {
		DefaultName = defaultName;
	}
	@Value("${city}")
    private String CityProperties;
	@Value("${mail.email}")
	private String emilpropertoes;

	public String getCityProperties() {
		return CityProperties;
	}

	public void setCityProperties(String cityProperties) {
		CityProperties = cityProperties;
	}

	public String getEmilpropertoes() {
		return emilpropertoes;
	}

	public void setEmilpropertoes(String emilpropertoes) {
		this.emilpropertoes = emilpropertoes;
	}
	
}
