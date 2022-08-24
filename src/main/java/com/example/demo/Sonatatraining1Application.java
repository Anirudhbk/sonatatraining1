package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Impl.DefaultAddition;

@SpringBootApplication
public class Sonatatraining1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sonatatraining1Application.class, args);
        AddInterface addition = new  DefaultAddition();
		System.out.println(addition.add(10,20));
		
	}

}
