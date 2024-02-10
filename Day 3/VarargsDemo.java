/*
	JDK 1.5 enables you to pass a variable number of arguments of the same type to a method. The parameter in the method is declared as follows
	typeName ... parameterName

	In the method declaration, you specify the type followed by and ellipsis(...) 
	Only one variable length parameter may be specified in a methid, and this parameter must be the last parameter.. 
	Any regular parameters must precede it.
*/

public class VarargsDemo{
	public static void main(String args[]){
		
		// Call method with variable args
		printMax(34,3,3,2,56.5);
		printMax(new double[]{1,2,3});
	}
	
	public static void printMax(double ... numbers){
		if ( numbers.length == 0){
			System.out.print("No argument passed!");
			return;
		}
		
		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++)
			if ( numbers[i] > result)
				result = numbers[i];
				System.out.print("\n The max value is " + result);
			
		
	}
}


/*
	It is possible to define a method that will be called just before an object's final destruction by yhe garbage collector. 
	This method is called finalize(), and it can be used to ensure that an object terminates cleanly.
	Example, you mught use finalize() to make sure that an open file owned by that object is closed.
	To add a finalizer to a class, you simply define the finalize() method. The Java runtime calls that method whenever it is about to recycle an object of that class.
	Inside the finalize() method, you will specify those actions that muyst be performed befor and object is destroyed.
	
	The finalize() method has this general form
	
	protected void finalize(){
		
		finalization code here
	}
	
	
	Here, the keyword protected is a specifirer that prevents access to finalize() by code dewfined outside its class. 
	This means that ypou cannot know when or even if finalize() will be executed. 
	Example===> If your program ends before garbage collection occurs, finalize() will not execute.
*/