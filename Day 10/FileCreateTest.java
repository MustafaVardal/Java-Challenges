// Create File Using FileWriter.write()

/*
	Files.write() is a newer and more flexible method create a file and write content to a file in same command 
	
	String data = "Test data";
	Files.write(Paths.gets("d://test/testFile3.txt"), data.getBytes());
	
	List<String> lines = Arrays.asList("1st line", "2nd line");
	Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND);

*/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateTest{
	public static void main(String args[]){
		try{
			File file = new File("c://test/testFile3.txt");
			
			// create the file
			if (file.createNewFile()){
				System.out.print("File is created!");
				
			} else {
				System.out.print("File alreaqdy exists.");
			}
			
			//  write content
			FileWriter writer = new FileWriter(file);
			writer.write("Test data");
			writer.close();
			
			// read content
			FileReader reader = new FileReader(file);
			
			int c;
			while((c = reader.read()) != -1){
				char ch = (char) c;
				System.out.print(ch);
				} 
			}catch (IOException e){
				System.out.print("Exception");
		}
	}
}