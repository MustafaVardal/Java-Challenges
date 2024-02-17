// Creating File Using File.createNewFile() Method
/*

syntax
File file = new File("C:\Users\Mustafa\OneDrive\Desktop\Java Basics\Java-Challenges\Day 10");

Create the file
if (file.createNewFile()){
	System.out.print("File is created!");
	
} else{
	System.out.print("File is already exists.");
}

*/

/// FileOutputStream Constructor.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate{
	public static void main(String args[]){
		
		try {
			File file = new File("d://test//testFile1.txt");
			
			// Create the file.
			if (file.createNewFile()){
				System.out.print("File is created!");
				
			} else {
				System.out.print("File is already exists.");
			}
			
			//Write Content
			
			FileWriter writer = new FileWriter(file);
			writer.write("Test data");
			writer.close();
			
			//Read Content
			
			FileReader reader = new FileReader(file);
			
			int c;
			while ((c= reader.read()) != -1){
				char ch =(char) c;
				System.out.print(ch);
			}
		} catch (IOException e){
		System.out.print("Exception");
		}
	}
}