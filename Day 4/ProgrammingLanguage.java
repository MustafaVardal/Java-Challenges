/*
	All other variables which are not instance and class variables are treated as local variables including the parameters in a method.
	Scope of a local variable is within the block in which it is declared and the lifetime of a local variable is until the control leaves the block in which it is declared.
*/

public class ProgrammingLanguage{
	private int languageAge;
	public static String TYPE = "Java";
	
	public void setAge(int age){
		
		// access the instance variable and modify it
		languageAge = age;
	}
	
	public int getAge( ){
		// access the instace variable
		return languageAge;
	}
	
	public static void main(String args[]){
		
		ProgrammingLanguage obj1 = new ProgrammingLanguage();
		obj1.setAge(26);
		System.out.print("Language age: " + obj1.getAge());
		//access the class variable
		System.out.print("\nName of Programming Language: " + ProgrammingLanguage.TYPE );
		
		// LOCAL VARIABLES
		int a = 10;
		int b =20;
		
		int c = a + b;
		
		System.out.print("\nc: " + c);
		
	}
}

/*
By default, a variable has default access. Default access modifier menas we do not explicirtly declare an access modifier for a class, field, method, etc.
A variable or method declared without any access control modifier is avaible to any other class in the same package. 
The fields in an interface are implictly public static final and the methods in an interface are by default public.
Java provides a number of access modifiers to set access levels for classes, variables, methods, and constructors. The four access levels are


default== Visible to the package, No modifiers are needed.
private == Visible to the class only.
public == Visible to the world.
protected == Visible to the package and all subclasses.