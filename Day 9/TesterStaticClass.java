public class TesterStaticClass{

	public static void main(String arg[]){
		new Outer.NestedDemo().print();
	}
}

class Outer {
	static class NestedDemo{
		public void print(){
			System.out.print("This is my nested class");
		}
	}
}