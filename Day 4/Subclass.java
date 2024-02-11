/*
	If a class is inherting the properties of another class, the subclass automatically acquiresthe default contructo of the superclass. 
	But if you want to call a parameterized consructor of the superclass, you need to use the keyword as shown below.
	
	super(values);
	
*/

class Superclass{
	int age;
	
	Superclass( int age ){

		this.age = age;

	}
	public void getAge(){
		System.out.print("The value of the variable named age in super class is : " + age);
	}
}
	public class Subclass extends Superclass{
		
		Subclass( int age ){
			super(age);
		}
	
	
	public static void main(String args[]){
		Subclass obj = new Subclass(24);
		obj.getAge();
	}
}