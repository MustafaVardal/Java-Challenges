// Java try catch block
/*
An  exception ( or exceptional event) is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program / application terminates abnormally,
which is not recommended , therefore, these exceptions are to be handled.

*/

// Java try and catch
/*
A method catches and exception using a combination of the try and catch keywords. A try and catch block is placed around the code that might generate and exception.
Code within a try and catch block is referred to as protected code, and the syntax for using try/catch looks like the following-
The try block
The code which is prone to exceptions is placed in the try block. When an exception occurs; that exception occurred is handled by catch block associated with it. 
Every try block should be immediately followed either by a catch block or finally block.
The catch block
A catch statement involves declaring the type of exception you are trying to catch.
If an exception occurs in protectedcode, the catch block (or blocks) that follows the try is checked.
If the tyoe of exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.

Syntax of java try and catch block

try {
	// protected code
	
}	catch (ExceptionName e1){
	// catch block
}
*/

// Example of Java try and catch block.
/*
In the following example, an array is declared with 2 elements.Then the code tries to access the 3 rd element of the array whcih throws an exeption,
 As we've enclosed the code with a try block, this exception can be handled within next catch block which we've declared to catch ArrayIndeOutBoundsExpection.
 After catching the exception, we can take the corresponding action. 

 public class ExcepTest{
	 public static void main(String args[]){
		 try{
			 int a[] = new int[2];
			 System.out.print("Access element three: " + a[3]);
		 } catch (ArrayIndeOutBoundsExpection e){
			 System.out.print("Exceptiom thrown : " + e);
		 }
		 System.out.print("Out of the block");
	 }
 }
OUTPUT:
	Exception thrown : java.lang.ArrayIndexOutBoundsExpection: 3 
	Out of the block.
 */
 


///////////////////////////////////////////////////////////////
/*	
MULTI CATCH BLOCK WITH JAVA TRY
A TRY BLOCK CAN BE FOLLOWED BY MUTLIPLE CATCH BLOCK.
Syntax
try {
	//protected code
} catch (ExceptionType1 e1){
	//catch block
} catch (ExpectionType2 e2){
	// catch block
} catch (ExceptionType3 e3){
	// catch block
}

The previous statments demostrate three catch blocks, but you can have any number of them after a single try.
If an exception occurs in the protected code, the exception is thrown to the first catch block in the list. If the data type of the exception thrown matches ExceptionType1, it gets caught there.
If not, the exception passes down to the second catch statement. 
This continues until the exception either is caught or falls through all catches, in which case the current method stops execution and the exception is thrown down to the previuos method on call stack.
*/
//Example Multiple Catch Blocks
/* 
Here is code segment showing hot to use multiple tyr/catch statments. In this example, we are creating an error by dividing a value by 0.
As it is not an ArrayIndexOutBoundsExpection, next catch block handles the exception and prints the details.
public class ExcepTest{
	public static void main(String args[]){
		try {
			int a[] = new int[2];
			int b = 0;
			int c = 1/b;
			System.out.print("Access elemnt three: " + a[3]);
			} catch (ArrayIndexOutBoundsExpection e){
				System.out.print("ArrayIndexOutBoundsExpection thrown : " + e);
			} catch (Exception e){
				System.out.print("Exception : " + e);
			}
			System.out.print("Out of the block");
	}
}

Output: 
Exception thrown : java.lang.ArithmeticException: / by zero
Out of the block.
*/

// CATCHING MULTIPLE EXCEPTION WITH JAVA TRY AND CATCH BLOCK
/*
Since Java 7, you can handle more than one exception using a single catch block, this feature simplifies the code.

Syntax: 
catch (IOException|FileNotFoundException ex){
	logger.log(ex);
	throw ex;
}
*/
/*
Example: Catching Multiple Exceptions
Here is code segment showing how to use multiple catch in a single statement. In this example, we are creating an error by dividing a value by 0. 
In single statment, we are handling ArrayIndexOutBoundsExpection and ArithmeticException.

public class ExcepTest{
	public static void main(String args[]){
		try {
			int a[] = new int[2];
			int b = 0;
			int c = 1/b;
			System.out.print("Access elemnt three : " + a[3]);
		} catch (ArrayIndexOutBoundsExpection | ArithmeticException e){
			System.out.print("Exception thrown:" + e);
		}
		System.out.print("Out of the block");
	}
}

Output:
Exception thrown : java.lang.ArithmeticException: /by zero
Out of the block.
*/
