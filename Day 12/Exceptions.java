/*
	An exception( or exceptional event) is a problem that arises during the execution of a program.
	When an Exception occurs the normla flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.
	

*/
/*
	why exception occurs?
	An exception can occur for many different reason. Depends on the scenario
	
	A user has entered an invalid data.
	A file that needs to be opened cannot be found.
	A network connection has been lost in the middle of communications or the jvm has run out  of memory.
	
	Some of these exceptions are caused by  user error, others by programmer erorr, and others by physical resources  that have failed in some manner.
	
	
*/

/*
	Based on these, we have the categories Exceptions. You need to understand them to know how exception handling works in java.
	
	checked exceptions
	unchecked exceptions 
	errors
*/

/*
	Java checked exceptions
	a checked eception is an exception that is checked(notified ) by the compiler at compilation-time, these are also called as compile time exceptions.
	These exceptions cannot simply be ignored, the programmer should take care of (handle ) these exceptions.
	
	Example checked exceptions in javaa
	
	import java.io.File;
	import java.io.FileReader;
	
	public class FilenotFound_demo{
		
		public static void main(String args[]){
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		}
	}
	
	output : 
	C:\>javac FilenotFound_Demo.java
	FilenotFound_Demo.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
      FileReader fr = new FileReader(file);
                      ^
	1 error
	
	note: 
	Since the methods read() and close() of FileReader class throws IOException, you can observe that the compiler notifies to handle IOException, along with FileNotFoundException.
*/

/*
	Java Unchecked Exceptions
	
	An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an api. 
	Runtime exceptions are ignored at the time of compilation.
	
	Example : 
	public class  Unchecked_demo {
		public static void main(String args[]){
			int num[] = {1,2,3,4};
			System.out.print(num[5]);			
		}
	}
	
	output: 
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at Exceptions.Unchecked_Demo.main(Unchecked_Demo.java:8)
*/


/*

	java exception hierarchy
	all exception classes are subtypes of the java.lang.Exception class. The exception class is a subclass of the Throwable class. 
	Other than the exception class there is another subclass called Error which is derived from the Throwable class.
	
	errors are abnormal conditions that happen in case of severe failures, these are not handled by the java programs. 
	Errors are generated to indicate errors generated by the runtime environment.
	Example: JVM is out of memory. Normally, programs cannot recover from errors.
	
	The Exception class has 2 main subclasses: IOException and RuntimeException class.
	
	we will see on the next days practise more java's built-in exceptions.
	
*/	

/*
	Java exception class methods
	
	public String getMessage()
	Returns a detailed message about the exception that has occured.This message is initialized in the Trowable constructor.
	
	public Throwable getCause()
	Returns the cause of the exception as represented by a Throwable object.
	
	public String to String()
	Returns the name of the class concatenated with the result of getMessage()
	
	public void printStackTrace()
	Prints the result of toString() along with the stack trace to System.err, the error output stream.
	
	public StackTraceElement[] getStackTrace()
	Returns an array containing each element on the stack trace. 
	The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
	
	public Throwable fillInStackTrace()
	Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
	
*/

// Catching Exceptions: Exception Handling in Java
/*
	A method catches an exception using a combination of the try and catch keywords. 
	A try/catch block is placed around the code that might generate an exception. 
	Code within a try/catch block is reffered to as protected code, and the syntax for using try/catch lookslik the syntax.
	Syntax:
	
	try{
		//protected code
	} catch (ExceptionName e1) {
		// catch block
	}
	
	
*/

// Demonstrating Exception Handiling
/*
	In the example, an array declared with 2 elemtns. then the code tries to acces the 3rd element of the aray which throws an exception.
*/
// file name : ExcepTest.java

/*
import java.io.*;
public class ExcepTest{
	public static void main(String args[]){
		try{
			int a[] = new int[2];
			System.out.print("Access element three: ", a[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Exception throw : ", e);
		}
		System.out.print("Out of the block.");
	}
}

// Output:

/*
	Exception thrown: java.lang.ArrayIndexOutOfBoundsException: 3
	Out of the block.
*/

// Multiple Catch Blocks
// A try block can be followed multiple catch blocks.
/*
Syntax
	try {
		// protected code
	} catch (ExceptionType1 e1){
		//Catch block
	} catch (ExceptionType2 e2){
		// Catch block
	} catch (ExceptionType3 e3){
		// Catch block
	}
The previous statements demonstrate three catch blocks, but you can have any number of them after a single try.
 If an exception occurs in the protected code, the exception is thrown to the first catch block in the list. 
 If the data type of the exception thrown matches ExceptionType1, it gets caught there.
 If not, the exception passes down to the second catch statement. 
 This continues until the exception either is caught or falls through all catches,
 in which case the current method stops execution and the exception is thrown down to the previous method on the call stack.
*/
/*
// example
try{
	file = new FileInputStream(fileName);
	x  = (byte) file.read();
	
} catch (IOException i){
	i.printStackTrace();
	return -1;
} catch (FileNotFoundException f) //Not valid!
{
	f.printStackTrace();
	return -1;
}
*/
//Catching Multiple Type of Exception
/*
Since Java 7, you can handle more than one exception using a single catch block, this feature simplifies the code. Here is how you would do it −

catch (IOException | FileNotFoundException ex){
	logger.log(ex);
	throw ex;
}

*/

