// File name : Salary.java
public class Salary extends Employee{
	private double salary; // Annual salary
	
	public Salary(String name, String address, int number, double salary){
		super(name, address, number);
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.print("Within mailCheck of Salary class ");
		System.out.print("Mailing check to "+ getName()
						+ " with salary " + salary);
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
		return salary / 52;
	}
}