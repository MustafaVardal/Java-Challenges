// Deleting File that does not exists Following is the example to demonstrate File.delete() method call to delete an non-existing file in current directory.
// As file is not present, it  returns false as result.

import java.io.File;
import java.io.IOException;

public class DeletedFileExists{
	public static void main(String args[]) throws IOException{
		File file = new File("test1.txt");
		boolean success = file.delete();
		
		if(success){
			System.out.print("The file has been successfully deleted.");
		} else {
			System.out.print("The file deletion failed.");
		}
	}
}