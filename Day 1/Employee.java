/*
	Instance variables are declared in a class, but outside a method, constructor or any block.
	When a space is allocated for an object in the heap, a slot for each instance variable value is created.
	Instance variabels are created when an object is created with the use of the keyword 'new' and destroyed when object is destroyed.
	Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throught the class.
	Instance variables can be declared in class level before or after use.
	Access modifier which are private, protected, public ,and default can be given for instance variables. 
	The instance variables are visible for all methids, cosntructors and block in the class.Normally, it is recommented to make these variables private(access level). 
	However visiblity for subclasses can be given for these variableswith the use of acces modifers.
	Instancevariables have default values. For numbers, the default value is 0, for Boolenas it is flase, and for object references it is null.Values can be assigned during the declaration or within the constructor.
	Instance variables can be accessed directly by calling the variable name inside the class. 
	However, within static methids (when instance variables are given accesibility), they should be called using the fully qualified name. 
	ObjectReference.VariableName.
*/

import java.io.*;
public class Employee {
	
	// this instance variable is visible for any child class.
	public String name;
	
	// salary variable is visible in Employee class only
	private double salary;
	
	// The name variable is assigned in the constructor. 
	public Employee (String empName){
		name = empName;
	}
	
	//The salary variable is assigned a value.
	public void setSalary(double empSal){
		salary = empSal;
	}
	
	//This methid prints the employee details.
	public void printEmpy(){
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}
	
	public static void main(String args[]){
		
		// Creating an object of 'Animal' class
		Employee empOne = new Employee("Mustafa");
		empOne.setSalary(5000);
		empOne.printEmpy();
		
		
		// creating an object of 'String' class
		String myString = new String("Hello world!");
		System.out.println(myString);
	}
}

