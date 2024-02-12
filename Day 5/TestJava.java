/*
	In Java, each class has a different name and the construstor's name is the same as the class name. THus, we cannot override a constructor as they cannot have the same name.
	Thus, we cannot override  a constructor as they cannot have the same name.
*/

// Java method overrriding using the super keyword.

class Language{
	public void write(){
		System.out.print("Programming languages can use machine learning algorithms.");
	}
}

class JavaProgrammer extends Language{
	public void write(){
		super.write();// Invokes the super class method.
		System.out.print("\n");
		System.out.print("Java Programmer can able to write a code like other programming languages.");
	}
}

public class TestJava{
	public static void main(String args[]){
		Language j = new JavaProgrammer(); // Language reference but Java object.
		j.write(); // runs the method in Java class.
	}
}