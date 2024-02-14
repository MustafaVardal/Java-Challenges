
 //  Java encapsulation read-only class
 
 // A read only class ca have only getter methods to get the values attributes there shoul not be any setter method.
 
 class Person {
	 
	private String name = "Julia";
	private int age = 25;
	
	
	//Getter
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
 }
 
 public class GetterMain{
	 public static void main(String args[]){
		 //Object to person class
		 Person p = new Person();
		 
		 // Getting and printing the values
		 
		 System.out.print("Name of the person is : " + p.getName());
		 System.out.print("\n");
		 System.out.print("Age of the person is : " + p.getAge());
	 }
 }