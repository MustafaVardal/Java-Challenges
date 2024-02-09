/*
	This operator is used only for object reference variables. The operator checks whether the object is of a particular type (class type or interface type). instanceof is written as
	( Object reference variable ) instanceof (class/interface type)
*/
/*
public class TestInstance{
	public static void main(String args[]){
		String name = "James";
		
		// following will return true since name is type of String
		boolean result = name instanceof String;
		System.out.println( result );
	}
}
*/

// SECOND EXAMPLE

class Vehicle{}

public class Car extends Vehicle{
	public static void main (String args[]){
		
		Vehicle a = new Car();
		boolean result = a instanceof Car;
		System.out.println( result );
	}
}	