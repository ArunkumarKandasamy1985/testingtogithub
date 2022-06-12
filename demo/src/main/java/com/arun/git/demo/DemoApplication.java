package com.arun.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Testing for Second Commit");
		SpringApplication.run(DemoApplication.class, args);
	}

}
