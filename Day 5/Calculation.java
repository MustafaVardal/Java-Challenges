/*
	Compile time polymorphism
	Run time polymorphism
	
	Compile-time polymorphism is also knwon as static polymorphism and it is implemented by method overloading.
	
*/
// Java Example: Compile Time Polymophism
public class Calculation{
	
	// method to add two integers
	public int addition (int x, int y){
		return x + y; 
	}
	
	//method to add three integers
	public int addition(int x, int y, int z){
		return x + y + z;
	}
	
	// method to add two doubles
	public double addition(double x, double y){
		return x + y;
	}
	
	// Main method
	public static void main(String args[]){
		
			// Creating an object of the Main method
			
			Calculation number = new Calculation();
			
			// calling the overloaded methods
			int res1 = number.addition(444, 555);
			System.out.print("Addition of two integers: " + res1);
			
			int res2 = number.addition(333, 444, 555);
			System.out.print("\nAddition of three integers: " + res2);
			
			double res3 = number.addition(10.15, 20.22);
			System.out.print("\nAddition of two doubles: " + res3);
		
	}
	
}