// Deleting directories


import java.io.File;

public class DirectoryDel{
	
	public static void main(String args[]){
		File file = new File("/tmp/user/java/bin");
		
		
		if (file.exists()){
			boolean success = file.delete();
			
			if (success){
				System.out.print("The directory has been successfully deleted.");
			} else {
				System.out.print("The directory deletion failed.");
			}
		} else {
			System.out.print("The directory is not present.");
		}
	}
}