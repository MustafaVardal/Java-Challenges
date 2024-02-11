/* 
	If you do not create any constructor in the class, Java provides a default constructor that initializes the object
*/
public class Numbers{
	int num1;
	int num2;
	
	public static void main(String args[]){
		// We did not created any structure
		// a default constructor will invoke here
		Numbers obj_x = new Numbers();
		
		// Printing the values
		System.out.print("num1: " + obj_x.num1);
		System.out.print("\nnum2: " + obj_x.num2);
	}
}