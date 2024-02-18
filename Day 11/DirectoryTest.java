/*
	A directory is a File which can contain a list of other files and directories. 
	You can File object to create directories, to list down files avaible in a directory.
	For complete detail, check a list of all the methods which you can call on File object and what are realted to directories.
	
*/

/*
	There are two usefule file utility methods.
	mkdir() method creates a directory, returning true on success and false on failure. 
	Failure indicates that the path specified in the File object already exists, or that the directory cannot be created because the entire path does not exist yet.
	
	mkdirs() method creates both a directory and all the parents of the directory.

*/

import java.io.File;

public class DirectoryTest{
	public static void main(String args[]){
		String dirname = "/tmp/user/java/bin";
		File directory = new File(dirname);
		
		//create directory now.
		directory.mkdirs();
		
		// create new file object
		File file = new File("/tmp/user/java/bin");
		
		System.out.print(file.exists());
	}
}

/*
	Java automatically takes care of path separators on UNIX and Windows as per conventions. 
	If you use a forward slash(/) on a Windows version of Java, the path will still resolve correctly.

*/