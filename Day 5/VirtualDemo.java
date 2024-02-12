// File name : VirtualDemo.java
public class VirtualDemo{
	
	public static void main(String args []){
		Salary s = new Salary("Oliver Deschamp", "Dallas, TX", 1, 4000.0);
		Employee  e = new Salary("Maria Johns", "Miami, Florida", 2, 3600.0);
		System.out.print("Call mailCheck using Salary reference -- ");
		s.mailCheck();
		System.out.print("\nCall mailCheck using Employee reference --");
		e.mailCheck();
	}
}

class Employee{
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number){
		System.out.print("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number =number;
	}
	public void mailCheck(){
		System.out.print("Mailing a check to " + this.name + " " + this.address);
	}
	
	public String toString(){
		return name + " " + address + " " + number;
	} 
	
	public String getName(){
		return name ;
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
class Salary extends Employee{
	private double salary; // annual salary
	public Salary(String name, String address, int number, double salary){
		super(name, address, number);
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.print("Within mailCheck of Salary class ");
		System.out.print("Mailing check to " + getName() 
							+ " with salary " + salary );
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if (newSalary >= 0.0){
			salary = newSalary;
		}
	}
	
	public double computePay(){
		System.out.print("Computing salary pay for " + getName());
		return salary/52;
	}
}

/*
	Here, we instantiate two Salary objects. One using a Salary reference s, and the other using an Employee reference e.
	
	While invoking s.mailCheck(), the compiler sees mailCheck() in the Salary class at compile time, and the JVM invokes mailCheck() in the Salary class at run time.
	
	mailCheck() on e is qite differnt becuase e is an EMployee reference. WHen the compiler sees e.mailCheck(), the compiler sees the mailCheck() method in the Employee class.
	
	Here, at compile time, compile used mailCheck() in eMployee to validate this statement. At the run time, however, the JVM invokes mailCheck() in the Salary class.
	
	This behavior is reffered to as virtual method invocation, and these methods are reffered to as virtual methods.
	An overridden method is invoked at run time, no matter what data type the reference is that was used in the source code at compile time.
 */
	
