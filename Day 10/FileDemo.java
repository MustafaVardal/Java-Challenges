
/*
	Java file class represents the files and directory pathnames in an abstract manner. This class is used for creating of files and directories, file searching file deletion, etc.
	
	the file object represents the actual filedirectory on the disk.
*/

import java.io.File;

public class FileDemo{
public static void main(String args[]){
	File f =null;
	String[] strs = {"test1.txt", "test2.txt"};
	
	try{
		
		// for each string in string array
		for (String s:strs){
			
			//create  new file
			f = new File(s);
			
			// true if the file is executable
			
			boolean bool = f.canExecute();
			
			/// find the absolute path
			String a = f.getAbsolutePath();
			
			// prints absolute path 
			
			System.out.print(a);
			
			// prints
			System.out.print(" is executable: " + bool);
		}
	} catch (Exception e){
		// if any i/o error occurs.
		e.printStackTrace();
		}
	}
}
/*
/home/cg/root/2880380/test1.txt is executable: false
/home/cg/root/2880380/test2.txt is executable: false
*/