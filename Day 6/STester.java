// Instance Initializer Block and super Constructor.

class SuperTester{
	SuperTester(){
		System.out.print("Inside super constructor");
	}
}

public class STester extends SuperTester{
	int a;
	{
		System.out.print("Inside instance initializer block\n");
		a = 10;
	}
	STester(){
		System.out.print("Inside instance initializer block\n");
		
	}
	public static void main(String args[]){
		STester obj = new STester();
		System.out.print("Value of a : " + obj.a);		
	}
}