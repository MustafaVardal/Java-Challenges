/*
	There are two types of class methods public and static class method. 
	The public class methods are accessed through the objects whereas, the static class methods are accessed are accesses without an object.
	You can directly access the static methods.
*/
public class MainClassMethods{
	// Creating a static method
	static void fun1(){
		System.out.print("fun1: This is a static method.");
	}
	
	// Creating a public method
	public void fun2(){
		System.out.print("fun2: This is a public method.");
	}
	
	// The main() method
	
	public static void main(String args[]){
		
		// Accessing static method through the class
		fun1();
		
		// Creating an object of the Main class
		MainClassMethods obj = new MainClassMethods();
		// Accessing public method through the object
		obj.fun2();
		
	}
}

/*
It is possible to define a method that will be called just before an object's final destruction by the garbage collector. 
This method is called finalize(), and it can be used to ensure that an object terminates cleanly.

	Example= You might use finalize() to make sure that an open file owned by that object is closed.
To add a finalizer to a class, you simply define the finalize() method. The Java runtime calls that method whenever it is about to recyle an object of that class.
Inside the finalize() method, you will specify those actions that must be performed before an object destroyed.
The finalize() method has this general form 

	protected void finalize(){
		//finalization code here
	}
	
	Here, the keyword protected is a specifier that prevents access to finalze() by code defined outside ots class. 
	This means that you cannot know when or even if finalize() will be executed. 
		For example,if your program ends before garbage collection occurs, finalize() will not execute.
*/