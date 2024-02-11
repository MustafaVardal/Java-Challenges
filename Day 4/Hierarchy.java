/* 
	The inheritance in which only one base class and multiple derived classses is known as hierarchical inheritance.
	
*/

class One{
	public void printOne(){
		System.out.print("printOne() method of One class");
	}
}

//Derived class 1

class Two extends One{
	public void printTwo(){
		System.out.print("printTwo() method of Two class");
	}
}

// Derived class 2

class Three extends One{
	public void printThree(){
		System.out.print("printThree() method of Three class");
	}
}

// Testing Class
public class Hierarchy{
	public static void main(String args[]){
		Two obj1 = new Two();
		Three obj2 = new Three();
		
		// All classes can access the method of class One
		
		obj1.printOne();
		System.out.print("\n");
		obj2.printOne();
	
	}
}

/*
	public class extends Animal, Mammal{}
	
	However, a class can implement one or more interfaces, which has helped Java get rid of the impossibilty of multiple inheritance.
*/