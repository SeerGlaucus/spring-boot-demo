package com.roncoo.example191;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@ServletComponentScan
@SpringBootApplication
public class SpringBootDemo191Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo191Application.class, args);
	}
}
