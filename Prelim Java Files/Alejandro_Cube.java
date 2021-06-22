/*
John Russ Alejandro
7:08 pm 28/04/2021
*/

import java.util.Scanner; // Import the Scanner class

public class Alejandro_Cube {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Cube Side Length : (cm)");
		// Read user input
		int cubeside = myObj.nextInt();
		// Ouput Length x Width x Height
		System.out.println("Cube Volume is: " + (cubeside * cubeside * cubeside) + " cm");
	}
}