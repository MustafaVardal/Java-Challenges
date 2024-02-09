
public class MyFirstJavaProgram{
    /*This site of code block is using for what you want to use in the class variable. We can add some variable inside of the class and use for future projects.*/
    public static void main(String [] args){
            System.out.println("Hello This is my first code in here.");
    }
}
/*
public= means the scope of the main method. Being public , this method can be called by external program like JVM
static= Means the state of the main method. Being static, this method can be called by external program like JVM without first creating the object of the class.
void = Defines the return type of the main method. Being void, this method is RETURNING any value.
main = name of the method, and each project need at least one main class inside of the code block.
String [] args = arguments passed on command line while executing the java command.
*/


/*
	Object = Object have states and behaviors.
		Example = A dog has states which are color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.
	Class = A class can be defined as a template/bluepront that describes the behavior/state that the object of its tyoe supports.
	Methods = A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
	Instance Variables = Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables. 
	*/


/*
	Case Sensitivity = Java is case sensitive, which menas identifier Hello and hello would have different meaning in java
	Class Name = For all class names the first letter should be in Upper Case. If several words are used to form a name of the class,
		each inner word's first letter should be in Upper Case.
			Example = class MyFirstJavaClass
	Method Names = All method names should start with a Lower Case letter. If the several words are used to form the name of the method, 
		then each inner word's first letter should be in Upper Case.
			Example = public void myMethodName()
	Program File Name = Name of  the program file should exactly match the class name. When saving the file,
		you should save it using the class name (Remember Java is case sensitive) and append '.java' to end of the name (if the file name and the class name do not match, your program will not compile).
		But please make a note that in case you do not have a public class present in the file then file name can be different than class name. 
		It is also not mandotory to have a public class in the file.
			Example = Assume 'MyFirstJavaProgram' is the class name. Then the file should be saved as 'MyFirstJavaProgram.java'
	public static void main(String args[]) = Java program processing starts from the main() method which is a mandotory part of every Java program.		
*/

/*
	All identifiers should begin with a letter (A to Z or a to z), currenct character ($) or an underscore(_)
	After the first character, identifiers can have any combination of characters.
	A key word cannot be used as an identifier.
	Most importnatly, identifiers are case sensitive.
		Example of legal identifiers: age, $salary, _value, __1_value.
		Example of illegal identifiers: 123abc, -salary 
*/
/*
	Access Modifiers = defualt, public, protected, private, and more...
	Non-access Modifiers = final, abstract, strictfp, constant, and more...
*/
/*
	Local Variables
	Class variables (Static Variables)
	Instance Variables(Non-static Variables)
*/

/*
	Arrays are objects that store multiple variables of the same type. However, an array itself is an object on the heap.
*/

