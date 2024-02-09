public class Puppy{
	int puppyAge;
	
	public Puppy(String name){
		// This constructor has a parameter, <i>name<i>
		System.out.print("Name chosen is: " + name);
	}
	public void setAge( int age ){
		puppyAge = age;
	}
	
	public int getAge( ){
		System.out.print(" Puppy's age is: " + puppyAge );
		return puppyAge;
}

public static void main(String args[]){
		// Object creation
		Puppy myPuppy = new Puppy( "tommy" );
		
		// Call class method to set puppy's age
		myPuppy.setAge( 2 );
		
		// Call another class method to get puppy's Age;
		myPuppy.getAge();
		
		// You can access variables as follows as well
		
		System.out.print(" Variable Value: " + myPuppy.puppyAge);
	
	}	
}

/* 
	There can be only one public class per source file.
	A source file can have multiple non-public classes.
	The public class name should be the name of the source file as well which should be appended by .java at the end.
		Example = The class name is public class Employee{} then the source file should be as Employee.java
	If the class is defined inside a package, then the packlage statement should be the first statement in the source file.
	If import statemnets are present, then they must be written between the package statement and the class declaration.
	If there are no package statements, then the import statement should be the first line in the source file.
	Import and package statements will imply to all the classes present in the source file. 
	It is not possible to declare different import and/or package statements to different classes in the source file.
	
	*/