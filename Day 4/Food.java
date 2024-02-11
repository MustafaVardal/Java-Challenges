/*
	A variable which is declared inside a class, outside all the blocks and is marked static is known as a class variable.
	The general scope of a class variable is throughtout the class and the life of a class variable is until the end of the program or as long as the class is loaded in memory.
*/

public class Food{
	
	private double foodPrice;
	
	public static String TYPE ="Turkish Food";
	
	public void setPrice(double price){
		// access the instance variable and modify it.
		foodPrice = price;
	}
	public double getPrice( ){
		
		// access the instance variable.
		return foodPrice;
	}
	public static void main(String args[]){
		Food lahmacun = new Food();
		lahmacun.setPrice( 4.5 );
		System.out.print("Lahmacun price : $" + lahmacun.getPrice() );
		// access the class variable.
		System.out.print("\n" + "This is a type of "+ Food.TYPE + ".");
	}
}