import java.io.*;
public class Employee{
	String name;
	int age;
	String designation;
	double salary;
	
		// This is the constructor of the class Employee
		public Employee(String name){
			this.name=name;
		}
		
		// Assign the age of the employee to the variable age.
		
		public void empAge(int empAge){
			age = empAge;
		}
		
		// Assign the designation to the variabe designation.
		public void empDesignation(String empDesig){
			designation = empDesig;
		}
		
		// Assign the salary to the variable salary.
		public void empSalary(double empSalary){
			salary = empSalary;
		}
		
		// Print the Employee details.
		public void printEmployee(){
			System.out.print(" Name: " + name);
			System.out.print(" Age: " + age);
			System.out.print(" Designation: " + designation);
			System.out.print(" Salary: " + salary);
		}
	}
	