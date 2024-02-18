/*
	All the programming languages provide support for standard I/O where the user's program can take input from a keyboard and then produce an output on the computer screen. 
	If you are aware of C or C++ programming langugaes, then you must be aware of three standard devices STDIN, STDOUT, and STDERR. Similarly, Java provides the following three Standard streams
	
	Standard Input - This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as System.in.
	
	Standard Output - This is used to output the data produced by the user's program and usually a computer screen is used for standard output stream and represented as System.out.
	
	Standard Error - This is used to output the error data produced by the user's program and usually a computer screen is used for standard error stream and represented as System.err.

*/

// In simple program example, creates InputStreamReader to read standard input stream until the user types a "q"

import java.io.InputStreamReader;
import java.io.IOException;
public class ReadConsole{
	public static void main(String args[]) throws IOException{
		
		InputStreamReader cin = null;
		
		try{
			cin = new InputStreamReader(System.in);
			System.out.print("Enter characters, 'q' to quit.");
			
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			} while ( c != 'q' && c != 'Q');
		} finally {
			if (cin != null){
				cin.close();
			}
		}
	}
}

