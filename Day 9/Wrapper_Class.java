/*
	Normally, when we work with numbers , we use primitive data types such as byte, int, long, double, etc.
	
	int i = 5000;
	float age = 13.4532f;
	double mask = 123;
	
	However,  in development,  we come across stituations where we need to be use objects instead of primitive data types. In order to achieve this,Java provides wrapper classes.
	
	
*/

/*
	Wrapper classes are those whose objects wraps a primitive data type within them.
	In the java.lang package java provides a separate class for each of the primitive data types namely Byte, Character, Double, Integer, Float, Long, Short.
	At the time of instantiation, these classes accept a primitive datatype directly, or in the form of String.
	Wrapper classes provide methods to, convert primitive datatypes within them to String objects and, to compare them with other objects etc.
	Using wrapper classes, you can also add primitive dataypes to various Collection objects such as ArrayList, HashMap etc. You can also pass primitve values over a network using wrapper classes.
	all the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.
*/


/*
	The object the wrapper class contains or wraps its resprective primitive data type. 
	Converting primitive data types into object s called boxing, and this is taken care by the compiler.
	Therefore, while using a wrapper class you just need to pass the value of the primitve data type to the constructor of the Wrapper class.
	And the Wrapper object will be converted back to a primitive data type, and this process is called unboxing. 
	The Number class is part of the java.lang package
	
	syntax: 
	
	wrapper_class object_name = value;
*/
public class Wrapper_Class{
	
	public static void main(Strings args[]){
		Integer x = 5; // boxing int to an Integer object.
		x = x + 12; // unboxing Integer to an int
		System.out.print(x);
	}
}
