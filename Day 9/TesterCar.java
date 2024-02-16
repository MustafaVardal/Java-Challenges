/*
	An anoymous class in Java is Inner class whcih is declared without any class name at all.
	In other words, a nameless inner class in Java is called an anonymous inner class. Since it does not have a name, it cannot  have a constructor because we know that a constructor name is the same as the class name.
	
*/

/*
	Anonymous inner classes are used when you wnat to create a simple class that is needed for one time only for a specific example. 
	For example
	
	implementing an interface or extending a class.
	
	
*/

/*
	You can define an anonymous inner class and create its object using the new operator at the same time in one step.
	
	new(argument-list){
		
		// Anonymous class body
	}
*/

/*
	Anonymous inner class that extends a class
	Anonymous inner class that implements an interface
	Anonymous inner class as an argument-list
	
*/

// Anonymous inner class that extends a class

	class Car{
	
	public void engineType(){
		System.out.print("Turbo Engine");
	}
}

	public class TesterCar{
		public static void main (String args[]){
			Car c1 = new Car();
			c1.engineType();
			Car c2 = new Car(){
			public void engineType(){
				System.out.print("\nV2 Engine");
			}
		};
		c2.engineType();
		}
}
