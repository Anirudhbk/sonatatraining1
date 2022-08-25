package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.example.demo.Calculator;



public class CalTest {
	
	@Test
	public void addTest1() {
		Calculator c1 = new Calculator();
		int x = c1.div(1,1);
		   assertThrows(ArithmeticException.class,()->c1.div(1,0),"it is an error");
		   
		
	}
	
	
	} 
	

