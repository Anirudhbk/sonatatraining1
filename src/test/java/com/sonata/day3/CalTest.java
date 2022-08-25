package com.sonata.day3;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;





public class CalTest {
	Calculator c3 = new Calculator();
	
	@Test
	public void div() {
		Calculator c3 = new Calculator();
		assertThrows(ArithmeticException.class,()->c3.div(1,0),"it is an error");
		   
		
	}
	
	
	} 
	

