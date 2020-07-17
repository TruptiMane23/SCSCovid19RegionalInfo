package com.example.scs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScsCovid19Application {

	public static void main(String[] args) {
		SpringApplication.run(ScsCovid19Application.class, args);
		System.out.println("hi");
	}

}
