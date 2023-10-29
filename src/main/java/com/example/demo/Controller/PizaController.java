package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Service.PizaService;

@Component
public class PizaController {
	@Autowired
	private PizaService pizaService;
	
public String Getpiza()
{
	pizaService.pizaServiceInfo();
	return "This is Vegpiza and it's test is better";
	
}
}
