package com.example.weather_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class WeatherExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherExampleApplication.class, args);
	}


}
