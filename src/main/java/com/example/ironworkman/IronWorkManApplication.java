package com.example.ironworkman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.ironworkman")
@EntityScan
public class IronWorkManApplication {
	public static void main(String[] args) {
		SpringApplication.run(IronWorkManApplication.class, args);
	}

}
