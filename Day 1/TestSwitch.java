/*
	The java switch statement allows a variable to be tested for equality against a list of values.
	Each value is called a case, and the variable being switched on is checked for each case.
	The switch statement can be used when multiple if- else statements are required.
	It can have multiple code blocks along with the case values and executes one of many code blocks based on the matches case value.
*/


/*
	The variable used in a switch statement can only be integers, convertable integers(byte, short, chart), strings and enums.
	You can have any number of case statements within a switch. Each case is followed by the value to be compared to and a colon.
	The value for a case must be the same data type as the variable in the switch and it must be a constant or a literal.
	When the variable being switched on is equal to a case, the satements following that case will execute until a break statement is reached.
	When a break statement is reached, the switch terminates, and the flow of control jumos to the next line following the switch statement.
	Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
	A switch statement can have an optional default case, which myst appear at the end of the switch. 
	The default case can be used for performing a task when none of the cases is No break is needed in the default case.
*/


//Example 1 
/*
public class TestSwitch{
	public static void main(String args[]){
		char grade = 'B';
		
		switch(grade){
			case 'A':
				System.out.println("Excellent!");
					break;
			case 'B':
			case 'C':
				System.out.println("Well done!");
					break;
			case 'D':
				System.out.println("You passed.");
			case 'F':
				System.out.println("Better try again. ");
					break;
			default:
				System.out.println("Invalid grade");
		
		}
	System.out.println("Your grade is " + grade );
	}
}
*/

// Example 2
/*
public class TestSwitch{
	public static void main(String args[]){
		
		int grade =3;
		
		switch(grade){
			case 1:{System.out.println("You are giant student."); break;}
			case 2:{System.out.println("You are excelent student."); break;}
			case 3:{System.out.println("You almost passed come on!"); break;}
			case 4:
			case 5:{System.out.println("You failed."); break;}
			default:
				System.out.println("Invalid value! ");
		}
	System.out.println("You are the selection: " + grade);
	}
}
*/
public class TestSwitch{
	public static void main(String args[]){
		
		String grade = "C";
		
		switch (grade){
			case "A" : {System.out.println("You are giant student."); break;}
			case "B" : {System.out.println("You are excelent student."); break;}
			case "C" : {System.out.println("You almost passed come on!"); break;}
			case "D" : 
			case "F" : {System.out.println("You failed."); break;}
			default:	System.out.println("Invalid value! ");
				
		}
	System.out.println("You are the selection: " + grade);
	}
}