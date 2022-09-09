package com.example.StreamApi;

import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Employee>{



@Override
public int compare(Employee o1, Employee o2) {
   return (int)(o1.getEmpSal() - o2.getEmpSal());
}

}
public class SortExampleEmployee {



	public static void main(String[] args) {
		List<Employee> employee = DateBaseEmp.getEmployee();
		

	}

}
