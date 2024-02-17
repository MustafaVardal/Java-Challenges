/*

	to delete a file in java, you can use the File.delete() method. this method deletes the files or directory from given path.
	
	Syntax 
	File file =new File(""C:/java/hello.txt"");
	
	if (file.exists()){file.delete();}
	
	
*/

// Delete File from Current Directory

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeletionFile{
	public static void main(String args[]) throws IOException{
		BufferedWriter out = new BufferedWriter (new FileWriter("test.txt"));
		out.write("test data");
		out.close();
		
		File file = new File("test.txt");
		if(file.exists()){
			boolean success = file.delete();
				
				if (success) {
					System.out.print("The file has been successfully deleted.");
					
				} else {
					System.out.print("The file deletion failed.");
				}
			} else {
				System.out.print("The file is not present.");
			}
	}
}


}