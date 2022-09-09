package com.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class DateBaseEmp {
		
		public static List<Employee>getEmployee() {
	    List<Employee>list = new ArrayList();
	    list.add(new Employee(388,"SANTHOSH","CIVIL",9000));
	    list.add(new Employee(388,"SANTHOSH","CIVIL",9000));
	    list.add(new Employee(286,"Ani","DEFENCE",5000));
	    list.add(new Employee(185,"Ani","SOCIAL",5000));
	    list.add(new Employee(133,"Ani","IT",5000));
	    return list;
		}
	}


