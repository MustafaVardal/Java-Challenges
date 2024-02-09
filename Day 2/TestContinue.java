/*

public class TestContinue{
	public static void main(String args[]){
		
		int x = 10;
		
		while ( x < 20 ){
			x++;
			if  ( x == 15){
				continue;
			}
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}
	}
}
*/
/*
public class TestContinue{
	public static void main (String args[]){
		int [] numbers = {10, 20, 30, 40, 50};
		
		for ( int index = 0; index < numbers.length; index++){
			if ( numbers[index] == 30){
				continue;
			}
			System.out.print("value of item : " + numbers[index] );
			System.out.print("\n");
		}
	}
}

*/
public class TestContinue{
	public static void main(String args[]){
		int x = 10;
		
		do{
			x++;
			if (x == 15){
				continue;
			}
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}while ( x < 20 );
	}
}