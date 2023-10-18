package cars.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cars.beans.Car;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Car car() {
		Car bean = new Car("Volkswagen", "GTI");
		return bean;
	}
}
