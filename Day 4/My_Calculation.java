/*
	In Java programming, the inheritance is an important of concept of Java OOPs. 
	Inharitance is a process where one class acquires the properties(methods and attributes) of another. 
	With the use of inheritance, the inforamtion is made manageable in a hierarchical order.
	
	The class which inherits the properties of other is kknown as subclass (derived class, child class) and the class whose properties are inherited is known as superclass(base class, parent class).

	
	/*
		Need of Java Inheritance
		
		Code Reusability; the basic need of an inheritance is to reuse the features. If you have defined some functionality once, by using the inheritance you can eaisly use them in other classes and packages.
		Extensibility; the inheritance helps to extend the functionalities of a class. If you have a base class with some functionalities, you can extend them by using the inheritance in derived class.
		Implantation of Method Overriding; Inheritance is required to achieve one of the concepts of Polymorphism which is Method overriding. 
		Achieviing Abstraction; another concept of OOPs that is abstraction also needs inheritance. 
		
	*/

// To implement (use) inheritance in Java, the extends keywords is used. It inherits the properties(attributes and/or methods) of the base class to the derived class. 
// The word "extends" means to extend functionalities i.e., the extensibility of the features.
/*
	class Super{
		
		....
		....
		
	}
	
	class Sub extend Super{
		....
		...
		...
		
	}

*/

class Calculation{
	int z;
	
	public void addition(int x, int y){
		
		z = x + y;
		System.out.print(" The sum of the given numbers : " + z);
	}
	
	public void Substraction(int x , int y){
		z = x - y;
		System.out.print("\n The differences between the given numbers: " + z );
		
	}
	
	public void mult(int x,  int y){
		z = x * y;
		System.out.print("\n The multiplication between the given numbers: " + z);
	}
}	
	
	public class  My_Calculation extends Calculation{
		public void division(int x , int y){
		z = x / y;
		System.out.print("\n The division of the given numbers: " + z );
		}
	
	
	public static void main(String args[]){
		int a = 40 , b = 5;
		My_Calculation obj = new My_Calculation();
		obj.addition(a, b);
		obj.Substraction(a, b);
		obj.mult(a, b);
		obj.division(a, b);
	}
}


/*
	In the given program, when an object to My_Calculation class is created, a copy of the contents of the superclass is made within it.
	That's why, using object of the subclass you can access the mumbers of a superclass.
	The Superclass reference variable can hold the subclass object, 
	but using that variable you can access only the members of the superclass, 
	so to access the members of both classes it is recommended to always create reference variable to the subclass.
	
	If you consider the above program, you can instantiate the class as given below. But using the superclass refrence variable ( cal in this case ) you cannot call the method division(),
	which belong to the subclass My_Calculation.
	
	Calculation obj = new My_Calculation();
	obj.addition(a, b);
	obj.Substraction(a, b);
	obj.mult(a, b);
	
	A subclass inherits all the members (field, methods, and nested classes) from its superclass. 
	Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
*/




