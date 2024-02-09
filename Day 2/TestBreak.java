
/*
public class TestBreak{
	public static void main(String args[]){
		int x = 10;
		
		while ( x < 20 ){
			if ( x == 15 ){
				break;
			}
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}
}
*/


/*
public class TestBreak{
	public static void main (String args[]){
		int [] numbers = {10, 20, 30, 40, 50};
		
		for (int index = 0; index < numbers.length; index++){
			if ( numbers[index] == 30){
				break;
			}
			System.out.print(" value of item : " +  numbers[index]);
			System.out.print("\n");
		}
	}
}
*/

public class TestBreak{
	public static void main(String args[]){
		int x = 10;
		
		while ( true ){
			System.out.print(" value of x : " + x);
			x++;
			if (x == 15){
				break;
			}
			System.out.print("\n");
		}
	}
}