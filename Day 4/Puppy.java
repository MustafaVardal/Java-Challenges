/*
	The following rules for inherited methods are enforced;;;
	Methods declared public in a superclass also must be public in all subclasses.
	Methods declared protected in a superclass must either be protected or public on subclasses; they cannot be private.
	Methods declared private are not inherited at all, so there is no rule for them.
	
*/
public class Puppy {
	private int age;
	String name;
	
	public Puppy(){
		
	}
	
	public void setAge( int age ) {
		this.age = age;
	}

	public int getAge(){
		return age;
	}
	
	public static void main(String args[]){
			Puppy myPuppy = new Puppy();
			
			// update age variable using method call
			myPuppy.setAge( 4 );
			
			// update name directly
			myPuppy.name = "Dean";
			System.out.print("Age : " + myPuppy.getAge() +  " " + ", name : " + myPuppy.name );
	}
}