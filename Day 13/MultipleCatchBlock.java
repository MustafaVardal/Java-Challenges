// Multiple Catch Blocks in Java

// Multiple catch blocks in Java are used to catch/ handle multiple exceptions that may be thrown from a particular code section. A try block can have multiple catch blocks to handle multiple exceptions.
/*
try {
	// protected code
} catch (ExceptionType1 e1){
	
} catch (ExceptionType2 e2){
	
} catch (ExceptionType3 e3){
	
}

*/

// POINTS TO REMEMBER WHILE USING MULTIPLE CATCH BLOCKS.
/*
	Only one type  of exception can be handled at a time. In protected, only one type of exception will be raised, so it will be handled in relevant catch blocki only.
	Order of catch block is ver important. Order should be from specific exception to generic one. 
	In case of parent exception block comes before the child exception block, compiler will complain and will throw compile time error.
*/

public class ExcepTest{
	public static void main(String args[]){
		try {
			int a [] = new int [2];
			int b = 0;
			int c = 1/b;
			System.out.print("Access element three : " + a[3]);
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.print("Exception thrown : " + e);
		}
		System.out.print("Out of block");
	}
}

//Exception thrown  :java.lang.ArithmeticException: / by zero
//Out of the block