/*
	Anonymous Inner Class as Argument
	
	Generally, if a method accpewts an object of an interface, an abstract class, or a concrete class, then we can implement the interface, extend the abstract class, and pass the object tp the method. 
	If it is a class, then we can directly pass it to the method.
	but in all the three cases, you can pass an anonymous inner class to the method. 
	Syntax
	obj.my_method(new My_Class(){
		public void Do(){
			....
			...
			..
			.
			
		}
	})
*/
interface Message {
	String greet();
}

public class AnonymousInnerClassArgs{
	// method which accepts the object of interface Message
	
	public void displayMessage(Message m){
		System.out.print(m.greet() + 
		" , This is an example of anonymous inner class as an argument");
	}
	
	public static void main(String args[]){
		// instantiating the class
		AnonymousInnerClassArgs obj = new AnonymousInnerClassArgs();
		
			// Passing an anonymous inner class as an argument		
			obj.displayMessage(new Message(){
				public String greet(){
					return "\nHello, Anonymous Inner Class";
			}
		});
	}
}