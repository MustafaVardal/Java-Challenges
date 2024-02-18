/*
	The java.io package contains nearly every class you might ever need to perform infor and output(I/O) in Java.
	All these streams represent an input source and an output destination.
	The stream in the java.io package supports many data such as primitives, object, localized, characters, etc.
	
	
*/

/*
	A stream can be defined as a sequence of data.
	
	InPutStream = The InputStream is used to read data from a source.
	OutPutStream  =  The OutPutStream is used for writing data to a destination.
	
	Java provides strong but flexible support for I/O related to files and netwroks but this tutorial covers very basic functionality related to streams and I/O. We will see the most commoly used examples
	
	
*/

// Byte Streams
/*
	Java byte streams are used to perform input and output of 8-bit bytes. 
	Though there are many classes related to byte streams  but the most frequently used classes are, FileInputStream and FileOutputStream.
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile{
	
	public static void main(String args[]) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try{
			in  = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null){
				out.close();
			}
		}
	}
}