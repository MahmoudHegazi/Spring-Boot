package com.udacity.jdnd.java_project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
//@Repository
//@Service
public class JavaProjectApplication {
	@Primary
	@Bean
	public String message(){
		System.out.println("Bean: 1, source: message, Data: Hello, Spring nice");
		return "Hello, Spring nice!";
	}

	@Bean
	public String upperCaseMessage(MessageServices MessageServices){
		System.out.println("Bean: 3, source: upperCaseMessage, Data: " + MessageServices.upperCase());
		return MessageServices.upperCase();
	}

	@Bean
	public String lowerCaseMessage(MessageServices MessageServices){
		System.out.println("Bean: 4, source: lowerCaseMessage, Data: " + MessageServices.lowerCase());
		return MessageServices.lowerCase();
	}


	public static void main(String[] args) {

		SpringApplication.run(JavaProjectApplication.class, args);
		System.out.println("Hello Server is Running on Port 8080");
	}

}


