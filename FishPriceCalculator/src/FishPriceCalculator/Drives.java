/*
 *  Name : Amirreza Mirzaei
 *  Description: Fish Price Calculator
 */
package FishPriceCalculator;

import java.util.Scanner;

public class Drives {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int totalLargeFish = 0;
		int totalMediumFish = 0;
		int fishSize = 0;
		char continueFishing;
		
		
		do {
			System.out.println("Enter the size of the fish caught (1 for large or 2 for medium:)");
			fishSize = scan.nextInt();
			
			if (fishSize == 1) {
				totalLargeFish++;
			}else if(fishSize == 2) {
				totalMediumFish++;
				}else {
					System.out.println("Invalid fish size entered. please enter 1 for large or 2 for medium");
				}
			
			System.out.println("do you wish to exit (Y to Exit)?");
			continueFishing = scan.next().charAt(0);
			
		} while(Character.toUpperCase(continueFishing) != 'Y');
		
		Fishnet fishnet = new Fishnet(totalLargeFish, totalMediumFish);
		double totalValue = fishnet.calculateValue();
			
			System.out.printf("Total value of the catch is: %.2f%n", totalValue);
		
	}

}
