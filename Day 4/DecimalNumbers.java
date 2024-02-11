/*
	As the name specifies, the No-argument constructor does not accept any argument. 
	By using the No-args constructor you can initialize the class data members and perform various activities that you want on object creating.
*/

public class DecimalNumbers{
	double num1;
	double num2;
	
	// Creating no-args constructor
	DecimalNumbers(){
		num1 = 1.3;
		num2 = 2.6;
		
	}
	public static void main(String args[]){
		// no-args constructor will invoke
		DecimalNumbers obj1 = new DecimalNumbers();
		
		
		// Printing the values
		System.out.print("num1 : " + obj1.num1 );
		System.out.print("\nnum2 : " + obj1.num2 );
	}
}