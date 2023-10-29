package com.example.demo.Persistance;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReport implements ReportService{

	@Override
	public void Generatereport() {
		System.out.println("Oracle report generate::");
		
	}

}
