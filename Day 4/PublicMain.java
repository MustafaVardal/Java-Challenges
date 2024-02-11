/*
	A class, method, constructor, interface, etc. declared public can be accessed from any other class. 
	Therefore, fields, methods, blocks inside a public class can be accessed from any class belonging to the Java Universe.
	
	However, if the public class we are trying to access is in a different package, then the public class still needs to be imported. 
	Becuase of class inheritance, all public methods and variables of a class are inherited by its subclasses.
	
	public static void main(String arguments[]){
		//...
	}
	
	The main() method of an application has to be public. Otherwise, it couldnot be called by Java interpreter (such as Java) to run the class.
*/
class One{
	public void printOne(){
		System.out.print("This example demonstrates the use of public access modifier.");
		
	}
}
public class PublicMain{
	public static void main(String args[]){
		
		// Creating an object of class One
		One obj = new One();
		
		// Calling printOne() method of class One
		obj.printOne();
	}
}


