
//Example 3 for singleton class


class ClassicSingleton{
	
	private static ClassicSingleton instance = null;
	private ClassicSingleton(){
		//Exists only defeat instantiation.
	}
	
	public static synchronized ClassicSingleton getInstance(){
		if(instance  == null){
			instance = new ClassicSingleton();
		}
		return instance;
	}
	
	protected void demoMethod( ) {
	
		System.out.print("demoMethod for singleton");
	}
}

public class TesterSingleton3{
	
	public static void main(String args[]){
		ClassicSingleton tmp = ClassicSingleton.getInstance( );
		tmp.demoMethod( );
	}
}