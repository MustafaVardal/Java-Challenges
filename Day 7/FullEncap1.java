// FIRST Example of encapsulation
class  Person{
	private String name;
	private String country;
	private double height;
	private int age;
	
	//Setter methods
	
	public void setName(String name){
		this.name = name; 
	}
	
	public void setAge (int age){
		this.age = age;
	}
	
	public void setCountry (String country){
		this.country = country;
	}
	
	public void setHeight (double height){
		this.height = height;
	}
	
	//Getter methods
	
	public String getName() {
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public double getHeight(){
		return this.height;
	}
}

public class FullEncap1{
	
	public static void main(String args[]){
		// Object to person class
		Person p1 = new Person();
		Person p2 = new Person();
		
		// Setting the values
		p1.setName("Pheel");
		p1.setAge(26);
		p1.setCountry("United States");
		p1.setHeight(6.5);
		
		p2.setName("Kosret");
		p2.setAge(25);
		p2.setCountry("United States");
		p2.setHeight(6.2);
		
		//Getting the values
		System.out.print("Person 1 : \nName : " + p1.getName() + "\t"+ " \nAge : " + p1.getAge() + " \nCountry : " + p1.getCountry() + "\t" + "  \nHeight : " + p1.getHeight());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Person 2 : \nName : " + p2.getName() + "\t"+ " \nAge : " + p2.getAge()+ " \nCountry : " + p2.getCountry() + "\t" + "  \nHeight : " + p2.getHeight());
	}
}