/* 
	While working under calling process, arguments is to be passed.
	These should be in the same order as their respective parameters in the method specification. 
	Parameters can be passed by value or by reference.
	
	Passing Parameters by Value means calling a method with a parameter. Through this, the argument value is passed to the parameter.
*/

public class swappingExample{
	
	public static void main(String args[]){
		int a = 30;
		int b = 50;
		System.out.print(" Before Swapping, a = " + a + " and b = " + b );
		
		// invoke the swap method
		swapFunction(a, b);
		System.out.print("\n**Now, Before and After swapping values will be same here**: ");
		System.out.print(" After swapping, a = " + a + "b = " + b );
	}
	
	public static void swapFunction ( int a, int b){
		System.out.print(" Before swapping (Inside), a =" + a +" b = " + b );
		
		// Swap n1 with n2
		
		int c = a;
		a = b ;
		b = c ;
		
		System.out.print("After  swapping(Inside), a = " + a + " b = " +  b );
	}
}