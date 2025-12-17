package com.Map;

import java.util.*;

class Employee {
    int empId;
    String empName;
    double empSalary;
    String empDetails;

    Employee(String empName, int empId, double empSalary, String empDetails) {
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
public class EmployeeDetails {
	
	public static void main(String[] args) {

		Map<Integer,Employee> employees = new HashMap<>();
		employees.put(101, new Employee("arjun" , 101, 50000.0, "HR"));
		employees.put(102, new Employee("john", 102, 60000, "IT"));
	    employees.put(103, new Employee("anita", 103, 55000, "Finance"));

	     for (Employee e : employees.values()) {
	            if (e.empName.toLowerCase().startsWith("a")) {
	                System.out.println(e);
	            }
	     }
	     boolean is_search =true;
	     Scanner sc = new Scanner(System.in);
	     while (is_search) {
	    	    System.out.println("please enter a name");
	    	    String name = sc.next().toLowerCase();

	    	    boolean found = false;
	    	    for (Employee e : employees.values()) {
	    	        if (e.empName.toLowerCase().equals(name)) {
	    	            System.out.println(e);
	    	            found = true;
	    	        }
	    	    }
	    	    if (!found) {
	    	        System.out.println("Details not found");
	    	    }
	    	    System.out.println("do you want to continue(y/n)");
	    	    String play = sc.next();
	    	    if (play.equalsIgnoreCase("n")) {
	    	        is_search = false;
	    	    }
	    	}
	 	
	}

}

//Map<String,String> employee1 = new
//Set<String> emp1 = new HashSet<>();
//Map<String, String> emp1entry = new HashMap<String,String>();
//emp1entry.put("empId","01");
//emp1entry.put("empName","nithya");
//emp1entry.put("empSalary","25000");
//emp1entry.put("empDetails","guntur");
//Map<String, String> emp2entry = new HashMap<String,String>();
//emp2entry.put("empId","02");
//emp2entry.put("empName","sri");
//emp2entry.put("empSalary","35000");
//emp2entry.put("empDetails","Hyderabad");
//Map<String, String> emp3entry = new HashMap<String,String>();
//emp1entry.put("empId","03");
//emp1entry.put("empName","Anjali");
//emp1entry.put("empSalary","35000");
//emp1entry.put("empDetails","vij");
