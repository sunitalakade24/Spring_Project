package com.example.demo.Persistance;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MysqlReport implements ReportService {

	@Override
	public void Generatereport() {
		System.out.println("Mysql report generate::");
		
	}

}
