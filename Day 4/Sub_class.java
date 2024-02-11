/*
	Java Inheritance: 
	The super Keywords is similar to this keyword. Following are the scenarios where the super keyword is used. 
	
	it is used to differentiate the members of superclass from the members of subclass, if they have same names.
	it is used to invoke the superclass constructor from subclass.

*/

/*
	Differntiating the members
	If a class is inheriting the properties of another class. 
	And if the members of the superclass have the names same as the sub class, to differentiate these variables we use super keyword as shown below. 
	super.variable
	super.method();
*/

class Super_class{
	int num = 20;
	
	// display the method of superclass
	public void display(){
		System.out.print("This is the display method of superclass.");
	}
	
}
public class Sub_class extends Super_class{
	int num = 100;
	
	// display method of sub class.
	public void display(){
		System.out.print("\nThis is the display method of subclass.");
	}
	
	public void my_method(){
		// Instantiating subclass.
		Sub_class sub = new Sub_class();
		
		// Invoking the display() method of sub class
		sub.display();
		
		//Invokung the display() method of superclass
		super.display();
		
		// Printing the value of variable num of subclass
		System.out.print("\nValue of the variable named num in sub class : " + sub.num);
		
		// Print the value of variable num of superclass
		System.out.print("\nValue of the variable named num in super class : " + super.num );
	}
	
	public static void main (String args[]){
		Sub_class obj = new Sub_class();
		obj.my_method();
	}
}
