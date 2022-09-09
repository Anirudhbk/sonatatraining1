package com.example.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class TestService {
	
	
	public static List<Employee> evaluteTax(){
		return DateBaseEmp.getEmployee().stream()
		.filter(emp->emp.getEmpSal()>5000)
		.collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		System.out.println(evaluteTax());

	}
}
