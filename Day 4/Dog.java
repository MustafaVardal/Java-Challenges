/*
	IS-A is a way of saying: This object is a type of that object. Let us see how the extends keyword is used to achieve inheritance.

*/

/*

public class Animal{
	
}

public class Mammal extends Animal{
	
}

public class Reptile extends Animal{
	
}

public class Dog extends Mammal{
	
}
*/
/*
	Animal is the superclass of Mammal class.
	Animal is the superclass of Reptile class.
	Mammal and Reptile are subclasses of Animal class.
	Dog is the subclass of both Mammal and Animal classes.
	
*/

/*
	Mammal IS-A Animal
	Reptile IS-A Animal
	Dog IS-A Mammal
	Hence: Dog IS-A Animal as well
*/


/*
class Animal{
	
}

class Mammal extends Animal{
	
}

class Reptile extends Animal{
	
}

public class Dog extends Mammal{
	
	public static void main(String args[]){
		Animal a = new Animal();
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.print(m instanceof Animal);
		System.out.print(d instanceof Mammal);
		System.out.print(d instanceof Animal);
	}
	
}
*/


/*
	Since we have a good understanding of the  extends keyword, 
	let us look into how the implements keyword is used to get the IS-A relationship.
	
	Generally, the implements keyword is used with classes to inherit the properties of an interface.
	Interface can never be extended by a class.
	
*/

/*
	public interface Animal {
		
	}
	public class Mammal implements{
		
	}
	public class Dog extends Mammal{
		
	}
*/

/*
	Let us use the instanceof operator to check determine whether Mammal is actually an Animal, and dog is actually an Animal.
*/
interface Animal{}
class Mammal implements Animal{}

public class Dog extends Mammal{
	
	public static void main(String args[]){
		
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.print(  m instanceof Animal);
		System.out.print("\n");
		System.out.print(  d instanceof Mammal);
		System.out.print("\n");
		System.out.print(  d instanceof Animal);
	}
}