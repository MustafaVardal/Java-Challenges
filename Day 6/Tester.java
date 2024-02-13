/*
	Binding is a mechanism creating link between method call and method actual implementation.
	As per the polymorphism concept in Java, object can have many diffent forms. Object forms can be resolved at the compile time and run time
*/

/*

	Dynamic binding refers to the process in whic linkin between method call and method implementation is resolved at run time (or, a procesws of calling an overridden method at run time).
	Dynamic binding is also known as run-time polymorphism or late binding. Dynamic binding uses objects to resolve binding.
	
*/

/*
	Characteristics of Java Dynamic Binding
	
	Linking  = Linkin between method call and method implementation is resulved at rum time.
	
	Resolve mechanism =  Dynamic binding uses pbject type to resolve binding.
	
	Example = Method overriding is the example of Dynamic binding
	
	Type of Methods = Virtual methods use dynamic binding.
*/

class Animal {
	public void move(){
		System.out.print("Animal can move");
	}
}

class Dog extends Animal{
	public void move(){
		System.out.print("Dogs can walk and run.");
	}
}

public class Tester{
	
	public static void main(String args[]){
		Animal a = new Animal(); // Animal reference and object 
		// Dynamic binding
		
		Animal b  = new Dog(); // Animal reference but Dog object
		
		a.move(); // runs the method in Animal class.
		System.out.print("\n");
		b.move(); // runs the method in Dog class.
	}
}

