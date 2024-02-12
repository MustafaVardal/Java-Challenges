/*
	In th previous code, we talked about superclasses and subclasses. If a class inherits a method from its superclass, then there is a chance to override the method provided that it is not marked final.
*/

/*
	The benefit of overriding is; ability to define a behavior that's specific to the subclass type;
	which means a subclass can implement a parent class method based on its requirement.
	
	In object-oriented terms, overriding means to override the functionality of an existing method.
	
	
*/

/*
	Method overriding allows us to achieve run-time polymorphism and is used for writing specific definations of a subclass method that is already defined in the superclass.
	
	The method is superclass and overriden method in the subclass should have the same declaration signature such as parameters list, type, and return type.
*/

/*

	Method overriding is used for achieving run-time polymorphism
	MEthod overriding is used for writing specific defination of a subclass method (this method is known as the overridden method.)
*/

class Animal{
	public void move(){
		System.out.print("Animals can move");
		
	}
}

class Dog extends Animal{
	public void move(){
		System.out.print("\nDog can walk and run.");
	}
}

public class TestDog{
	
	public static void main(String args[]){
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object
		
		a.move(); //  runs the method in Animal class
		
		b.move(); // runs the method in Dog class.
	}
}

/*
	In the above example, you can see that even though b is a type of Animal it runs the move method in the Dog class. The reason for this is: In compile time, the check is made on the reference type. 
	However, in the runtime, JVM figures out he object type and would run the method that belongs to that particular object.
	
	Therefore, in the above example, the program will compile properly since Animal class has the method move. Then. at the runtime, it runs the method specific for that object.

*/