/*
	The Throws / Throw Keyword.
	if a method does not hacle a checked exception, the method must declare it using the throws keyword.
	The throws keyword appears at the end of a method's signature.
	
	You can throw an exception. either a newly instantiated one or an exception that you just caught, by using the throw keyword.
	
	Try to understand the differnece between throws and throw keywords, throws is used to postpone the handling of a checked exception and throw is used to invoke an exception expilicitly.
	
	import java.io.*
	public class className{
		
		public void deposit (double amount) throws RemoteException{
			// method implementation
			throw new RemoteException();
		}
		// remainder of class definition.
	}
	
	
	A method can declare that it throws more than one exception, in which case the exceptions are declared in a list separated by commas.
	
	Example : 
	import java.io.*
	
	public class className{
		public void withdraw(double amount) throws RemoteException, InsufficientFundsException {
				//method implementation
		}
				// remainder of class definition
	}
*/

/*
The Finally Block
The finally block follows a try block or a catch block. A finally block of code always executes, irrespective of occurrence of an Exception.

Using a finally block allows you to run any cleanup-type statements that you want to execute, no matter what happens in the protected code.

A finally block appears at the end of the catch blocks and has the following syntax −

syntax.
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block
} catch (ExceptionType2 e2) {
   // Catch block
} catch (ExceptionType3 e3) {
   // Catch block
}finally {
   // The finally block always executes.
}

*/

/*
	public class ExcepTest{
		public static void main(String args[]){
			int a [] = new int[2];
			try{
				System.out.print("Access element three : " + a[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Exception thrown : " + e);
			} finally {
				a[0] = 6;
				System.out.print("First element value : " + a[0]);
				System.out.print("The finally statement is executed");
			}
		}
	}
	
	Output: 
	Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
	First element value: 6
	The finally statement is executed
	
	
	NOTE 
	A catch clause cannot exist without a try statement.
	It is not compulsory to have finally clauses whenever a try/catch block is present.
	The try block cannot be present without either catch clause or finally clause.
	Any code cannot be present in between the try, catch, finally blocks.
*/


/*
	The try-with resources
	Generally, when we use any resource like strams, connections, etc. we have to close them explicitly using finally block.
	
	Example :
	
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class ReadData_Demo {
		
		public static void main(String args[]){
			FileReader fr = null;
			try {
				File file =new File("file.txt");
				fr = new FileReader(file);
				char[] a = new char[50];
				fr.read(a); // reads the content to the array
				System.out.print(c); // prints the characters one by one
			} catch (IOException e){
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
 try-with-resources, 
 also referred as automatic resource management,
 is a new exception handling mechanism that was introduced in Java 7,
 which automatically closes the resources used within the try catch block.
*/

/*
 import java.io.FileReader;
 import java.io.IOException;
 
 public class Try_withDemo{
	 public static void main(String args[]){
		 try(FileReader fr = new FileReader("E://file.txt") {
			 char [] a = new char[50];
			 fr.read(a); // reads the content to the array.
			 for(char c : a)
				 System.out.print(c); // prints the characters one by one
		 }
	 }
 }
 
 To use a class with try-with-resources statement it should implement AutoCloseable interface and the close() method of it gets invoked automatically at runtime.

You can declare more than one class in try-with-resources statement.

While you declare multiple classes in the try block of try-with-resources statement these classes are closed in reverse order.

Except the declaration of resources within the parenthesis everything is the same as normal try/catch block of a try block.

The resource declared in try gets instantiated just before the start of the try-block.

The resource declared at the try block is implicitly declared as final.
*/


/*
	User-defined Exceptions in java
	You can crate your own exception in java. Keep folowing points in mind
	
	All exceptions mut be a child of Throwable
	If you want to write checked exception that is automatically enforced by yhe handle or declare rule, you need to extend the exception class.
	If you want to write a runtime exception, you need to extend the RunTimeException class.
	
	Syntax
	class MyException extends Exception{}
	You just need to extend the predefined Exception class to create your own Exception. These are considered to be checked exceptions. 
	The following InsufficientFundsException class is a user-defined exception that extends the Exception class, making it a checked exception. 
	An exception class is like any other class, containing useful fields and methods.
*/
/*
file name : InsufficientFundsException.java
	import java.io.*;
	public class  InsufficientFundsException extends Exception {
		private double amount;
		
		public InsufficientFundsException(double amount){
			this.amount = amount;
		}
		public double getAmount(){
			return amount;
		}
	}
	
	
*/

///To demonstrate using our user-defined exception, the following CheckingAccount class contains a withdraw() method that throws an InsufficientFundsException.
// File name CheckingAccount.java
/*
import java.io.*;
public class CheckingAccount{
	private double balance;
	private int number;
	
	public CheckingAccount(int number){
		this.number =number;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount <= balance){
			balance -= amount;
			
		}
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
	}
}
public double getBalance(){
	return balance;
}

public int getNumber() {
	return number;
}
*/

/*
 public class BankDemo{
	 public static void main(String args[]){
		 CheckingAccount c = new CheckingAccount(101);
		System.out.print(Deposit $500...);
		c.deposit(500.00);
		
		try {
			System.out.print("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.print("\nWithdrawing $600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e){
			System.out.print("Sorry, but you are short $." + getAmount());
			e.printStackTrace();
		}
	 }
 }
 
 Output :
	Depositing $500...

	Withdrawing $100...

	Withdrawing $600...
	Sorry, but you are short $200.0
	InsufficientFundsException
			 at CheckingAccount.withdraw(CheckingAccount.java:25)
			 at BankDemo.main(BankDemo.java:13)
	*/
	
/*Common Java Exceptions
	In Java, it is possible to define two catergories of Exceptions and Errors.

		JVM Exceptions − These are exceptions/errors that are exclusively or logically thrown by the JVM. Examples: NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException.

		Programmatic Exceptions − These exceptions are thrown explicitly by the application or the API programmers. Examples: IllegalArgumentException, IllegalStateException.*/