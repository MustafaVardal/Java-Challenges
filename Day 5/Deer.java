/*
	Polymorphism is the ability of an object to take on many forms. Polymorphism is an important feature of Java OOPs cooncept and it allows us to perform multiple operations by using single name of any method(interface).
	Any Java object that can pass more than one IS-A test is considered to be polymorphic.
	In Java, all Java objects are polymorpic since any object will pass the IS-A test for its own type and for the class Object.
	
*/

/*
	THe most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
	It is important to know that the only possible way to access an object is through a reference variable.
	A reference variable can be of only one type.
	Once declared, the type of a reference variable cannot be changed.
	The refrence variable can be reassigned to other objes provided that it is not declared final.
	The type of the reference variable would determine the methods that it can invoke on the object.
	A reference variable can refer to any object of its declared type or any subtype of its declared type.
	A reference variable can be declared as a class or interface type.
*/


/*
	public interface Vegeterian{}
	public class Animal{}
	public class Deer extends Animal implements Vegeterian{}
	
	Now, the Deer class is considered to be polymorphic since this has multiple inheritance.
	Following are true for the above examples
	A Deer IS-A Animal
	A Deer IS-A Vegeterian
	A Deer IS-A Deer
	A Deer IS-A Object
	
	When we apply the reference variable facts to a Deer object reference, the following declarations are legal
	
	Deer d  = new Deer();
	Animal a = d;
	Vegeterian v = d;
	Object o = d;
	
	All the reference varables d, a, v, o refer tp tje same Deer object in the heap.
*/
interface Vegetarian{}
class Animal{}
public class Deer extends Animal implements Vegetarian{
	public static void main(String args[]){
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.print(d instanceof Deer );
		System.out.print(" ");
		System.out.print(a instanceof Deer);
		System.out.print(" ");
		System.out.print(v instanceof Deer);
		System.out.print(" ");
		System.out.print(o instanceof Deer);
	}
}


