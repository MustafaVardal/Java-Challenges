/*
	Sometimes you will want to pass some information into aprogram when you run it. This is accomplished by passing command-line arguments to main().
	A command-line argument is the inforamtion that directly follows the program's name in the command line when it is executed. 
	To access the command-line arguments inside a Java program is quite easy.
	They are stored as strings in the String array passed to main().
*/

public class CommandLine{
	
	public static void main(String args[]){
		
		for(int i = 0 ; i < args.length; i++){
			System.out.print("args[" + i + "]: " + args[i]);
		}
	}
}