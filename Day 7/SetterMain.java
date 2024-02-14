// Java encapsulation writen-only class

// write only class can have only setter methods to set the values of the attributes, there should not be any getter method.

class Person{
	
	private String name;
	private int age;
	
	// Setter 
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public void setAge(int age){
		
		this.age = age; 
	}
	

}

public class SetterMain{
	
	public static void main(String args[]){
		
		//Obj to person class
		Person p = new Person();
		
		
		// Setting the values
		p.setName("Julia");
		p.setAge(24);
	}
}