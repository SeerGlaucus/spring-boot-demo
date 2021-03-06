package com.roncoo.example271;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@ServletComponentScan
@SpringBootApplication
public class SpringBootDemo271Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo271Application.class, args);
	}
}
