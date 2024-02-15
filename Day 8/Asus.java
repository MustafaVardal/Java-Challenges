/*
	If a clas wnats to use another class in the same package, the package name need not be used.
	Classess in the same package find each other without any special syntax.
	


*/

/// Example 
// Here, a class named Boss is added to the payroll package that already contains Employee. The Boss can then refer to the Employee class without using the payroll prefix, as demostrated by the following Boss class.


/*
package payroll;

public class Boss{
	public void payEmployee(Employee e){
		e.mailCheck();
	}
}

*/



//What happens if the Employee class is not in the payroll package? The Boss class must then use one of the following techniques for referring to a class in a different package.

//The fully qualified name of the class can be used
//Example

//payroll.Employee

//the package can be imported using the import key word and the wild card(*).

//Example 

//import payroll.*

// The class itself can be imported keyword.

// Example

// import payroll.Employee

// Example

/**
 package.payroll;
 
 public class Employee{
	public void mailCheck(){
		System.out.print("Pay received.");
	}
 }
 
///// Example

package payroll;

import payroll.Employee;

public class Boss{
	
	public void payEmployee(Employee e){
		e.mailCheck();
	}
	
	public static void main(String args[]){
		Boss boss = new Boss();
		Employee e = new Employee();
		
		boss.payEmployee(e);
	}
} 

A class file can contain any number of import statements. The import statments must appear after the package statement and before the class declaration.

**/

// Directory Strucute of a java package

/**

The name of the package becomes a part of the name of the class.

The name of the package must match the directory structure where  the corresponding bytecode resides.

**/

// Put the source code a class, interface, enumeration, or annotation type in a text file whose name is the simple name of the type and whose extension is .java

//File name  = Car.java

/*
package vehicle;

public class Car{
	// Class implementation.
}
*/

// Now put the source file in a directory whose name reflects the name of the package to which the class belongs

// ..\vehicle\Car.java

// Now, the qualified class name and pathname would be as follows-

// Class name --> vehicle.Car
// Path name --> vehicle\Car.java (in windows system)

// in gerenral, a company uses its reversed Internet domain name for its package names.

//Example 
// A person's internet domain name is mustafavardal.com, then all its package names would start with com.mustafavardal. Each compenent of the package name corresponds to a subdirectory.

// Example
// The website had a com.mustafavardal.computers package that contained a Asus.java source file, it would be contained in a series of subdirectories like this

// ...\com\mustafavardal\computers\Asus.java

/**
At the time of compilation, the compiler creates a different output file for each class, interface and enumeration defiened in it. 
The base name of the output file is the name of the type, and its extension is .class
**/

// Example

package com.mustafa.computers;

public class Asus{
	
}

class Ups{
	
}

// The  folies will compile as follows-

//.\com\mustafavarda\computers\Asus.class
//.\com\mustafavardal\computers\Ups.class

// You can import all the classes or interfaces defined in \com\mustafavarda\computers\ 
//
// import com.mustafavardal.computers.*;

// Like the .java source files , the compiled .class files should be in a series of directories that reflect the package name. 
// However, the path to the .class files does not have to be the same as the path to the .java source files.
// You can arrange your source and class directories separately,

// <path-one>\sources\com\mustafavardal\computers\Asus.java
// <path-two>\sources\com\mustafa\computers\Asus.class

/*
	By doing this, it is possible to give access to the class directory to other programmers without revealing your sources. 
	You can also need to manage source and class file in this manner so that the compiler and the JVM can find all the types your program uses.
	The full path to the class directory, <path-two>\classes, is called the class path, and is set with the CLASSPATH system variable.
	Both compiler and the JVM construct the path to your .class files by adding the package name to the class path.
	
	Say <pat-two>\classes is the class path, 
	and the package name is com.mustafavardal.computers, 
	then the compiler and JVM will look for .class files in <path-two>\clasees\com\mustafavardal\computers.
	
	A class path may include several paths. Multiple paths should be separated by a semicolon (Windows) or colon(Unix).
	By  defauilt, the compiler and the JVM search the current directory and the JAR file containing the Java platform classes so that these directories are automatically in the class path.
	
	
*/

// Set CLASSPATH System Variable

// to display the current CLASSPATH variable, uses the follign command in windows and unix 

// In windows --> C:\ set CLASSPATH
// In unix --> %echo $CLASSPATH

// to delete the current contents of the CLASSPATH variabel, use - 

// Windows >> C:\set CLASSPATH =
// Unix >> % unset CLASSPATH; export CLASSPATH

// to set the CLASSPATH variable

// Windows >>> set CLASSPATH =  c:\users\mustafa\java\classes
// unix >>> % CLASSPATH = /home/mustafa/java/classes; export CLASSPATH