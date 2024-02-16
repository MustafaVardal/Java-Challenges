public class Tester{
	public static void main(String args[]){
		Outer.NestedDemo.print();
	}
}

class Outer{
	static class NestedDemo{
		public static void print(){
			System.out.print("This is my nested class");
		}
	}
}