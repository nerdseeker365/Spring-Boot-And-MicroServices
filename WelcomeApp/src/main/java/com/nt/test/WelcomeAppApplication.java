package com.nt.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeAppApplication.class, args);
		System.out.println("WelcomeAppApplication.main()");
	}

}
