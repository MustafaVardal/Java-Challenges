/*
	As per dictionary, abstraction is the quality of dealing with ideas rather than events.
	For example, when you consider the case of e-mail, complex details such as what happens as soon as you send an e-mail, the protocol your e-mail server uses are hidden from the user.
	Therefore, to send an e-mail you just need to type the content, mention the address of the receiver, and click send.
*/

/*
	Abstraction is a process of hiding the implementation details from the user, onlt the functionality will be provided to the user. 
	In other words, the user will have the information on what the object does instead of how it does it.
	In Java Programming, abstraction is achieved using Abstract classes and interfaces.
*/

/*

	Java abstract classes may or may not contain abstract methods, i.e, methods without body( public void get(); )
	But, if a class has at least one abstract method, then the class must be declared abstract.
	If a class is declared abstract, it cannot ve instantiated.
	To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
	If you inherit an abstract class, you have to provide implementations to all the abstract methods in it. 
	
*/

/* File name : Employee.java */

public abstract class Employee{
	
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
	
	public void setAdress(String newAddress){
		address = newAddress;
	}
	
	public int getNumber(){
		return number;
	}
}