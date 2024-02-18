// Listing (Reading) Directories
import java.io.File;

public class DirectoryRead{
	
	public static void main(String args[]){
		File file = null;
		String[] paths;
		
		try{
			
			// create new file obj
			file = new File("/tmp");
			
			paths = file.list();
			
			// for each name in the path array
			for(String path:paths){
				
				// prints filename and directory name
				System.out.print(path);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}