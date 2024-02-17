/*
	We can read a file in Java using multiple ways
	
	Using FileInputStream() constructor.
	Using FileReader.read() method
	Using Files.readAllLines() method
	
*/


// Reading File Using FileInputStream() Constructor

// FileInputStream is used for reading dta from the files. Objects can be created using the keyword new and there are several types of constructors available.
/*
	Syntax
	InputStream f = new FileInputStream("C:/java/hello.txt");


	File f= new File("C:/java/hello.txt");
	InputStream f = new FileInputStream(f);
	
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileRead{
	public static void main(String args[]){
		try{
			byte bWrite [] = {65 ,66, 67, 68, 69};
			OutputStream os = new FileOutputStream("test.txt");
			for(int x = 0; x < bWrite.length; x++){
				os.write( bWrite[x]); //writes the bytes
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			
			for(int i = 0; i < size; i++){
				System.out.print((char)is.read()+" ");
			}
			is.close();
		} catch (IOException e){
			System.out.print("Exception");
		}
	}
}