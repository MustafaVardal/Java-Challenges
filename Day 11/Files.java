/*
	As described earlier, a stream can be defined as a sequence of data. The InputStream is used to read data from a source and the OutputStream is used for writing data to a destination.
*/

// FileInputStream

/*
	This stream is used for reading data from the files. Objects can be created using the keyword new and there are several types of constructors available.
	
	Following constructor takes a file name as a string to create an input stream object to read the file −
	
	InputStream f = FileInputStream("C:/java/hello");
	
	Following constructor takes a file object to create an input stream object to read the file. First we create a file object using File() method as follows -
	File f = new File("C:/java/hello");
	InputStream f = new FileInputStream(f);
	
	Methods: 
	public void close() throws IOException{}

	This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
	
		
	protected void finalize()throws IOException {}

	This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
	
	public int read(int r)throws IOException{}

	This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's the end of the file.
	
	public int read(byte[] r) throws IOException{}

	This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.
	
	public int available() throws IOException{}

	Gives the number of bytes that can be read from this file input stream. Returns an int.
*/

/*
The java.io.ByteArrayInputStream class contains an internatl buffer that contains bytes that may be read from the stream. An internal counter keeps track of the next byte to be supplied by the read method.

Closing a ByteArrayInputStream has no eefect
The methods in this class can be called after the stream has been closed without generating an IOException

public class ByteArrayInputStream
	extends InputStream
*/
/*
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
public class ByteStreamTest{
	public static void main(String args []) throws IOException{
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
		while (bOutput.size() != 10){
			// gets the inputs from the user.
			bOutput.write("hello".getBytes());
		}
		byte b [] = bOutput.toByteArray();
		System.out.print("Print the content");
		for(int x = 0; x < b.length; x++){
			//printing the characters
			System.out.print((char)b[x] + " ");
			}
			
		System.out.print("	");
		int c;
		
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.print("Converting characters to Upper case");
		
		for (int y = 0; y < 1; y++){
				while ((c = bInput.read()) != -1) {
					System.out.print(Character.toUpperCase((char)c));
				}
				bInput.reset();
		}
	}
}
*/
/*
	The Java.io.DataInputStream class lets an application read primitive Java data types from an underlying input stream in a machine-independent way
	An application uses a data output stream to write data that can later be read by a data input stream.
	DataInputStream is not necessarily safe for multithreaded access. Thread safety is optional and is the responsibility of users of methods in this class.
	
	public class DataInputStream
		extends FilterInputStream
			implements DataInput
*/
/*
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Files{
	public static void main(String args[]) throws IOException {
		InputStream is = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		String[] buf = {"Hello", "World!"};
		
		try{
			// create file output stream
			fos = new FileOutputStream("C:\\test.txt");
			
			// create data output stream
			dos = new DataOutputStream(fos);
			
			//for each string in the buffer
			for (String j: buf){
				
				// write string encoded as modified UTF-8
				dos.writeUTF(j);
			}
			
			// force data to the underlying stream
			dos.flush();
			
			// create file input stream
			is = new FileInputStream("C:\\test.txt");
			
			// create new data input stream
			dis = new DataInputStream(is);
			
			// read till end of the stream
			while(dis.available()>0){
				
				// reads chracters encoded with modified UTF-8
				String k = dis.readUTF();
				
				// print
				System.out.print(k + " ");
		}
	} catch (Exception e){
		// if any I/O error occurs
		e.printStackTrace();
	} finally {
		// releases all system resources from the streams
		if(is != null)
			is.close();
		if(dos!=null)
			dos.close();
		if(dis!=null)
			dis.close();
		if(fos!=null)
			fos.close();
		}
	}

}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
	FileOutputStream is used to create a file and write data into it. The stream would create a file, if it doesn't already exist, before opening it for output.

	Here are two constructors which can be used to create a FileOutputStream object.

	Following constructor takes a file name as a string to create an input stream object to write the file −
	OutputStream f = new FileOutputStream("C:/java/hello") 
	
	constructor takes a file object to create an output stream object to write the file.
	
	File f = new File("C:/java/hello");
	
	OutputStream f = new FileOutputStream(f);

	public void close() throws IOException{}

	This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.


	protected void finalize()throws IOException {}

	This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.


	public void write(int w)throws IOException{}

	This methods writes the specified byte to the output stream.


	public void write(byte[] w)

	Writes w.length bytes from the mentioned byte array to the OutputStream.
*/

