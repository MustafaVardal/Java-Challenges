public class TesterCallInstance{
	// Instance variable num
	int num = 10;
	
	TesterCallInstance(){
		System.out.print("This is an example program on keyword this");
	}
	
	TesterCallInstance(int num){
		// Invoking the default constructor
		this();
		
		// Assigning the local variable num to the instance variable num
		this.num = num;
	}
	public void greet(){
		System.out.print("Hi Welcome to Java Challenges! ");
	}
	
	public void print(){
		
		// Local variable num
		int num = 20;
		
		// Printing the loval variable
		System.out.print(" value of local variable num is : " + num);
		
		// Printing the instance variable
		System.out.print(" value of instance variable num is: "+ this.num);
		
		// Invoking the greet method of a class
		this.greet();
	}
	
	public static void main(String args []){
		
		//Instantiating the class
		TesterCallInstance obj1 = new TesterCallInstance();
		
		//Invoking(Call) the print method
		obj1.print();
		
		// Passing a new value to the num variable through parametrized constructor
		TesterCallInstance obj2 = new TesterCallInstance (30);
		
		// Invokung the print method again
		obj2.print();
	}
}