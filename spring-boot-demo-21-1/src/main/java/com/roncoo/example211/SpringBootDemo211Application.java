package com.roncoo.example211;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class SpringBootDemo211Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo211Application.class, args);
	}
}