import java.io.OutputStream;

public class fileStreamTest {
	public static void main(String args[]){
		try {
			byte bWrite[] = {11, 21, 3, 40, 5};
			OutputStream os = new FileOutputStream("test.txt");
			for(int x = 0; x < bWrite.length; x++){
				os.write( bWrite[x]); // writes the bytes
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			
			for(int i = 0; i < size ; i++){
				System.out.print((char)is.read() + "	");
			}
			is.close();
		} catch (IOException e){
			System.out.print("Exception");
		}
	}
}




/*
	The Java ByteArrayOutputStream class implements an output stream in which the data is written into a byte array. The buffer automatically grows as data is written to it.
	Closing a ByteArrayOutputStream has no effect.
	The methods in this class can be called after the stream has been closed without generating an IOException.
	public class ByteArrayOutputStream
		extends OutputStream

*/
/*
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
public class ByteStreamTest {
	public static void main(String args[]) throws IOException{
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
		
		while ( bOutput.size() != 10 ){
			// gets the inputs from the user
			bOutput.write("hello". getBytes());
			
		}
		
		byte b [] = bOutput.toByteArray();
		System.out.print("Print the content");
		
		for(int x = 0; x<b.length; x++){
			System.out.print((char)b[x] + "	");
		}
		System.out.print("	");
		
		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.print("Converting characters to Upper case ");
		
		for (int y = 0 ; y < 1; y++){
			while((c = bInput.read()) != -1 ) {
				System.out.print(Character.toUpperCase((char)c));
		}
		bInput.reset();
	}
}
*/

/*
	The Java.io.DataOutputStream class lets an application write primitive Java data types to an output stream in a portable way. 
	An application can then use a data input stream to read the data back in.
	
	public class DataOutputStream
		extends FilterOutputStream
			implements DataOutput
*/
/*
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Files{
	public static void main(String args[]) throws IOException{
		InputStream is = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		String[] buff = {"Hello", "World!"};
		
		try {
			// create file output stream
			fos = new FileOutputStream("F:\\test.txt");
			
			// create data output stream
			dos = new DataOutputStream(fos);
			
			// create data output stream 
			for(String j:buf){
				//write string encoded as modified UTF-8
				dos.writeUTF(j);
			}
			
			// force data to the underlying stream
			dos.flush();
			
			// create new data input stream
			is = new FileInputStream("F:\\test.txt");
			
			//create new data input stream
			dis = new DataInputStream(is);
			
			// read till end of the stream
			while (dis.available()>0){
				//reads characters encoded with modified UTF-8
				String k = dis.readUTF();
				
				//print
				System.out.print(k+"	");
			}
		} catch(Exception e){
			// f any I/O error occurs
			e.printStackTrace();
			
			
		} finally{
			//release all system resources from the streams
			if(is!=null)
				is.close();
			if(dos!=null)
				dos.close();
			if(dis!=null)
				dis.close();
			if(fos!=null)
				fos.close();
		}
		
	}
}*/

/*Listing Directories

You can use list() method provided by File object to list down all the files and directories available in a directory

*/

import java.io.File;

public class ReadDir{
	
	public static void main(String args[]){
		File file =null;
		String[] paths;
		try{
			//create new file object
			file = new File("/tmp");
			
			// array of files and directory
			paths = file.list();
			
			// for each name in the path array
			for (String path: paths){
				// print filename and directory name
				System.out.print(path);
			}
		} catch (Exception e){
			
			// if any error occurs
			e.printStackTrace();
		}
	}
}
