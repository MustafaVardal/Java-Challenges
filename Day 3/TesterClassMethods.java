/*
	the class methods are methods that are declared within a class. Tehy perform specific operations and can acces, modify the class attributes.
*/

/*
	Class methods declaration is similar tothe user-defined methods declaration expect that classs methods are declared within a class.
	The class methods are declared by specifying the acccess modifier followed bt the return type, method_name, and parameters list.
	
	public class class_name{
		modifier returnType nameOfMethod(Parameter List){
			// method body
		}
	}
	
	modifier = It defines the acess type of the method and it is opitional to use.
	returnType = The returns data type of the class method.
	nameOfMethod = This is the method name. The method signature consists of the method name and the parameters list..
	Parameter List = The list of parameters, it is the type, order, and number of parameters of a method. These are optional, methiod may contain zero parameters.
	method body = the method body defines wht the method does with the statements.
*/

/*
	class Util{
		/* the snippet returns the minimum between two numbers
		public int minimum(int n1, int n2){
			int min;
			if (n1 > n2)
				min = n2;
			else 
				min = n1;
			
			return min;
			
		}
	}
*/
/*
	To access a class method  (public class method), you need to create an object first, then by using the object you can access the class method ( with the help of dot (.)) operator.*/
	 class Util{
		 public int minimum (int n1, int n2){
			 int min;
			 if ( n1 > n2 )
				 min = n2;
			 else 
				 min = n1;
			 
			 return min;
		 }
	 }
	 public class TesterClassMethods {
		 public static void main(String args[]){
			 int a = 11;
			 int b = 6;
			 
			 Util util = new Util();
			 
			 int c = util.minimum(a, b);
			 System.out.print("Minimum Value = " + c);
		 }
	 }
	 
/*
	this is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor. 
	Using this you can refer the members of a class such as constructors, variables and methods.
	
	Note = The keyword this is used only within instance methods or constructors
	In general, the keyword this is used to =
		Differentiate the instance variables from local variables if they have same names, with a constructor or a method.
*/

class Student {
	int age;
	Student(int age){
		this.age = age;
	}
}

// Call one type of constructor (parametrized constructor or default) from other in a class. It is known as explicit constuctor invocation.

class Student {
	int age
	Student(){
		this (20);
	}
	Student(int age){
		this.age = age;
	}
}



