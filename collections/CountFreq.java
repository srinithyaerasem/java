package com.Map;

import java.util.*;


class Employee1 {
    int empId;
    String empName;
    double empSalary;
    String empDetails;
    Employee1(String empName, int empId, double empSalary, String empDetails) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.empDetails = empDetails;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + empSalary + " " + empDetails;
    }
}

public class CountFreq {
	public static void main(String[] args) {
//		 // Input Map
//        Map<Integer, String> inputMap = new HashMap<>();
//        inputMap.put(1, "apple");
//        inputMap.put(2, "banana");
//        inputMap.put(3, "apple");
//        inputMap.put(4, "orange");
//        inputMap.put(5, "banana");
//
//        // Output Map (frequency)
//        Map<String, Integer> resMap = new HashMap<>();
//
//        for (String value : inputMap.values()) {
//            resMap.put(value, resMap.getOrDefault(value, 0) + 1);
//        }
//
//        System.out.println(freqMap);
		Map<Integer,Employee1> employees = new HashMap<>();
		Map<String,Integer> resMap = new TreeMap<>();
		employees.put(101, new Employee1("arjun" , 101, 50000.0, "HR"));
		employees.put(102, new Employee1("john", 102, 60000, "IT"));
	    employees.put(103, new Employee1("anita", 103, 55000, "Finance"));
	    employees.put(104, new Employee1("arjun" , 104, 50000.0, "HR"));
	    employees.put(105, new Employee1("arjun" , 105, 50000.0, "HR"));
		employees.put(106, new Employee1("john", 106, 60000, "IT"));
	    employees.put(107, new Employee1("anita", 107, 55000, "Finance"));
		employees.put(108, new Employee1("john", 108, 60000, "IT"));
	    employees.put(109, new Employee1("anita", 109, 55000, "Finance"));
	    employees.put(110, new Employee1("anita", 110, 55000, "Finance"));
	    for (Employee1 e : employees.values()) {
//	        String name = e.empDept;
	        if(resMap.containsKey(e.empDetails)) {
	        	
	        
//	        if (resMap.containsKey(name)) {
//	            resMap.put(name, resMap.get(name) + 1);
	            resMap.put(e.empDetails,resMap.get(e.empDetails)+1);
	        } else {
//	            resMap.put(name, 1);
	        	resMap.put(e.empDetails, 1);
	        }
	    }
	    System.out.println(resMap);
	    
	    
	    
	}

}
