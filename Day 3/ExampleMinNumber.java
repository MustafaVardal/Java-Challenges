/*
 A Java mehtod is a collection of statements that are grouped together to perform an operation. When you call the System.out.print() method,
	Example = the system actually executes several statemnts in order to display a message on the console. 
*/

/*
	To create a Java method, there should be an access modifier followed by the return type, method's name, and parameters list.
	
	modifier returnType nameOfMethod (Parameter List){
		//method body
	}
	
	modifier = It defines the access type of the method and it is optional to use.
	returnType = Method may return a value
	nameOfMethod = This is the method name. The method signature consists of the method name and the parameter list.
	Parameter List = The list of parameters, it is the type, order, and number of parameters of a method. These are  optional, method may contain zero parameters.
	method body = The method body defines what the method does with the statements.
	
	Example =
	// the snippet returns the minimum between two numbers
	
	public static int minFuction (int n1, int n2){
		int min;
		
		if (n1>n2){
			min = n2;
		}
		else {
			min = n1;
		}
		return min;
	}
*/

/*
	For using a method, it should be called. There are two ways in which a method is called i.e., method returns a value or retuning nothing (no return value).
	The process of methid calling is simple. When a program invokes a method, the program control gets transffered to the called methid. Thiscalled methiod then return control to caller in two conditions when
		The return statement is executed
		It reaches the method ending closing brace.
		
	The methods returning void is considered as call to a statemnet Lets consider an example
	
	System.out.print("This is a cahallenge! ");
	
	The method returning value can be understood by following example 
	int result = sum(6, 9);
	

*/

//Defining and calling a java method.

public class ExampleMinNumber{
	
	public static void main(String args []){
		int a = 11;
		int b = 5 ; 
		int c = minFuction(a ,b);
		System.out.print("Minimum Value = " + c);
	}
	// return the minimum of two number.
	
	public static int minFuction(int n1, int n2){
		int min;
		if ( n1 > n2){
			min = n2;
		}
		else{
			min = n1; 
		}
		return min;
	}
}
