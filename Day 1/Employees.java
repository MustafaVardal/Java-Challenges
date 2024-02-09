/*
	Class variables also known as static variabels are declared with the static keyword in a class, but outside a method, constructor or a block.
	There would only be one copy of each class variable per class, regardless of how many objects are created from it. 
	Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private,final,and static, Constant variables never change from their initial value.
	Static variables are stored in the static memory. It is reare to use static variables other than declared final and used as either public or private constrants.
	Static variables are created when the program starts and destroyed when the program stops.
	Visibitly is similar to instance variables. However, most static variables are declared public since they must be avaible for users of the class. 
	Default values are same as instance variables. For numbers, the default calue us 0; for Booleans, it is false; and for objects references, it is null. 
	Values can be assigned during the declaration or within the constructor.
	Additionally, values can be assigned in special static initializer blocks.
	Static variables can be accesed by calling with the class name. ClassName.VariableName.
	When declaring class variables as public static final, then variable names (constants) are all in upper case. 
	If the static variables are not public and final, the naming syntax is the same as instance and local variables. 
*/

import java.io.*;

public class Employees {
	
	// salary variable is a private static variable.
	private static double salary;
	
	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development";
	
	public static void main(String args[]){
		salary = 4500;
		System.out.println(DEPARTMENT + " average salary : " + salary);
	
	}
}

	// IF THE VARIABLES ARE ACCESSED FROM AN OUTSIDE CLASS, THE CONSTANT SHOULD BE ACCESSED AS Employees.DEPARTMENT