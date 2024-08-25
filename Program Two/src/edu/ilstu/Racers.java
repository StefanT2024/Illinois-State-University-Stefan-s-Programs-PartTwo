/**
 * 
 */
package edu.ilstu;

/**
 * @author Stefan
 *
 */
import java.util.Random;
import java.util.Scanner;
public class Racers {

public static void main(String[] args) {
		
	Random ran = new Random();
	Scanner inputRacerOne = new Scanner(System.in);
	Scanner inputRacerTwo = new Scanner(System.in);
	Scanner inputRacerThree = new Scanner(System.in);
	int Random1;
	int Random2;
	int Random3;
	
	
	System.out.println("Welcome to the Lone Survivor Endurance Race!");
	
	//first racer
		System.out.print("Please Enter the racer's first name:  ");
		String FirstName1 = inputRacerOne.nextLine();
		System.out.print("Please Enter the racer's last name:  ");
		String LastName1 = inputRacerOne.nextLine();
		System.out.print("Please Enter the number of laps completed:  ");
		double LapsOne = inputRacerOne.nextDouble();
	
		Racer RacerOne = new Racer(FirstName1, LastName1, LapsOne);
		System.out.println(RacerOne.GetName());
		System.out.println(RacerOne.GetMiles(LapsOne));
		System.out.println(RacerOne.GetBonusWinnings(LapsOne));
		System.out.println(RacerOne.getBaseWinnings(LapsOne));
		System.out.println(RacerOne.getNetWinnings(LapsOne));
		Random1 = ran.nextInt(5000);
		
		
		//Second racer
		System.out.print("Please Enter the racer's first name:  ");
		String FirstName2 = inputRacerTwo.nextLine();
		System.out.print("Please Enter the racer's last name:  ");
		String LastName2 = inputRacerTwo.nextLine();
		System.out.print("Please Enter the number of laps completed:  ");
		double LapsTwo = inputRacerTwo.nextDouble();
		
		Racer Racertwo = new Racer(FirstName2, LastName2, LapsTwo);
		System.out.println(Racertwo.GetName());
		System.out.println(Racertwo.GetMiles(LapsOne));
		System.out.println(Racertwo.GetBonusWinnings(LapsTwo));
		System.out.println(Racertwo.getBaseWinnings(LapsTwo));
		System.out.println(Racertwo.getNetWinnings(LapsTwo));
		Random2 = ran.nextInt(5000);
		
		//third racer
		System.out.print("Please Enter the racer's first name:  ");
		String FirstName3 = inputRacerThree.nextLine();
		System.out.print("Please Enter the racer's last name:  ");
		String LastName3 = inputRacerThree.nextLine();
		System.out.print("Please Enter the number of laps completed:  ");
		double LapsThree = inputRacerThree.nextDouble();
		
		Racer RacerThree = new Racer(FirstName3, LastName3, LapsThree);
		System.out.println(RacerThree.GetName());
		System.out.println(RacerThree.GetMiles(LapsOne));
		System.out.println(RacerThree.GetBonusWinnings(LapsThree));
		System.out.println(RacerThree.getBaseWinnings(LapsThree));
		System.out.println(RacerThree.getNetWinnings(LapsThree));
		Random3 = ran.nextInt(5000);

		System.out.println("Bib#   Name   Laps  Base Winnings   Bonues  Net Winnings  Miles");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(Random1 +  "    " + FirstName1 + "    " + LastName1 + "    " + LapsOne + "    " + RacerOne.getBaseWinnings(LapsOne) + "   " + RacerOne.GetBonusWinnings(LapsOne) + "   "  + RacerOne.getNetWinnings(LapsOne) + "  " + RacerOne.GetMiles(LapsOne));
		System.out.println(Random2 +  "    " + FirstName2 + "    " + LastName2 + "    " + LapsTwo + "    " + Racertwo.getBaseWinnings(LapsTwo) + "   " + Racertwo.GetBonusWinnings(LapsTwo) + "   "  + Racertwo.getNetWinnings(LapsTwo) + "  " + Racertwo.GetMiles(LapsTwo));
		System.out.println(Random3 +  "    " + FirstName3 + "    " + LastName3 + "    " + LapsThree + "    " + RacerThree.getBaseWinnings(LapsThree) + "   " + RacerThree.GetBonusWinnings(LapsThree) + "   "  + RacerThree.getNetWinnings(LapsThree) + "  " + RacerThree.getBaseWinnings(LapsThree));


		System.out.println("Total Miles covered: ");
		System.out.println(RacerOne.GetMiles(LapsOne) +  Racertwo.GetMiles(LapsTwo)  + RacerThree.GetMiles(LapsThree));

		System.out.println("Total Base Winnings: ");
		System.out.println(RacerOne.getBaseWinnings(LapsOne) + Racertwo.getBaseWinnings(LapsTwo) + RacerThree.getBaseWinnings(LapsThree)); 
		
		System.out.println("Total Bonus Winnings: ");
		System.out.println(RacerOne.GetBonusWinnings(LapsOne) + Racertwo.GetBonusWinnings(LapsTwo) + RacerThree.GetBonusWinnings(LapsThree));
		
		System.out.println("Total Net Winnings: ");
		System.out.println(RacerOne.getNetWinnings(LapsOne) + Racertwo.getNetWinnings(LapsTwo) + RacerThree.getNetWinnings(LapsThree));
		
		



}



}
