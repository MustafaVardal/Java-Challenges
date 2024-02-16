/*
	Java Enum class is the common base class for all enumeration types. 
	It is a special class that contains a group of pre defined constant values that are known at the compile-time itself.
	
	Java Enum Class Declaration
	
	public abstract class Enum<E extends Enum<E>>
		extends Object
			implements Comparable<E>, Serializable
*/

public class Enums{
	public static void main(String args[]){
		
		Mobile mobile = Mobile.Samsung;
		
		if(mobile  == Mobile.Samsung){
			System.out.print("Matched.");
		}
		
		switch(mobile){
			case Samsung:
				System.out.print("Samsung");
				break;
			case iPhone:
				System.out.print("iPhone");
				break;
			case LG:
				System.out.print("LG");
				break;
			
		}
	}
}

enum Mobile{
	Samsung,
	iPhone,
	LG
}