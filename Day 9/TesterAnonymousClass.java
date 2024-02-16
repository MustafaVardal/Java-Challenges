
// Anonymous inner class that implements an interface


// Create a interface because software a abstract class.

// Assume that you have getClass() and getName() methods.


// package (name) or creating the getClass() and getName() methods.
interface Software {
	public void develop();
}

public class TesterAnonymousClass{
	public static void main(String args[]){
		Software s = new Software(){
			@Override
			public void develope(){
				System.out.print("Software Developed in Java");
			}
		};
		s.develop();
		System.out.print(s.getClass().getName());
	}
}

//Output could be Software Developed in Java
// package name from the TesterAnonymousClass class.