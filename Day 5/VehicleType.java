// RUN TIME POLYMORPHISM

class Vehicle{
	public void displayInfo(){
		System.out.print("Some vehicles are there.");
		
	}
}

class Car extends Vehicle{
	// Method overriding
	@Override
	public void displayInfo(){
		System.out.print("I have a Car.");
	}
}

class Bike extends Vehicle{
	// Method overriding
	@Override
	public void displayInfo(){
		System.out.print("I don't have a Bike.");
		
	}
}

public class VehicleType{
	public static void main(String args[]){
		Vehicle v1 = new Car(); // Upcasting
		Vehicle v2 = new Bike(); // Upcasting
		
		// Calling the overridden displayInfo() method of Car class
		v1.displayInfo();
		
		System.out.print("\n");
		// Calling the overridden displayInfo() method of Bike class
		v2.displayInfo();
	}
}