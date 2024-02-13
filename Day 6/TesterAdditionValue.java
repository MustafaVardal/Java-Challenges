/*
	When a class has two or more methods by the same name but different parameters, at the time of calling based on the parameters passed respective method is called 
	(or respective method body will be bonded with the calling line dynamically). 
	This mechanism is known as method overloading.
*/


/*
	Advange of method overloading =
	Method overloading improves the code readiblity and reduced code redundancy. Method overloading also helps t achieve compile-time polymorphism
*/
/*
class Calculator{
	
	public static int add(int a, int b){
		
		return a + b ;
		
	}
	public static int add(int a, int b, int c){
		
		return a + b + c;
	}
}
*/
 /*
	When you invoke the add() method based on the parameters you pass respective method body gets executed.

	int result = Calculator.add(1,2); // returns 3
	result = Calculator.add(1,2,3);  // returns 6
*/


/*
	Different ways of java method overloading 
	
	Method overlaoding can be achieved using following ways while having same name methods in a class.
	
	Use different number of arguments.
	Use different type of arguments.
*/

// You can implement method overloading based on the different number of arguments.


/*

class Calculator {
	public static int add( int a, int b){
		
		return a + b;
		
	}
	
	public static int add(int a, int b, int c){
		
		return a + b + c;
		
	}
}

public class TesterAdditionValue{
	public static void main(String args[]){
		
		System.out.print(Calculator.add(20, 40));
		System.out.print("\n");
		System.out.print(Calculator.add(40, 50, 60));
	}
}
*/

// Different number of arguments (non-static methods.)
/*
class Calculator{
	public int add(int a, int b){
		
		return a + b ;
	
	}
	
	public int add( int a, int b, int c){
		
		return a + b + c;
		
	}
	
}

public class TesterAdditionValue{
	
	public static void main(String args[]){
		
		Calculator calculator = new Calculator();
		
		System.out.print(calculator.add(30, 50));
		System.out.print("\n");
		System.out.print(calculator.add(40, 50, 70));
	}
}
*/

// Method overloading different type of arguments

/*
class Calculator{
	public int add(int a , int b){
		return a +b;
	}
	public double add(double a, double b ,double c){
		return a + b + c;
	}
	
}

public class TesterAdditionValue{
	
	public static void main(String args[]){
		Calculator calculator = new Calculator();
		System.out.print(calculator.add(4, 5)) ; 
		System.out.print("\n");
		System.out.print(calculator.add(4.5, 5.6, 6.7));
	}
}
*/

// Example more and more ! 

class Calculator{
	public static int add(int a, int b){
		
		return a * b; 
	}
	
	public static int add(int a, int b, int c){
		
		return a * b * c;
	}
}
class Average{	
	public int add(int a, int b, int c){
		
		return (a / b)*c;
	}
	
	public double add(double a, double b, double c){
		
		return (a*b*c) / (a+b+c);
		
	}
	
}

public class TesterAdditionValue{
	public static void main(String args []){
		
		Average obj = new Average();
		
		System.out.print("Static argument: " + Calculator.add(2, 3));
		System.out.print("\n");
		System.out.print("More than 2 Static arguments: " + Calculator.add(2,3,4));
		System.out.print("\n");
		System.out.print("Non static arguments: " + obj.add(4,5,6));
		System.out.print("\n");
		System.out.print("Non static diffent type of arguments" + obj.add(4.6,5.7,6.4));
		
		
	}
}