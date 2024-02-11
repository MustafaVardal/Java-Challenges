/*
	Java contructors are special types of methods that are used to initilize an object when it is created. 
	It has same name as its class and is syntactically similar to a method.
	However, contructors have no explicit return type.
	
	Typically, you will use a constructor to give initial values to the instance variables defined by the ckass or to perform any other start-up procedres required to create a fully formed object.
	All class have contructors, whether you define one or not becuase Java automatically provides a default cpmstructors that initializes all member varables to zero.
	However, once you define your constructor, the default constructor is no longer used.
*/

/*
	You must follow the below-given rules while creating Java constructors:
	The name of the constructors must be the same as the class name.
	Java constructor do not jave a retrun type. Even do not use void as a return tpe.
	There can be multple constructors in the same class, this concept is known as constructor overloading.
	The access modifiers can be used with the constructors, use if you want to chance the visibilty/ accesibilty of constructors.
	Java provides a default constructor that is invoked during the time of object creation.
	If you create any type of contructor, the default constructor (provided by Java) is not invoked.
*/

/*
	To create a constructor in Java , simply write the constructor's name(that is the same as the class name) followed by the brackets and then write the constructor's body inside the curly braces	({}).
		
		class ClassName{
			ClassName(){
				
			}
		}
*/

public class Main{
	//Creating a constructor
	Main(){
		
		System.out.print("Hello, world!");
	}
	
	public static void main(String args[]){
		
		System.out.print("The main() method.\n");
		
		// Creating a class's object
		// that will invoke the constructor
		Main obj_x= new Main();
	}
	
}
/*
	There are three different types of constructors in Java. 
	Default Constructor
	No-Args Constructor
	Parameterized Constructor

*/

