/*
	Nested Try Block View
	A try block can be nested within another try block. This structure is termed as Nested try block.
	Whenever an exception is raised within a nested try block, its exception is pushed to STack. The exception propagates from child to parent try block and so on.
	
	Syntax 
	try {
			// parent try block
		try{
			// .. child try block
		} catch(ExceptionType1 e1){
			// child catch block
		}
	} catch (ExceptionType2 e2){
		// parent catch block.
	}
	
	The previous statements demonstrate two try/catch blocks, bu you can have any number of them. 
	If an exception occurs in the protected child code, the exception is thrown to the catch block of the child list. If the data type of the exception thrown mathes ExceptionType1, it gets caught there.
	If not, the exception passes up to the parent catch statement. 
	This continues until the exception either is caught or falls though all catches, in which case the current method stops execution and the exception is thrown down to the previous method on the call stack.
*/

/*
	Pointer to remmber while using nested try block
	child catch block should have sprecific exception for better code clarity. Parent catch block can have more generic exception handled so that if child catch block is not able to handle the exception then parent catch block can handle it.
	There  in no restriction on exception hierachy to be used in child vs parent catch block.
	If an exception is handled correctly in child catch block, then in parent, another exception can be raised and handled.
	

*/
//example 1
public class ExcepTest{
	public static void main(String args[]){
		try{
			int a[] = new int[2];
			try {
				int b = 0;
				int c = 1/b;
				} catch (Exception e){
					System.out.print("Exception thrown : " + e);
				}
					System.out.print("Access element three: " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Exception thrown: " + e);
		}
		System.out.print("Out of the block");
	}
}

Output:
	Exception thrown : java.lang.ArithmeticException: / by zero
	Exception thrown : java.lang.ArrayIndexOutOfBoundsException: 3
	Out of the block.

//example 2
public class ExpecTest{
	public static void main(String args[]){
		try {
			int a[] = new int[2];
		 try {
			int b = 0;
			int c = 1/b;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Exception thrown : " + e);
		}
			System.out.print("Access element three: " + a[3]);
		} catch (Exception e){
			System.out.print("Exception thrown: " + e);
		}
		System.out.print("Out of the block.");
	}
}

Output: 
		Exception thrown : java.lang.ArithmeticException: /by zero
		Out of the block.
		
//example 3
public class ExcepTest{
	public static void main(String args[]){
		try{
			int a[] = new int[2];
			try{
				int b = 0;
				int c = 1/b;
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.print("Exception thrown: " + e);
			}
			System.out.print("Access element three : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Exception thrown : " + e);
		}
		System.out.print("Out of the block");
		
	}
}

Output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	...