/*

	A java inner class is a class that is defined inside another class. 
	The concpet of inner class workds with nested java classes where outer and inner classes are used. 
	The main class in which inner classes are defined is known as the outer class and all other classes which are inside the outer class  are knwon as Java inner classes.
	
	Nested Classes
	
	In java, just like methods, variables of a class too can have another class as its member.
	Writing a class within another is allowed in Java.
	The class written within is called the nested class and the class that holds the inner class is called the outer class.
	
	Syntax
	
	class Outer_Demo{
		class Inner_Demo{
			
		}
	}
	
	Two types of nested classes;
	
	non static nested classes = These are the non-static members of a class.
	Static nested classes = These are the static members of a class.
	
	
*/

/*
	Inner classes (Non-static nested classes)
	
	Inner classes are a security mechanism in java. 
	We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private.
	And this is also used to access the private members of a class.
*/

/*
	Types of Java inner classes
	
	inner class
	method local inner class
	anonymous inner class
	
*/

// creating an inner class
/*
	Creating an inner class is quite simple. 
	You just need to write a class within a class.
	Unlike a class, an inner class can be private and once you declare an inner class private, it cannot be accessed from an object outside the class.
	

*/

class Outer_Demo{
	int num;
	
	// inner class
	private class Inner_Demo{
		public void print(){
			System.out.print("This is an inner class. Security level is private.");
		}
	}
	
	// Accessing the inner class from the method within
	void display_Inner(){
		
		Inner_Demo inner = new Inner_Demo(); // creating a new object with using inner_demo  inner class.
		inner.print(); // invoking the print method.
	}
}

public class My_class{
	public static void main(String args[]){
		
		// instantiating the outer class.
		Outer_Demo outer = new Outer_Demo();
		
		// Accessing the display_Inner() method.
		outer.display_Inner();
	}
}

// Here you can observe that Outer_Demo is the outer class,  
// Inner_Demo is the inner class, display_Inner() is the method inside which are instantiatingthe inner class, and this method is invoked from the main method.
// As I added also comment line.
// While check the code we have different part of layer like outer and inner. And we commit in code. 



