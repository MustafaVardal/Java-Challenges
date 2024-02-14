// Java interfaces

/**
	Java interface is a collection of abstract method. The interface is used to achieve abstraction in which you can define methods without implementations (without having the body of the methods).
	An interface is a reference type and is similar to the class.
	
	Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Methods bodues exist only for default methods and static methods.
	
	Writing an interface is similar to writing a class. However, a class describes the attributes and behaviours of an object. An interface contains behaviors that a class implemetns. 
	Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.
	
	
*/

/*
	Java interfaces and classes: similarities and differences
	
	Similarities 
	An interface can contain any number of methods.
	An interface is written in a file with a .java extension, with the name of the interface matching the name of the file. 
	the byte code of an interface apperars in a .class file.
	interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.
	
	Differences
	You cannot instantiate an interface.
	An interface does not contain any constructors.
	All of the methods in an interface are abstract.
	An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
	An interface is not extended by a class; it is implemented by a class
	An interface can extend multiple interfaces.
*/

/**
	Declaring an interface in hava
	the interface keyword is used to declare an interface. 
	
	// file name NameOfInterface.java
	
	import java.lang.*
	// any number of import statements.
	
	public interface NameOfInterface{
		
		// any number of final, static fields.
		// any number of abstract method declarations
		
	}

*/

/*
	Propeties of java interface
	
	an interface is implcity abstract. you do not need to use the abstract keyword while declaring an interface
	each method in an interface is also implcitly abstract, so the abstract keyword is not needed.
	methods in an interface are implicitly public
	// file name : Animal.java
	interface Animal{
		public void eat();
		public void travel();
	}
*/

/**
	when a class implements an interface, you can think of the class as signing a contract,
	agreeing to perform the specific behaviors of the interface. If a class does not perform all the behaviors of the interface, the class must declare itself as abstract.
	
	A class uses the implemetns keyword to implement an interface. The impleemnts eyword appears in the class declaration following the exteds portion of declaration.
	
	

**/

// file name : MammalInt.java

public class MammalInt implements Animal{
	
	public void eat(){
		System.out.print("Mammal eats.");
		
	}
	
	public void travel(){
		System.out.print("\nMammal travels.");
	}
	
	public int noOfLegs(){
		return 0;
	
	}
	
	public static void main(String args[]){
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
}

interface Animal{
	public void eat();
	public void travel();
}