package com.example;

import com.example.atributos.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {


		//SpringApplication.run(SpringCoreApplication.class, args); --->
		// para levantar el programa completo

		ConfigurableApplicationContext contex = SpringApplication.run(SpringCoreApplication.class, args);

		Motor m = contex.getBean(Motor.class);

		System.out.println(m);





	}

}
