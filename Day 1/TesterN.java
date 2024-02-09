/*
	Narrowing type casting (expilict type casting or explicit type conversion which is drectly changes the data type with programmer manually, In narrowing type casting a larger type can be converted into a smaller type.
	LIKE, double to int or int to double. 
		Syntax =
			double doubleNumber = (double) numberInteger;
*/
public class TesterN{
	// Main driver method
	public static void main(String args[]){
		
		// define int initial variable
		int num = 2024;
		
		// type casting int to double
		
		double doubleNum = (double) num;
		
		System.out.println("The vale of " + num + " after converting to the double is " + doubleNum);
		
		
		//type casting double to int
		int covertedInt = (int) doubleNum;
		System.out.println("The value of  " + doubleNum + " after converting to the int again is " + covertedInt);
	}
}