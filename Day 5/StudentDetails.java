/*
	!Aggregation Example 2!
	
*/

class Address{
	int strNum;
	String city;
	String state;
	String country;
	
	Address(int street, String c, String st, String country){
		
		this.strNum = street;
		this.city = c;
		this.state = st;
		this.country = country;
	}
}

class Student{
	int rno;
	String stName;
	
	Address stAddr;
	Student(int roll, String name, Address address){
		this.rno = roll;
		this.stName = name;
		this.stAddr = address;
	}
}

public class StudentDetails{
	public static void main(String args[]){
		
		Address ad = new Address(8356, "Cincinnati","Ohio", "US");
		Student st = new Student(1, "Jonathan", ad);
		System.out.print("Roll no: " + st.rno);
		System.out.print(" " );
		System.out.print("Name: " + st.stName);
		System.out.print(" " );
		System.out.print("Street: " + st.stAddr.strNum);
		System.out.print(" " );
		System.out.print("City: " + st.stAddr.city);
		System.out.print(" " );
		System.out.print("State: " + st.stAddr.state);
		System.out.print(" " );
		System.out.print("Country: " + st.stAddr.country);
		
	}
}

/*
	In a unique sense, this is a type of assocciation. 
	Aggregation is a one way directed relationship that precisely expreesses HAS-A relationship between classes. 
	Additionally, when two classes are aggregated, terminating one of them has no effect on the other. When compared to composition, it is frequently designated as a weak relationship.
	In comparison, the parent owns the chold entity, which means the child entity cannot be accssed directly and cannot exist without the parent object. 
	Contrarily, in an assocciation, the parent and child entities may both exist in their own right.	
*

/*

	These relationships are mainly based on the usage. THis determines whether a certain class HAS-A Certain thing. THis realtionship helps to reduce duplication of code as wel as bugs.
	public class Vehicle{}
	public class Speed{}
	
	public class Van extends Vehicle{
		private Speed sp;
	}

	This shows that class Van HAS-A Speed. By having a separate class for Speed, 
	we do not have to put the entire code that belongs to speed inside the Van class, which makes it possible to reuse the Speed class in multiple applications.
	
	In Object Oriented feature, the users do not need to bother about which object is doing the real work. 
	To achieve this, the Van class hides the implementation details from the users of the Van class. 
	So, basically what happens is the users would ask the Van class to do a certain action and the Van class will either do the work by itself or ask another class to perform the action.
*/