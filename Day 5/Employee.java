/*
	How the behavior of overridden methods in Java allows you to take advantage pf polymophism whenn designing your classes.
	We already have discussed method overridin, where a chile class can override a method in its parent. 
	An overridden method is essentially hidden in the parent class, and is not invoked unless the chile class uses the super keyword within the overriding method.
*/

public class Employee{
	private String name ;
	private String address ;
	private int number ;
	
	public Employee (String name, String address, int number) {
		System.out.print("Constructing an Employee");
		this.name = name ;
		this.address = address;
		this.number = number;
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
	public void setAddress(String newAddress){
		address = newAddress;
	}
	
	public int getNumber(){
		return number;
	}
	
	
}