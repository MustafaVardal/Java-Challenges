/*
Deleting all file from given directory.

all files in the given directory recursively.
*/

import java.io.File;
import java.io.IOException;

public class DeletionDir{
	
	public static void deleteFiles (File dirPath){
		File filesList[] = dirPath.listFiles();
		for(File file : filesList){
			if(file.isFile()){ file.delete();}
			else{deleteFiles(file);}
		} 
	}


public static void main(String args[]) throws IOException{
	
	// Crating a file object for directory
	File file = new File("D:\\test");
	
	// List of all files and directories
	
	deleteFiles(file);
	System.out.print("Files deleted.");
	}
}