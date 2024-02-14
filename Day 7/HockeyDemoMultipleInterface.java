// Extendin multiple Java interfaces

/*
	A Java can only extend one parent class. Multiple inheritance is not allowd. Interfaces are not classes, however, and an interface can extend more than one parent interface.
	
	The extends keyword is used once, and the parent interfaces are declared in a comma-seprated list.
	
	public interface Hocket extends Sport, Event
*/

interface Sports{
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	
}

interface Football extends Sports{
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
	
}

interface Hockey extends Sports{
	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overTimePeriod(int ot);
}

interface Event{
	public void organize();
}

public class HockeyDemoMultipleInterface implements Hockey, Event {
	public void setHomeTeam (String name){
		System.out.print("Home team: " + name);
	}
	public void setVisitingTeam(String name){}
	
	public void homeGoalScored(){}
	
	public void visitingGoalScored(){}
	
	public void endOfPeriod(int period){}
	
	public void overTimePeriod(int ot){}
	
	public static void main(String args[]){
	HockeyDemoMultipleInterface hd = new HockeyDemoMultipleInterface();
	
	hd.setHomeTeam("USA");
	hd.organize();
	}

	public void organize(){
		System.out.print("\nNFL match organized.");
	}
}