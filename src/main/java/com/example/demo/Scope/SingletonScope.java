package com.example.demo.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonScope {
 public SingletonScope()
 {
	 System.out.println("SingletonScope Class");
 }
}
