/*
	 Packages are used in java in order to prevent naming confilcts, control access, make searching/locating and usage of class, interfaces, enumerations, and annotations easier, etc.
	 
	 A Java package can be defined as a grouping of related types (classes, interfaces, enumerations, and annotations) providing access protection and namespace management.
	 
	 Type of java packages
	 
	 Built in Java Packages
	 User-defined Java Packages
	 
	 java.lang - bundles the fundamental classes
	 java.io - classes for input, output functions are bundled in this package
	 
	 
*/

/*
	You can define your own packages to bundle groups of class/ interfaces,etc. 
	It is a good practice to group realted classes implemented by you so that a programmer can easily determine that the classes, interfaces, enumerations, and annotations are related.
	Since the package creates  a new namespace there wont't be any name conficlts with names in other packages. Using packages, it is easier to provide accesss control and it is also easier to locate the related classes.
	
*/

/*
	Creating a java package
	
	While creating a package, you should choose a name for the package and include a package statemetn alon with that name at the top of every source file that contains the classes, interfaces,
	enumerations, and annotation types that you want to include in the package.
	
	The package statement should be the first line in the source file, There can be only one package statement in each source file, and it applies to all types in the file..
	
	If a package statement os not used then the class, interfaces , enumerations, and annotation type will be placed in the current default package.

*/

/*
	javac -d Destination_folder file_name.java
*/

package animals;

// file name : MammalInt.java

public class MammalInt implements Animal{
	
	public void eat(){
		System.out.print("Mammal eats");
	}
	public void travel(){
		System.out.print("Mammal travels");
	}
	
	public int noOfLegs(){
		return 0;
	}
	
	public static void main(String args[]){
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
	
	interface Animal{
		
		public void eat();
		public void travel();
	}
}