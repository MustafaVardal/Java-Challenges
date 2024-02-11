/*
	The variable's scope refers to the region where they are created and accessed in a given program or function. the variable scope also refers to its lifetime.
	
*/

/*
	A variable which is declared inside a class and outside all the methods and blocks is an instance variable.
	The general scope of an instance variable is throughtout the class except in static methods.
	The lifetime of an instance variable is until the object stays in memory.
*/

public class MobilePhone{
	private int phoneYear;
	
	public void setYear( int year){
		
		// access the instance variable and modify it.
		phoneYear = year;
		
	}
	
	public int getYear(){
		
		// access the instance variable
		return phoneYear;
	}
	
	public static void main (String args[]){
		MobilePhone myPhone = new MobilePhone();
		myPhone.setYear( 2 );
		System.out.print("My phone is little bit old. It is almost " + myPhone.getYear() + " years old.");
	}
}