package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.Impl.DefaultAddition;


class AddTestCase {

	 @Test
	 void addTest5() {
		DefaultAddition add = new DefaultAddition();
		assertEquals(20,add.add(10,10));
		
	}
	 @Test
	 void addTest6() {
			DefaultAddition add = new DefaultAddition();
			assertEquals(10,add.add(5,5));
			
		}

}
