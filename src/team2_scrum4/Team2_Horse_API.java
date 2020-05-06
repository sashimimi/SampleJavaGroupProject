package team2_scrum4;


public class Team2_Horse_API {

public static Team2_Horse newHorse; 
	
	//creates a new object
	public Team2_Horse createHorse(String inHorseName, String inTailLength, String inUniqueQuality,
			int inTimeFurlong)
	{
		// try input values in parameterized constructor
		try{
			newHorse = new Team2_Horse(inHorseName, inTailLength, inUniqueQuality, inTimeFurlong);
			return newHorse;
		}
		catch(Exception err)
		{
			//if doesn't work, print error and set default constructor
			System.out.println(err + "Did not work, set defult object");
			newHorse = new Team2_Horse();
			return newHorse;
		}
	}
}
