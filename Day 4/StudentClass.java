/*
	Constructor overloading means multiple constructors in a class. 
	When you have multiple constructors with different parameters listed, then it will be known as constructor overloading.
*/

class Student {
	String name;
	int age;
	
	// no-args constuctor
	Student(){
		this.name = "Unknown";
		this.age = 0;
	}
	
	//parameterized constructor having one parameter
	Student(String name){
		this.name = name;
		this.age = 0;
	}
	
	// parameterized constructor having both parameters
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void printDetails(){
		System.out.print("\nName : " + this.name);
		System.out.print("\nAge : " + this.age);
	}
}

public class StudentClass{
	public static void main(String args[]){
		Student std1 = new Student(); // Invokes no args constructor.
		Student std2 = new Student("\nJordan");// Invokes parameterized constuctor
		Student std3 = new Student("\nPaxton", 25); //Invokes two parameterized constructor 
		
		//Printing Details
		System.out.print("\n<----> std1 <----> ");
		std1.printDetails();
		
		System.out.print("\n<----> std2 <----> ");
		std2.printDetails();
		
		System.out.print("\n<----> std3 <----> ");
		std3.printDetails();
	}
}