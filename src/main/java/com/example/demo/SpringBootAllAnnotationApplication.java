package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Controller.PizaController;
import com.example.demo.Persistance.MysqlReport;
import com.example.demo.Scope.PrototypeScope;
import com.example.demo.Scope.SingletonScope;
import com.example.demo.Value.ValueAnnotationDemo;
import com.example.demo.lazy.LazyLoader;

@SpringBootApplication
public class SpringBootAllAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAllAnnotationApplication.class, args);

		/*
		 * PizaController p = (PizaController) context.getBean("pizaController"); String
		 * Data = p.Getpiza(); System.out.println(Data); LazyLoader b =
		 * context.getBean(LazyLoader.class);
		 */
		/*
		 * SingletonScope s=context.getBean(SingletonScope.class);
		 * System.out.println(s.hashCode());
		 * System.out.println(context.isSingleton("singletonScope")); SingletonScope
		 * s1=context.getBean(SingletonScope.class); System.out.println(s1.hashCode());
		 * System.out.println(context.isSingleton("singletonScope")); SingletonScope
		 * s2=context.getBean(SingletonScope.class); PrototypeScope
		 * p=context.getBean(PrototypeScope.class); System.out.println(p.hashCode());
		 * System.out.println(context.isSingleton("prototypeScope")); PrototypeScope
		 * p1=context.getBean(PrototypeScope.class); System.out.println(p1.hashCode());
		 * System.out.println(context.isPrototype("prototypeScope")); PrototypeScope
		 * p2=context.getBean(PrototypeScope.class);
		 */
		ValueAnnotationDemo v=context.getBean(ValueAnnotationDemo.class);
		System.out.println(v.getDefaultName());
		System.out.println(v.getCityProperties());
		System.out.println(v.getEmilpropertoes());


	}

}
