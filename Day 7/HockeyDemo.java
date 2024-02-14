/*
	When  overriding methods defined in interfaces, there are several rules to be followed -
	
	checked exceptions should not be declared on implemeantion methods other tahn the ones declared by the interface method or subclasses of those declared by the interface method. 
	the signature of the interface method and the same return type or subtype should be maintained when overridding the methods.
	an implementaion class itself can be abgstract and if so, interface methods need not be implemented.
	
*/

/**
	Rules for implemetnin Java interfaces
	
	A class can implement more than one interface at a time.
	A class can extend only one class, but implement many interfaces.
	An interface can extend another interface, in a similar way as a class scan extend another class.
	

**/

/**
		Extending Java interfaces
		An interface can extend another interface in the same way that a class can extend another class. The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface.
		
**/
 interface Sports{
	 public void setHomeTeam( String name);
	 public void setVisitingTeam( String name);
 }
 
 interface Football extends Sports{
	 public void homeTeamScored( int points );
	 public void visitingTeamScored( int points );
	 public void endOfQuarter( int quarter  );
 }
 
 interface Hockey extends Sports{
	 public void homeGoalScored();
	 public void visitingGoalScored();
	 public void endOfPeriod( int period );
	 public void overTimePeriod( int ot);
 }
 
 public class HockeyDemo implements Hockey {
	 
	 public void setHomeTeam(String name){
		 System.out.print("Home team: " + name);
	 }
	 
	 public void setVisitingTeam(String name){}
	 
	 public void homeGoalScored(){}
	 
	 public void visitingGoalScored(){}
	 
	 public void endOfPeriod(int period){}
	 
	 public void overTimePeriod(int ot){}
	 
	 
	 public static void main(String args[]){
		 Hockey hockey_demo = new HockeyDemo();
		 hockey_demo.setHomeTeam("Kansas City");
	 }
 }
 
// 	Tagging Java Interfaces
/*
	the most common use of extending interfaces occurs when the parent interface does not contain any methods. 
	Forexample ,
	The MouseListener interface in the java.awt.event package extended java.util.EventListener, which is defined as-
	
	package java.util;
	public interface EventListener{}
	
	An interface with no methods in it is referred to as a tagging interface. There are two basic design purposes of tagging interfaces
	
	Creates a common parent - 
	As with EventListener interface, which is extended by dozens of other interfaces in Java API, 
	you can use a tagging interface to create a common parent among a group of interfaces.
	Example=
	when an interface extends EventListener, the JVM knows that this particular interface is gointo be used in an event delegation scenario.
	
	Adds a data type to a class
	This situation is where the term, tagging comes from. A class that implements a tagging interface does not need to define any methods(since the interface does not have any)
	but the class becomes an interface type through polymorphism.
	
	
*/