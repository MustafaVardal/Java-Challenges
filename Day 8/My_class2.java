//Accessing the private members.
/*
	As mentioned earlier, inner classes are also used to access the private members of a class. 
	Suppose, a class is having private members to acces them.
	Write an inner class in it, return the private members from a method within the inner class, say, getValue(), 
	and finally from another class(from which you want to access the private members) call the getValue() method of the inner class.
	To instantiate the inner class, initially you have to instatniate the outer class.
	Thereafter, using the object of outer class, 
	Syntax
	
	Outer_Demo outer = new Outer_Demo();
	Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();

*/

class Outer_Demo {
	
	//private variable of the outer class;
	private int num = 175 ;
	
	// inner class
	public class Inner_Demo{
		public int getNum() {
			System.out.print("This is the getnum method of the inner class ");
			return num;
		}
	}
}

public class My_class2{
	public static void main(String args[]){
		
		// Instiating the outer class
		Outer_Demo outer = new Outer_Demo();
		
		// Instantiating the inner class
		Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
		// Outer_Demo.Inner_Demo inner = Outer_Demo.new Inner_Demo(); we get an error because we cannot declare the Outer_demo()
		System.out.print(inner.getNum());
	}
}