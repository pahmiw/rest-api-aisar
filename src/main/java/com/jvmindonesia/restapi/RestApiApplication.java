package com.jvmindonesia.restapi;

import com.jvmindonesia.restapi.domain.Car;
import com.jvmindonesia.restapi.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository){
		return (args -> {
			repository.save(new Car("Honda", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("Suzuki", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("Pajero", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("Wakwao", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("Hiyaah", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("Hhmms", "Mbuh", "Merah", "Bensin", 2010));
			repository.save(new Car("wkwkwk", "Mbuh", "Merah", "Bensin", 2010));
		});
	}
}
