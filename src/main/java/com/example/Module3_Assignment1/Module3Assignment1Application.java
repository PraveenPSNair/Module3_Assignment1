package com.example.Module3_Assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module3Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Module3Assignment1Application.class, args);
	}
	public String hello() {//done by Main Branch
	      return String.format("Hello  this is DevOps");
	 }

	public String welcome() {//done by Branch2
	      return String.format("Welcome to the world of DevOps");


	 }

}
