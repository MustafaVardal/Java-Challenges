/*
	The void keyword allows us to create methods which do not return a value. 
	Here, in the following example we are considering a void method methodRankPoints. This method is a void methid, which does not return any value. 
	Call to a void methid must be a statement i.e.
	methodRankPoints(22.2). It is a Java statement which ends with a semicolon as shown in the following example.
	
*/

public class ExampleVoid{
	public static void main(String args[]){
		methodRankPoints(22.2);
	}
	
	public static void methodRankPoints(double points){
		if ( points >= 20.5 ) {
			System.out.print("Rank:A1");
		}else if ( points >= 15.5){
			System.out.print("Rank:A2");
		}else{
			System.out.print("Rank:A3");
		}
	}
}