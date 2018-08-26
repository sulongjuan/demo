package com.yc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringtaskandemailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtaskandemailApplication.class, args);
	}
}
