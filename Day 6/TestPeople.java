/*
	You can see that even though b is a type of Animal it runs the move method in the Dog class. The reason for this is: in compile time, the check is madew on the reference type.
	However, in the runtime, JVM figures out the object type and would run the method that belong to that particular object.
	
	Therefore, in the above example, the program will compile properly since Animal class has the method move. Then, at the rumtime, it runs the method specific for that object.
*/

/*
	When invoking a superclass version of an overridden method the super keyword is used so that we can utilize parent class method while using dynamic binding.
*/

class Country{
	public void war(){
		System.out.print("Country can war.\n");
	}
}

class People extends Country{
	public void war(){
		super.war();	// calls th super class method
		System.out.print("People can die or injury after the war.");
	}
}

public class TestPeople{
	
	public static void main(String args[]){
		Country obj = new People(); // Animal reference but People object
		obj.war(); // runs the method in People class
	}
}