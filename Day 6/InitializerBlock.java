/*
	An instance initializer block is a block of code that is declared inside a class to initialize the instance data members. 
	Instance Initializer block is executed once for each object and can be used to set initial values for instance variables.
	
	The instance initializer block is similar to the Java constructor but its executaion and uses are different.
	
	public class Tester{
		public int a;
		{ a = 10; }
	}
	
*/

/*
	Instance initializer block is called one an object is created.
	Instance initializer block is called before any constructor of an object is invoked.
	In case of child class, Instance initialize block will called after super class constructor call.
	Instance initializer block can be used to execute multiple statements.
	Instance initializer block is generally used to instantiate multiple values fields like arrays.
	
*/


/*
	To initialize the instance variable.
	To initialize the resources used in the code.
	To perform the dynamic initialization of the instance variables.
	To use the common initialization logic for multiple constructors.
	
*/

// Demostrating What invokes first, intance initializer block or constructor.
/*
public class InitializerBlock{
	{
	System.out.print("Inside instance initializer block\n");
	}


	InitializerBlock(){
		System.out.print("Inside constructor");
	}
	
	public static void main(String args[]){
		
		InitializerBlock obj = new InitializerBlock();
	}
}
*/

// Demonstrating whether constructor overrides Instance Initializer Block.

public class InitializerBlock{
	int a;
	{
		System.out.print("Inside instance initializer block\n");
		a = 10;
	}
	
	InitializerBlock(){
		System.out.print("Inside constructor.\n");
		a = 20;
		
	}
	
	public static void main(String[] args){
		
		InitializerBlock obj = new InitializerBlock();
		System.out.print("Value of a : " + obj.a);
	}
}

