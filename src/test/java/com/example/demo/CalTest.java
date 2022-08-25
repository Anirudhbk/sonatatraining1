package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;



public class CalTest {
	
	@Test
	public void addTest1() {
		Calculator c1 = new Calculator();
		assertThrows(ArithmeticException.class,()->c1.div(1,0),"it is an error");
		   
		
	}
	
	
	} 
	

