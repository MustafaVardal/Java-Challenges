// Java Try with Resources

/*
	to use a class with try-with-resources statement it should implement AutoCloseable interface and the close() method of it gets invoked automatically at runtime.
	you can declare more than one class in try with resources statement
	while you declare multiple classes in the try block of try with resources statemetn these classes are closed in reverse order.
	Except the declaration of resources within the parenthesis everthin is the same as normal try/catch block of a try block.
	The resouce declared  in try gets instantiated just before the start of the try block
	the resource declared at the try block is implicitly declared as final.
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo{
	
	public static void main(String args[]){
		FileReader fr = nill;
		try{
			File file = new File("file.txt");
			fr = new FileReader(file);
			char [] a = new char[50];
			fr.read(a); // reads the content to the array
			for(char c :a)
				System.out.print(c); // prints the characters one by one
		} catch (IOException e ) {
			e.printStackTrace();
			
		} finally {
			try {
				fr.close();
			} catch (IOException ex ){
				ex.printStackTrace();
			}
		}
	}
}