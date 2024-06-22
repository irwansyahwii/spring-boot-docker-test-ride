package com.irwansyah.demo;

import java.text.MessageFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Challenge c = new Challenge(10, 20);

		System.out.println(MessageFormat.format("*** HALOOO {0}", c.Calc()));
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
