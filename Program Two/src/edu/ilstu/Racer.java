/**
 * 
 */
package edu.ilstu;

/**
 * @author Stefan
 *
 */
public class Racer {

private String FirstName;
private String LastName;
private double LapsDriven;
private double MilesDriven;
private double BonusWinnings;
private double NetWinnings;
private double BaseWinnings;
	public Racer(String fName, String lName, double laps) {

	FirstName = fName;
	LastName = lName;
	LapsDriven = laps;
}

	public String GetName() {
		return FirstName + " " + LastName;
		
	}
	
public double GetMiles(double laps)	{
	MilesDriven = laps * 8.5;
	 return MilesDriven;
}

public double GetBonusWinnings(double laps) {

	BonusWinnings = (MilesDriven -50) * 12;
	return BonusWinnings;


}
public double getNetWinnings(double laps) {
	NetWinnings = (BonusWinnings + BaseWinnings)-100;
			return NetWinnings;
			
}

public double getBaseWinnings(double laps) {
	BaseWinnings = laps * 22;
	return BaseWinnings;
}



}
