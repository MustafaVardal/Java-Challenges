/*
	Full encapsulation Example 2 
*/

class Employee {
	private String emp_name;
	private String emp_id;
	private double net_salary;
	
	// Constructor
	public Employee(String emp_name, String emp_id, double net_salary){
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.net_salary = net_salary;
	}
	
	//Getter methods
	public String getEmpName(){
		return emp_name;
	}
	
	public String getEmpId(){
		return emp_id;
	}
	
	public double getNetSalary(){
		return net_salary;
	}
	
	// Setter methods
	public void setEmpName(String emp_name){
		this.emp_name = emp_name;
	}
	
	public void setEmpId(String emp_id){
		this.emp_id = emp_id;
	}
	
	public void setNetSalary(double net_salary){
		this.net_salary = net_salary;
	}
	
}

// Job class to test encapsulated class employee

public class Job{
	
	public static void main(String args[]){
		
		// object to employee class
		// first object - setting values using constructor.
		Employee emp  = new Employee("Ahmet", "EMP001", 102000.24);
		
		// Printing valuetter methods.
		System.out.print( emp.getEmpId() + " ,  " + emp.getEmpName() + " , " + emp.getNetSalary() + " ");
		System.out.print("\n");
		
		// Updating values using setter methods.
		emp.setEmpName("Balthazar");
		emp.setEmpId("EMP002");
		emp.setNetSalary(103000.04);
		
		// Printing data
		System.out.print("Employee (Updated Values): ");
		System.out.print("\n");
		System.out.print( emp.getEmpId() + " ,  " + emp.getEmpName() + " , " + emp.getNetSalary() + " ");
	}
}