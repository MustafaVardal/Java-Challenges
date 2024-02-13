// Inheriting the java abstract class

// We can inherit the properties of Employee class jist like concrete class in the following way.

/// File name : Salary.java

public class Salary extends Employee{
	private double salary; // annual salary
	
	public Salary(String name, String address, int number, double salary){
		super (name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck(){
		System.out.print("Within mailCheck of Salary class ");
		System.out.print("\nMailing check to " + getName())
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary( double newSalary){
		if ( newSalary >= 0.0 ){
			salary = newSalary;
		}
	}
	
	public double computePay(){
		System.out.print("Computing salary pay for " + getName());
		return salary/52;
	}
}

//Java Abstract Methods

// If you want a class to contain a particular method but you want the actual implementation of that method to be determined by child classe, you can declare the method in the parent class as an abstract.
/*
	/// abstract keyword is used to declare the method as abstract.
	/// an abstract method contains a method signature, but no method boy.
	/// instead of curly braces, an abstract method will have a semi colon (;) at the end.
*/
/*
	public abstract Employee {
		private String name;
		private String address;
		private int number;
		
		public abstract double computePay();
		// Remainder of class defination
	}
	
	Declaring a method as abstract has two consequences - 
	
	The class containing it must be declared as abstract.
	Any class inheriting the current class must either override the abstract method or declare itself as abstract.

*/

// Eventually, a desecdant class has to implement the abstract mehtod; otherwise you would have a hierachy of abstract classes that cannot be instantiated.


/*
	// File name = Salary .java
	public class Salary extends Employee{
		private double salary; // annual salary
		public double computePay(){
			System.out.print("Computing salary per for " + getName());
			return salary / 52;
			
		}
		
		// Remainder of class defination
	}

*/


