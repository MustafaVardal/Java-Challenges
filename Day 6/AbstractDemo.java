// File name : AbstractDemo.java

public class AbstractDemo{
	
	public static void main(String args[]){
		// Following is not allowed and would raise error.
		
		Employee e = new Employee("Steve Jobs", "San Diego, California", 20);
		System.out.print("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}
}

abstract class Employee{
	
	private String name;
	private String address;
	private int number;
	

	public Employee(String name, String address, int number) {
		System.out.print("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay(){
		System.out.print("Inside Employee computePay");
		return 0.0;
	}
	
	public void mailCheck(){
		System.out.print("Mailing a check to " + this.name + " " + this.address);
	}
	
	public String toString(){
		return name + " " + address + " " + number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	// If employee's address update, we need to change the addres value with this method it allows the change automatically.
	public void setAddress(String newAddress){
		address =newAddress;
	}
	
	public int getNumber(){
		return number;
	}
	
	/// get an error. Employee is abstract; cannot be instantiated. 
	//This means there is no way to declare a new object directly. 
	///  Like this : Employee e = new Employee();
}
	