/*
	A contructor with one or more arguments is called a parameterized constructor.
	Mosy often, you will need a constructor that accepts one or more parameters. 
	Parameters are added to a constructor in the same way that they are added to a method, just declare them inside the parenheses after the constructor's name.
*/

public class TwoNumber{
	int num1;
	int num2;
	
	TwoNumber(int a, int b){
		num1 = a; 
		num2 = b;
		
	}
	
	public static void main(String args[]){
		// Creating two objects by passing the values
		// to initialize the attributes..
		// parametrized constructor will invoke
		
		TwoNumber obj_x = new TwoNumber(15, 30);
		TwoNumber obj_y = new TwoNumber(150, 300);
		
		// Printing the objects values
		
		System.out.print("obj_x");
		System.out.print("\nnum_1 : " + obj_x.num1);
		System.out.print("\nnum_2 : " + obj_x.num2);
		
		System.out.print("\nobj_y");
		System.out.print("\nnum1 : " + obj_y.num1);
		System.out.print("\nnum2 : " + obj_y.num2);
	}
}
/*
// Example 2
// A simple constructor.
class MyClass{
	int x;
	
	//Following is the constructor
	MyClass( int i ){
		x = i;
	}
}

public class ConsDemo{
	public static void main (String args[]){
		MyClass t1 = new MyClass( 10 );
		MyClass t2 = new MyClass( 20 );
		System.out.print(t1.x + " " + t2.x);
	}
}
*/