/*
	Widening Type casting (implicit type casting) programin belirledigi degisken sirasina gore otomatik olarak yapilir.
	Bu siralama da byte e dizayn edilmistir.
*/
// byte > short > char > int> long > float > double

/*
public class TesterW{
	// Main driver method
	public static void main(String args[]){
		// Define injt variables
		int num1 = 5004;
		double num2 = 3.5;
		int sum = num1 + num2;
		System.out.println("With these two variables total is: " + num1 + " " + num2 +" = " + sum);
	}
}
*/



// Data hatali olur. Cunku deger kaybina ugrar ve compiler calistirmaz.


/// Bunun Yerine soyle kod yigini elde edelim.

public class TesterW{
	// Main driver method
	public static void main(String args[]){
		// Define injt variables
		int num1 = 5004;
		double num2 = 3.5;
		double sum = num1 + num2;
		System.out.println("With these two variables total is: " + num1 + " + " + num2 +" = " + sum);
	}
}
