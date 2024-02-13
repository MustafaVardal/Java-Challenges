
	//  File name :  AbstractDemo1.java
	
	public class AbstractDemo1{
		public static void main(String args[]){
			
			Salary s = new Salary ("Darling Derrick\t", "Chicago , IL\t", 3 , 23456.8);
			System.out.print("salary : " + s.computePay());
			
		}
		
	}
	
	abstract class Employee{
		private String name ;
		private String address;
		private int number;
		
		public Employee(String name, String address, int number){
			System.out.print("\nConstructing an Employee : ");
			this.name = name;
			this.address =address;
			this.number =number;
		}
		
		public abstract double computePay();
		// Remainder of class definition
		
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getAddress(){
			return address;
		}
		public void setAddress(String address){
			this.address = address;
		}
		
		public int getNumber(){
			return number;
		}
		public void setNumber(int number){
			this.number =number;
		}
	}
		class Salary extends Employee{
			private double salary; // annual salary
			
			public Salary(String name , String address, int number, double salary){
				super(name, address, number);
				this.salary = salary;
			}
			
			public double computePay(){
				System.out.print("\nComputing salary pay for " + getName());
				return salary /52;
			}
			
			//Remainder Of class Definition
		}