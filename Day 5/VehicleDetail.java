/*
	An aggregation is a relationship between two classes where one class contains an instance of another class.
	Example= = When an object A contains a reference to another object B or we can say A has a HAS-A relationship with ibject B, then it is termed as Aggregation in Java Programming.
*/

/*
	Aggregation in Java helps in reusing the code. Object B can have utility methods and which can be utilized by multiple objects, Whichever class has object B then it can utilize its methods.
*/

//
class Vehicle{
	private String vin;
	
	public String getVin(){
		return vin;
	}
	
	public void setVin(String vin){
		this.vin = vin;
	}
}

class Speed {
	private double max;
	
	public double getMax(){
		return max;
	}
	public void setMax(double max){
		this.max = max;
	}
}

class Van extends Vehicle{
	
	private Speed speed;
	
	public Speed getSpeed(){
		
		return speed;
	}
	
	public void setSpeed(Speed speed){
		
		this.speed = speed;
	}
	
	public void print(){
		System.out.print("Vin: " + this.getVin() + " , Max Speed : " + speed.getMax());
	}
}

public class VehicleDetail{
	public static void main(String args[]){
		Speed speed = new Speed();
		speed.setMax( 123 );
		Van van = new Van();
		
		van.setVin("abcde1234");
		van.setSpeed(speed);
		van.print();
	}
}