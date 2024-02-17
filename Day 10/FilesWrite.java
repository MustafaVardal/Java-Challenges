// Files.write()

/*
	Syntax
	Files.write(Paths.get("c://test/testFile3.txt"), data.getBytes());
	
	List<String> lines = Arrays.asList("1st line", "2nd line");
	Files.write(Paths.get("files6.txt"), lines, StandardCharsets.UTF_8,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND);
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FilesWrite{
	public static void main(String args[]){
		try {
			String data = "Test data";
			Files.write(Paths.get("c://test/testFile3.txt"), data.getBytes());
			List<String> lines = Arrays.asList("1st line", "2nd line");
			Files.write(Paths.get("files6.txt"), lines, StandardCharsets.UTF_8,
						StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			
			List<String> content = Files.readAllLines(Paths.get("c://test/testFile3.txt"));
			
			System.out.println(content);
			
			content = Files.readAllLines(Paths.get("files6.txt"));
			
			System.out.print(content);
			} catch (IOException e){
				System.out.print("Exception");
			}
	
	}
}