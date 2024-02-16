//Example 2 for singleton class

// package (name) or creating the getClass() and getName() methods.

class ClassicSingleton{
	
	private static ClassicSingleton instance = null;
	private ClassicSingleton(){
		// Exists only to defeat instantiation.
	}
	
	public static ClassicSingleton getInstance(){
		if (instance == null){
			instance = new ClassicSingleton();
		}
		return instance;
	}
	protected void demoMethod( ) {
		System.out.print("demoMethod for singleton");
	}
}

public class TesterClassicSingleton{
	
	public static void main(String args[]){
		ClassicSingleton tmp = ClassicSingleton.getInstance( );
		tmp.demoMethod( );
	}
}

// Output would be demoMethod for singleton