/**
 * 
 */
package edu.ilstu;

/**
 * @author Stefan Tujarov
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Program3 {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int barX = 3;
		int barY = 5;
		int homeX = 0;
		int homeY = 0;
		int random = 0;
		int count = 1;
		
		System.out.println("Find your way home!");
		System.out.println("Please Enter the x and y coordinates of your apartment: ");
		
		System.out.print("Enter the X coordinates of your destination: ");
		
		homeX = scan.nextInt();
		
		System.out.print("Enter the Y coordinates of your destination: ");
		
		homeY = scan.nextInt();		
		
		while (count <= 100) {
			random = rand.nextInt(4) + 1;
		
			if (random == 1) {
				barY = barY + 1;
			}
			else if (random == 2) 	{
			barY = barY - 1;
			}
			else if (random == 3) {
				barX = barX + 1;
			}
			else if (random == 4) {
				barX = barX -1;
			}
	
			System.out.println("(" + barX + "," + barY + ")");
			if (homeX == barX && homeY == barY) {
				count = count + 99;
			}
			count = count + 1;
		}		
		
		if (homeX == barX && homeY == barY) {
			System.out.print("Welcome Home!");
		}else{
			System.out.print("Call me a cab, I'm lost! I'm currently at: (" + barX + "," + barY + ")" );
	
	}
	
	}

}
