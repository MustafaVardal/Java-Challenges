/*
	Local variables
	Instance variables
	Class/static variables
*/

/*
	Local variables are declared in methods, constructors, or blocks.
	Local variables are created when the method, constructor or block is entered and the variable will destroyed once it exits the method, constructor, or block.
	Access modifier which are protected, private, public and defaultcan not be used for local variables.
	Local variables are visible only within the declared method, constructor, or block.
	Local variables are implemented at stack level internally.
	There is no default value for local variables, so local variables should be declared and an initial valie should be assigned before the first use.
*/

public class Test{
	public void pupAge(){
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

public static void main (String args[]) {
	Test test = new Test();
	test.pupAge();
	}
}

