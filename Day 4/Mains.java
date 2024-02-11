/*
	These relationships are mainly based on the usage. This determines whether a certain class HAS-A certain thing. This relationship helps to reduce duplication of code as well as bugs.
	
	public class Vehicle{}
	public class Speed{}
	
	public class Van extends Vehicle{
		private Speed sp;
		
	}
	This shows that class Van HAS-A Speed. 
	By havin a separe class for Speed, we do not have to put the entire code that belongs to speed inside the Van class, which makes it possible to reuse the Speed class in multiple applications.
	
	In Object-Oriented feature, the users donot need to botjer about which object is doing the real work. To achieve this, the Van class hides the implementation details from the users of the Van class. 
	So, basically what happeens is the users would ask the Van class to do a certain action and the Van class will either do the work by itself or ask another class to perform the action.
	
	
*/

/*
	In Java, there are mainly three types f inheritances Single, Multilevel, and Hierarchical. Java does not support Multiple and Hybrid inheritance.
	
	A very importnat fact to remember is that Java does not support multiple and hybrid inheritances. This means that a class cannot extend more than one class. Therefore following is illegal.
*/


/*
	The inheritance in which there is only one base class and one derived class is known as single inheritance. 
	The single(or, single-level) inheritance inherits data from only one base class to only one derived class.
*/
class One{
	public void printOne(){
		System.out.println("printOne() method of One class.");
	}
}

public class Mains extends One{
	public static void main (String args[]){
		
		//Creating object of the derived class (Main)
		Mains obj = new Mains();
		
		// Calling method
		obj.printOne();
	}
}