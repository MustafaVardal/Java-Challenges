/*
	Binding is a mechanism creating link between method call and method actual implementation. 
	As per the polymorphism concept in Java, object can have many different forms. Object forms can be resolved at compile time and run time.
	
*/

/*
	Static binding referes to the process in which linking between method call and method implementation is resolved at compile time. 
	Static binding is also known as compile-time binding or early binding. 
*/

/*
	Linking = Linkin between method call and method implementation is resolved at compile time.
	
	Resolve mechanism = Static binding uses type of the class and fields to resolve binding.
	
	Example = Method overloading is the example of Static binding.
	
	Type of Methods = private, final and static methods and variables uses static binding.
	
*/

// Now, static argument method loading example. 
/*
class Profit{
		public static double net(double total_revenue , double cost_of_goods_sold, double operating_expenses, double taxes){
			return total_revenue-(cost_of_goods_sold + operating_expenses + taxes);
		}
		public static int net( int total_revenue, int operating_expenses){
			return total_revenue - operating_expenses;
		}
}

public class NetProfitTest{
	public static void main(String args[]){
		System.out.print("Net profit with double data type: " + Profit.net(500000.23, 10000.56, 20000.54645, 30000.34534));
		System.out.print("\n");
		System.out.print("Based on the operating_expenses total_revenue with integer data type: " + Profit.net(500000, 20000));
		
	}
}

*/


// This example is also non static argument method loading.
class Profit{
	public double net( double total_revenue , double cost_of_goods_sold, double operating_expenses, double taxes){
			return total_revenue-(cost_of_goods_sold + operating_expenses + taxes);
	}
	
	public int net( int total_revenue, int operating_expenses){
			return total_revenue - operating_expenses;
	}
}

public class NetProfitTest{
	public static void main(String args[]){
		Profit profit = new Profit(); 
		System.out.print("Net profit with double data type: " + profit.net(500000.23, 10000.56, 20000.54645, 30000.34534));
		System.out.print("\n");
		System.out.print("Based on the operating_expenses total_revenue with integer data type: " + profit.net(500000, 20000));
	}
}

