/*
9:22 pm 07/05/2021
John Russ Alejandro
*/


import java.util.Scanner;

public class Alejandro_Season {
	public static void main(String[] args) {
		Scanner month_input = new Scanner(System.in);
		System.out.println("SEASON! Please enter month in number: ");
		System.out.println("[1]January [2]February [3]March [4]April [5]May [6]June \n[7]July [8]August [9]September [10]October [11]November [12]December");
		int month_number = month_input.nextInt();
	//If its 1-12, proceed
		if(month_number>0 && month_number<13)
		{
		//If its 1-3, print winter
			if(month_number>0 && month_number<4)
			{
				System.out.println("The Season is :");
				System.out.println("It is WINTER.");
			}
		//If its 4-6, print spring
			else if(month_number>3 && month_number<7)
			{
				System.out.println("The Season is :");
				System.out.println("It is SPRING.");
			}
		//If its 7-9, print summer
			else if(month_number>6 && month_number<10)
			{
				System.out.println("The Season is :");
				System.out.println("It is SUMMER,");
			}
		//Else, print autumn
			else
			{
				System.out.println("The Season is :");
				System.out.println("It is AUTUMN.");
			}
		}
	//Else Invalid - restart program
		else
		{
			System.out.println("Invalid Input. \nPlease try again. \nThe program is restarting in 5 seconds.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			main(args);
		}
	}
}
