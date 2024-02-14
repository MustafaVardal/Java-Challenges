/*
	Encapsulation is one of the fous fundamental OOP concept. The other three are inheritance, polymorphism, and abstraction.
	Encapsulationin Java is a mechanism of wrapping data(variables) and code acting on the data ( methods ) together as a single unit.
	In encapsulation, variables of a class will hidden from other classes, and can be accessed only through the methods of their current class.
	Therefore, it is also known as data hiding.
*/

/*
	Declare the variables of a class as private.
	Provide public setter and getter methods to modify and view the variables values.
	
	
*/
/*
public class EncapTest{
	private String name;
	private String idNum;
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getIdNum(){
		return idNum;
	}
	
	public void setAge( int newAge){
		age = newAge;
	}
	
	public void setName (String newName){
		name = newName;
	}
	
	public void setIdNum( String newIdNum){
		idNum = newIdNum;
	}
}
*/
// The public setXXXX() and getXXXZ() methods are the access points of the instance variables of the EncapTest class. 
// Normally, these methods are reffered as getters and setter. Therefore, any class that wants to access the variables should access them through these getters and setters.
// The cariables of the EncapTest class can be accessed usign the following program

// File name = RunEncap.java

public class RunEncap{
	
	public static void main(String args[]){
		
		EncapTest encap = new EncapTest();
		encap.setName("Dean");
		encap.setAge(24);
		encap.setIdNum("AB123");
		
		System.out.print("Name : " + encap.getName() +
						"\nAge : " + encap.getAge() + 
						"\nId Number : " + encap.getIdNum());
						
	}
}

class EncapTest{
	
	private String name;
	private String idNum;
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public String getIdNum(){
		return idNum;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge( int newAge){
		age = newAge;
		
	}
	
	public void setIdNum( String newIdNum){
		idNum = newIdNum;
	}
	
	public void setName(String newName){
		name = newName;
	}
}

// The field of a class can be made read-only or write-only.
// A class can have total control over what is stored in its fields.
