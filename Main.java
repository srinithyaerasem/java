package com.ArrayObjects;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] studentsList= new Student[4];
		
		
//		Student student1 = new Student("John", 23, "male");
//		Student student2 = new Student("Riya", 21,"female");
//		Student student3 = new Student("Ravi", 34,"male");
//		Student student4 = new Student("Rose",31,"female");
//		studentsList[0]=student1;
//		studentsList[1]=student2;
//		studentsList[2]=student3;
//		studentsList[3]=student4;
		//TO REDUCE THE SPACE
		
		
//		studentsList[0] = new Student("John", 23, "male");
//		studentsList[1] = new Student("Riya", 21,"female");
//		studentsList[2] = new Student("Ravi", 34,"male");
//		studentsList[3] = new Student("Rose",31,"female");
//		System.out.println(Arrays.toString(studentsList));
		
//		String[] namedup= names;
//		System.out.println(Arrays.toString(namedup));
		
		String searchName=" Ri ya ".trim().toLowerCase();
		String[] names= {"john","riya","candy","rose"};
		int[] ages= {23,21,34,31};
		String[] genders = {"male","female","male","female"};
		for(int i=0;i<studentsList.length;i++) {
			studentsList[i]= new Student(names[i],ages[i],genders[i]);
		}
		for(int i=0;i<studentsList.length;i++) {
			// search a name
//			if(studentsList[i].name.equals(searchName))
			//Display all the names below or equal to 30
//			if(studentsList[i].age <= 30 ){
//				
//				studentsList[i].displayInfo();
//			}
			//studentsList[i].displayInfo();		
			
		}
		for(int i=0;i<studentsList.length;i++) {
			for(int j=i+1;j<studentsList.length;j++) {
//				if(((studentsList[i].name).compareTo(studentsList[j]))>0){
//					
//				}
				if(((studentsList[i].name).compareTo(studentsList[j].name))>0) {
					Student temp=studentsList[i];
					studentsList[i]=studentsList[j];
					studentsList[j]=temp;
				}
			}

		}
		for(Student x: studentsList) {
			x.displayInfo();
		}

		
		
	}

}
