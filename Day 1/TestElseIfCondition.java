/*
	An if can have zero or one else's and it must come after any else if's.
	An if can have zero to many else if's and they must come before the else.
	Once an else if succeeds, none of the remaining else if's or else's will be tested.
*/

/*public class TestElseIfCondition{
	public static void main(String args[]){
		
		int x = 30;
		
		if (x == 10) { System.out.println("X is : " + x); }
		else if (x == 20) { System.out.println("X is : " + x); }
		else if (x == 30) { System.out.println("X is :" + x); }
		else{ System.out.println("X is random value: " + x ); }
	}
}
*/

//EXAMPLE 2

public class TestElseIfCondition{
	public static void main(String args[]){
		
		double x = 30.0;
		
		if (x == 10.0){ System.out.println(" " + x); }
		else if (x == 20.0) { System.out.println(" " + x); }
		else if (x == 30.0) { System.out.println(" " + x); }
		else { System.out.println(" " + x); }
		
	}
}