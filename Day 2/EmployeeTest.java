import java.io.*;
	public class EmployeeTest{
		public static void main(String args[]){
	
		// Create two objects using constructor
		Employee empOne = new Employee("Dean Josh ");
		Employee empTwo = new Employee("Annie Bear ");
		
		// invoking methods for each object created
		empOne.empAge( 29 );
		empOne.empDesignation(" Senior Software Engineer ");
		empOne.empSalary( 1000 );
		empOne.printEmployee();
		
		empTwo.empAge( 28 );
		empTwo.empDesignation(" Data Analyst ");
		empTwo.empSalary( 500 );;
		empTwo.printEmployee();
	}
}