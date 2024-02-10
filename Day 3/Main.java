/*
	Java class attributes are the variables that are bound in a class i.e., the variables which are used to define a class are class attributes.
	A class attributes defines the state of the class during program execution. A class attribute is accessible within class methods by default.
		Example= There is a class"Student" with some data members(variables) like roll_no, age, and name. These data members are considered class attributes.
*/

/*
	To create (declare) a class attribute, use the acces modifier followed by the data type and attribute name. It's similar to declaring a variable.
	
	access_modifier type attribute_name;
*/
/*
public class Cat{
	String breed;
	int age;
	String color;
	
	void meow(){
		
	}
	
	void hungry(){
		
	}
	
	void sleeping(){
		
	}
}


/*
	To access the class attribute, you need to create an object first and then use dot (.) operatir with the object name. 
	Class attributes can be also called within the class methods directly.
	
	object_name.attribute_name;
*/
/*
class Car{
	// Declaring and initializin the attributes
	String model = "Tesla";
	int year = 2023;
	String color = "Black";
}

public class Main{
	public static void main(String args[]){
		
		// Creating an object of the class Car
		Car obj = new Car();
		
		// Accesing class attributes  & printing the values
		System.out.print(obj.model + "\n");
		System.out.print(obj.year + "\n");
		System.out.print(obj.color + "\n");
	}
}

/*
	To modify a class attribute, access the attribute and sign a new value using the assignment (=) operator
	object_name.attribute_name = new_value;
*/
/*
class Car{
	String model = "Tesla";
	int year = 2023;
	String color = "Black";
	
}

public class Main{
	public static void main(String[] args){
		
		// Creating an object of the class Car
		Car obj = new Car();
		
		
		// Accesing class attributes & printing the values
		System.out.print("Previous modifying: "+ "\n");
		System.out.print(obj.model + "\n");
		System.out.print(obj.year + "\n");
		System.out.print(obj.color + "\n");
		
		
		// Modifiyinh class attributes
		obj.model = "Hummer EV";
		obj.year = 2023;
		obj.color = "White";
		
		//Printing
		System.out.print("\n" + "After modifying: "+ "\n");
		System.out.print(obj.model + "\n");
		System.out.print(obj.year + "\n");
		System.out.print(obj.color + "\n");
			
	}
}
*/
// The name attribute is set to read-only using the final keyword. If we try to modify this attribute, we will get an error.

class Car{
	final String model = "Tesla";
} 
public class Main{
	public static void main(String args[]){
		Car car = new Car();
		car.model = "Hummer";
		System.out.print(car.model);
	}
}