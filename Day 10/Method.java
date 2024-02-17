/*
Normally, when we work with Numbers,we use primitive datatypes such as byte, int, long, double. etc.

Example
int i = 500;
float d = 456.56f;
double mask = 12314;

Sometimes, there may be some situations where we need to use objects instead of primitive data types.
To achieve this, Java priveds wrapper classes.

All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are sub classes of the abstract class Number.

*/


/*
	The Number class is an abstract class in java.lang package. It is the superclass of the classes that represent numeric values covertible to primitive data types such as byte, short, int long, float and double.
	
*/

/*
	The object og the wrapper class contaions or wraps its respective primitive data type. Converting primitive data types into object is called boxing, and this is taken care by compiler.
	Therefore, while using a wrapper class you just need to pass the value of the primitive data type to the constructor of the Wrapper class.
	
	And the Wrapper object will be converted back to a primitive data type, and this process is called unboxing. The Number class is part of the java.lang package.

*/
/*
public class NumberClass{
	public static void main(String args[]){
		Integer x = 5 ;// boxing 
		x = x + 10; // unboxing.
		System.out.print(x);
	}
}
*/

// byteValue()

/*
	public class NumberByteVal{
		public static void main(String args[]){
			
			Integer x = new Integer(134);
			System.out.print("x as integer: " + x + ", x as byte: " +x.byteValue());
		}
	}
*/

/*
	public class NumberByteVal1{
		public static void main(String args[]){
			
			Long y = new Long(12313213123123);
			System.out.print("X as long: " + x + ", x as byte: " + x.byteValue());
			
		}
		
	}
*/

// We can also different type of datatypes  doublValue(), floatValue(), intValue(), longValue().. 

//Example:

// If you want to take first 100 byte in the text. We can use byteValue()


//Example:
/*
import java.io.FileInputStream;
import java.io.IOException;

public class Main{
	public static void main(String args[]){
		try (FileInputStream inputStream = new FileInputStream("file.txt")){
			byte[] first_100 = new byte[100];
			int bytesRead = inputStream.read(first_100, 0 , 100);
			
			for (int i =0; i < bytesRead; i++){
				System.out.print(first_100[i]+ " ");
			}
		}	catch (IOException e){
			e.printStackTrace();
		}
	}
}
*/

// compareTo()
/*
The method compares the Number object that invoked the method to the argument. It is possible to compare Byte, Long, Integer, etc.
However, two different types cannot  be compare, both the argument and the number object invoking the method should be of the same type.

referenceName - this could be a Byte Double Integer Float Long or Short.

If the Integer is greater than the argument then 1 is returned.
If the Integer is equal to the argument then 0 is returned.
If the Integer is less than the argument then -1 is returned.



public class CompareTo{
	
	public static void main(String args[]){
		Integer x = 5 ;
		
		//Integer value is greater than the argument (5 > 3) so, output is 1
		System.out.print(x.compareTo(3));
		
		//Integer value is equal to the argument so, output is 0
		System.out.print(x.compareTo(5));
		
		//Integer value is less than the argument (5 < 8) so, output is −1
		System.out.print(x.compareTo(10));
	}
}*/
// We can use different datatype too. Use the boxing. 

// equals()

/*
Return Value
The method returns True if the argument is not null and is an object of the same type and with the same numeric value. 
There are some extra requirements for Double and Float objects


/// Example
public class EqualTo{
	public static void main(String args[]){
		Integer x = 5;
		Integer y = 10;
		Integer z = 5;
		Short a = 5;
		
		System.out.print(x.equals(y));
		System.out.print(x.equals(z));
		System.out.print(x.equals(a));
		
		
	}
}

/// Output: False True False 
*/

/*
//// Example 2

public class EqualToFloat_Double{
	public static void main(String args[]){
		Float x = (float)5.0;
		Float y = (float)10.0;
		Float z = (float)5.0;
		Double a = 5.0;
				
		System.out.print(x.equals(y));
		System.out.print(x.equals(z));
		System.out.print(x.equals(a));
		
	}
}

/// Output false true false

*/

/*
///valueOf()

/// The valueOf method returns the relevant Number Object holding the value of the argument passed. The argument can be a primitive data type, String, etc.
/// This method is a static method. The method can take two arguments, where one is a String and the other is a radix.

public class ValueOf(){
	public static void main(String args[]){
		Integer x = Integer.valueOf(3);
		Double d = Double.valueOf(4);
		
		System.out.print(x);
		System.out.print(d);
	}
}

// output 3 4.0
*/

// toString()

//The method is used to get a String object representing the value of the Number Object.

//If the method takes a primitive data type as an argument, then the String object representing the primitive data type value is returned.

//If the method takes two arguments, then a String representation of the first argument in the radix specified by the second argument will be returned.

/*
public class ToString{
	public static void main(String args[]){
		
		Double x = 5.0;
		
		System.out.print(x.toString());
		System.out.print(Double.toString(34.0));
	}
}
*/

/*

// output 5.0 12.0

//parseInt()
//This method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.

public class ParseInt{
	public static void main(String args[]){
		double  x = Double.parseDouble("9.9");
		System.out.print(x);
	}
	
}

// out put will return 9.9
*/


