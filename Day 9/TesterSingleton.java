/*
	Singleton pattern is one of the simplest design patterns in Java. Thus type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
*/

/*
	This pattern inbolves a single class which is responsible to create an object while making sure that only signle object gets created.
	This class provides a way to access its only object which can be accessed directly without need to instatiate the object of the class.
	Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class, just like static fields.
	Singletons often control access to resources, such as database connections or sockets.
	Example
	If you have a license for only one connection for your database or your JDBC driver has trouble with multithreading,
	the Singleton makes sure that only one connection is made or that only one thread can access the connection at a time.
*/

/*
	Singleton design pattern saves memory becasue only one object instance is created and it also provides global access to its instance.

*/

/*
	The singleton design pattern is used when you want to create such a class that has only one instance. 
	It is mainly used in multithreading to create multi-threaded and database-related applications.
*/

/*
	Some of the designs where singleton design patter is used:
	
	To create logger classes
	To create configuration managemetn-related classes.
	To create classes realted to database connection pooling
	To create a class for the caching mechanism
*/

// package (name) or creating the getClass() and getName() methods.

class Singleton{
	private static Singleton singleton = new Singleton( );
	
	/* A private Constructor prevents any other
	 * class from instantiating.
	*/
	
	private Singleton(){ }
	
	public static Singleton getInstance( ){
		return singleton;
	}
	
	// Other methods protected by singleton-ness
	protected void demoMethod( ){
		System.out.print("demoMethod for singleton");
	}
	
	public class TesterSingleton{
		public static void main(String args[]){
			Singleton tmp = Singleton.getInstance( );
			tmp.demoMethod( );
		}
	}
	
}

//Output should be demoMethod for singleton.