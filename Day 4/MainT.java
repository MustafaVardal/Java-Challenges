/*
	The inheritance in which a base class is inherited to a derived class and that derived class is further inherited to another derived class is known as multi-level inheritance.
	Multilevel inheritance involves multiple base classes.
*/

class One{
	public void printOne(){
		
		System.out.print("printOne() method of One class");
		
	}
}

class Two extends One{
	public void printTwo(){
	
	System.out.print("printTwo() method of Two class");
	
	}	
}

public class MainT extends Two{
	public static void main(String args[]){
		//Creating object of the derived class(Main)
		MainT obj = new MainT();
		
		// Calling Methods
		obj.printOne();
		System.out.print("\n");
		obj.printTwo();
	
	}
}