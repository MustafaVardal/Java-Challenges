/*
	Declaration = The newly declared block variable, is of a type compatible with the elements of the array you are accessing. 
					The variable will be available within the for block and its value would be the same as the current array element.
	Expression = This evaluates to the array you need to loop through. The expression can be an array variable or method call that returns an error.
*/



/*
import java.util.Arrays;
import java.util.List;


public class TestForEachLoop{
	public static void main(String args[]){
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		for (Integer x: numbers){
			System.out.println(x);
			System.out.println(", ");
		}
	}
}
*/

/*
import  java.util.Arrays;
import java.util.List;

public class TestForEachLoop{
	public static void main (String args[]){
		
		List<String> names = Arrays.asList("James", "Victor", "Maya", "David", "Olivia"); 
		
		for(String name : names){
			System.out.print(name);
			System.out.print(" - ");
		}
	}
}
*/

import java.util.Arrays;
import java.util.List;

public class TestForEachLoop{
	public static void main(String args[]){
		Student[] students = {new Student(1, "Julie"), new Student(3, "Adam"), new Student(2,"Robert")};
		
		for (Student student: students){
			System.out.print( student );
			System.out.print( " - " );
		}
	}
}
class Student{
	int rollNo;
	String name;
	
	Student (int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString(){
		return "["+ this.rollNo + ", " + this.name + "]";
	}
}