/*
	In Java concept of static class is introduced under concept of inner classes, which are specially designed for some delicate functionality in a class.
*/

/*
	Static classes in Java are allowed only for inner classes which are defined under some other class, as static outer class is not allowed which means that we can't use static keywrod with outer class.
	
	Static classes are defined the same as other inner classes in Java only with a static keyword in front of its name.
	These classes have some unique characteristics that make them differ from other non-static inner classes.
*/

/*
	Static class do not need to create an instance of outer containing class in order to create its own instance. 
	
	Static class can access members(variables/methods) of outer containing class only if they are static in nature. 
	Which means that a static nested class does not have access to the instance variables and methods of the outer class.
*/

/*
class MyOuter{
	static class Nested_Demo{{
		
	}
}
*/

public class Outer{
	static class Nested_Demo{
		public static void print(){
			System.out.print("This is my nested class");
		}
	}
	
	public static void main(String args[]){
		
		Nested_Demo.print();
	}
}