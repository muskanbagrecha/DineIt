package com.mb.dineit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mb.dineit.repository")
public class DineitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DineitApplication.class, args);
	}

}
