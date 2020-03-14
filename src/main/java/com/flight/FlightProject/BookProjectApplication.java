package com.flight.FlightProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.flight.FlightProject.persistence.repo")
@EntityScan("com.books.BookProject.Model")
@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.flight")
public class BookProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookProjectApplication.class, args);
	}

}
