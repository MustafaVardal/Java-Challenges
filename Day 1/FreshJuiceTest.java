/*
	Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.
	With the use of enums it is possible t reduce the number of bugs in your code. 
		Example = If we consifer an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. 
				This wouldmake sure that it would not allow anyone to order any size other than small, medium, or large.
*/
class FreshJuice{
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}

public class FreshJuiceTest{
	
	public static void main(String args[]){
		FreshJuice juice = new FreshJuice();
		juice.size =FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}

/*
	Enums can be declared as their own or inside a class. 
	Methods, variables, constructors can be defined inside enums as well.
*/
/*
	Class can be derived from classes. Basically, if you need to create a new class and here is already a class that has some of the code you require, 
	then it is possible to derive your new class from the already existing code. 
	This concept allows you to reuse the fields and methods of the existing class without having to rewrite the code in a new class. 
	In this scenario, the existing class is called the superclass and the derived class is called the subclass.
*/

/*
	In java language an interface can be defined as a conract between objects on how to communicate with each other. Interface play a vital role when it comes to the concept of inheritance.
	And interface defines the methods, a deriving class(subclass) should use. But the implementation of the methods is totally up to the subclass.
*/	