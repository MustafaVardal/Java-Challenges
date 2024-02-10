/*
	This is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor. 
	Using this you can refer the members of a class such as constructors, variables, and methods.
	The keyword this is used only within instance methods or constructors.*/
	
//	Differentiate the instance varaiables from local variables if they have same names, within a contructor or a method. 
/*
	class Student{
		int age;
		Student (int age){
			this.age = age;
		}
	}
*/

// Call one type of constructor(parametrized constructor or default) from other in a class. It is known as explict constructor invocation.

class Student{
	int age;
	Student(){
		this(20);
	}
	
	Student (int age ){
		this.age = age;
	}
}