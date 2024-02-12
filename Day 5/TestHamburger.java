	class Food{
		public void eat(){
			System.out.print("Foods are eatten by people.");
		}
	}
	
	class Hamburger extends Food {
		public void eat(){
			System.out.print("People is eating HAMBURGER.");
		}
		public void taste(){
			System.out.print("Hamburger is taste really delicious");
		}
	}
	
	public class TestHamburger{
		public static void main(String args[]){
			Food a = new Food(); // Food reference and object.
			Food b = new Hamburger(); // Food reference bu Hamburger object
			
			a.eat(); // runs the method in Food class
			System.out.print("\n");
			b.eat(); // runs the method in Hamburger class
			System.out.print("\n");
			b.taste(); // runs the method in Hamburger class.
		}
	}
	
	// This program will throw a compile time errror since b's references type Food doesn't have a method by the name of taste.
	
	/*
		The argument list should be exatcly same as that of the overridden method.
		The return type should be the same or a subtype of the return type declared in hte original overridden method in the superclass.
		The access level cannot be more restrictive that the overriden method's access level.
			Example = If the superclass method is  declared public then the overridding method in the subclass cannot be either private or protected.
		Instance methods can be overridden only if they are inherited by the subclass.
		A method declared final cannot be overridden.
		A method declared static cannot be overriden but can be re-declared.
		If a method cannotbe inherited, then it cannot be overridden.
		A subclass within the same package as the isntance's superclass can override any superclass method that is not declarted private or final.
		A subclass in a different package can only override the non-final methods declared public or protected.
		An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. 
		However, the overridding method should not throw checked exceptions that are new or broader that the ones declared by the overridden method.
		The overriding method can thrownarrower or fewer expections than the overridden method. 
		Constructors cannot be overridden.
	*/