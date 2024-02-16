// Anonymous inner class as an argument.

// package (name) or creating the getClass() and getName() methods.

abstract class Engine {
	public abstract void engineType();
}

class Vehicle {
	public void transport (Engine e){
		e.engineType();
	}
}

public class TesterAnInnerArgs {
	public static void main(String args[]){
		Vehicle v = new Vehicle();
		v.transport (new Engine(){
			@Override
			public void engineType(){
				System.out.print("Turbo Engine");
			}
		});
	}
}

//Output could be : Turbo Engine