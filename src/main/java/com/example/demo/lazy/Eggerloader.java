package com.example.demo.lazy;

import org.springframework.stereotype.Component;

@Component
public class Eggerloader {
    public Eggerloader()
    {
    	System.out.println("Eggerloader :: loading");
    }
}
