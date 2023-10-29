package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Persistance.ReportService;

@Service
public class PizaService {

	
	
	private ReportService reportService;
	@Autowired
	public PizaService(ReportService reportService)
	{
		this.reportService=reportService;
	}
	public void pizaServiceInfo()
	{
		System.out.println("PizaServiceInformation Data::");
		reportService.Generatereport();
	}
}
