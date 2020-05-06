package team2_scrum4;

public class Team2_Horse {
	private String horseName;
	private String tailLength;
	private String uniqueQuality;
	private int timeFurlong;
	
	//default constructor
	public Team2_Horse()
	{
		setHorseName("Lil Sebastian");
		setTailLength("long");
		setUniqueQuality("A member of the Great Lakes Ski Patrol and Emergency Rescue Team, respected by Pawnee");
		setTimeFurlong(10);
	}
	
	//parameterized constructor
	public Team2_Horse(String inHorseName, String inTailLength, String inUniqueQuality, int inTimeFurlong)
	{
		setHorseName(inHorseName);
		setTailLength(inTailLength);
		setUniqueQuality(inUniqueQuality);
		setTimeFurlong(inTimeFurlong);
	}

	public String getHorseName() {
		return horseName;
	}

	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getUniqueQuality() {
		return uniqueQuality;
	}

	public void setUniqueQuality(String uniqueQuality) {
		this.uniqueQuality = uniqueQuality;
	}

	public int getTimeFurlong() {
		return timeFurlong;
	}

	public void setTimeFurlong(int timeFurlong) {
		this.timeFurlong = timeFurlong;
	}
	
	// toString method that gets all properties of object
	public String toString()
	{
	String rValue = "Horse Name: " + getHorseName() + ", Tail Length: " + getTailLength() + ", Unique Quality: " +
	getUniqueQuality() + ", Furlong Time in Seconds: " + getTimeFurlong();
	return rValue;
	}
	
}
