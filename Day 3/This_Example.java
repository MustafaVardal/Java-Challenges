public class This_Example{
	//Instance variable num
	int num = 10;
	
	This_Example(){
		System.out.print("\n This is an example program on keyword this \n");
	}

	This_Example(int num) {
		//Invoking the default constructor
		this();
		
		//Assigning the local variable <i> num </i> to the instance variable  <i> num </i>
		this.num = num;
	}
	
	public void greet() {
		System.out.print("\n Hi Welcome to the Java Challenge! \n");
	}
	
	public void print(){
		// Local variable num
		int num = 20;
	
		// Printing local variable
		System.out.print("\n value of local variable num is : " + num );
		
		//Printing the instance variable
		System.out.print("\n value of instance variable num is : " + this.num);
		
		//Invoking the greeet method of a class
		this.greet();
	}
	
	public static void main(String args[]){
		
		// Instantiating the class
		This_Example obj1 = new This_Example();
		
		// Invoking the print method.
		obj1.print();
		
		// Passing a new value to the num variable through parametrized constructor.
		This_Example obj2 = new This_Example(30);
		
		obj2.print();
	}
}