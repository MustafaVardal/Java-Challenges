/*
	The access modifiers in Java are usedn to specify the scope of the variable, data members, methods, classes, or consturctors.
	These help to restrict and secire the access (or, level of access) of the data.
	There are four level of access:
	Visible to package, the default. No modifiers are needed. 
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected).
*/

/*

	There are four different types of access modifiers in Java, we have listed them as follows;
	Default (no keywords required)
	Private
	Protected
	Public
*/

/*
Default Access Modifier menas we do not explicitly declare and access modifier for a class, field, method, etc.

A variable or method declared without any access control modifier is avaible to any other in the same package.
The fields in an interface are implicitly public static final and the methods in an interface are tby default public. 

	String version = "1.5.1";
	boolean processOrder(){
		return true;
	}

*/

/*
	Private Access Modifier=== 
	Methods, variables, and consturctors that are declared private can only be accessed within the declared class itself.
	Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
	Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.
	Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.
	
	public class Logger{
		private String format;
		
		public String getFormat(){
			return this.format;
		}
		
		public void setFormat(String format){
			this.format = format;
		}
	}
	Here, the format variable of the Logger class is private, so there's no way for other classes to retrieve or set its value directly.
	So, to make this variable avaible to the outside world, we defined two public methods:
	getFormat(), which  returns the value of format, and setFormat(String), which sets its value.
*/
/*
class Logger{
	private String format;
	
	private String getFormat(){
		return this.format;
	
	}
	
	private void setFormat(String format){
		this.format = format;
	}
}
public class LoginA{
	public static void main(String args[]){
		// Creating an object
		Logger log = new Logger();
		
		// Setting the value
		log.setFormat("Text");
		
		//Getting the value
		System.out.print(log.getFormat());
	}
	
}
*/

// We will get errors just because of private modifier.
/////////////////////////////////////////////////////
/*
	Protected Access Modifier ====
	Variables, methods, and consturctors, which are declared protected in a superclass can be accessed only by the sub classes in other package or class within the package of the protected members' class.
	The protected access modifier cannot be applied to class and interfaces.
	Methods, fields can be declared protected, however methods and fields in a interface cannot be declared protected.
	Protected access gives the subclass a chance to use the helper method or variabel, while preventing a nonrealted class from trying to us it. 
*/



/*
class AudioPlayer{
	protected boolean openSpeaker(Speaker sp){
		// implementation details
	}
}

class StreamingAudioPlayer extends AudioPlayer{
	boolean openSpeaker(Speaker sp){
		// implementation details.
	}
}
*/

/*
Here, if we define openSpeaker() method as private, then it would not be accessible from any other class other than AudioPlayer.
If we define it as public, then it would become accessible to all the outside world.
But our intention is to expose this method to its subclass only, that's why we have used protected modifier.
*/

//Class ONE
class One{
	protected void printOne(){
		System.out.print("printOne method of One class.");
	}
}

// Inheriting class One on ProtectedMain

	public class ProtectedMain extends One{
		public static void main(String args[]){
		// Creating an object of Main class.
		ProtectedMain obj = new ProtectedMain();
		
		//Calling printOne() method of class One.
		// through the object of Main class.
		obj.printOne();
	}
}