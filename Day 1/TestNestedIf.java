/*
	The nested if else statement is used for better decision-making when other conditions are to be checked when a given condition is true.
	In the nested if else statement, you can have an if-else statement block the another if(or,else) block. 
	
*/

public class TestNestedIf{
	public static void main(String args[]){
		
		int x = 10, y = 20, z =30;
		
		if ( x >= y ){
			if ( x >=z )
			{System.out.println(x + " is largest");}
			else
			{System.out.println(z + " is largest one");}
		}else{
			if(y >=z )
			{System.out.println(y + " is largest one");}
			else
			{System.out.println(z + " is largest one");}
		}
	}
}
