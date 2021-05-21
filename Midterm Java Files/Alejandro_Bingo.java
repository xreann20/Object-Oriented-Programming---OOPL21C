/*
9:23 pm 07/05/2021
John Russ Alejandro
*/


import java.util.Scanner;


public class Alejandro_Bingo {
	public static void main(String[] args) {
		Scanner bingo_input = new Scanner(System.in);
		System.out.println("BINGO! Please enter a number: (1-75)");
		int bingo_number = bingo_input.nextInt();
	//If its 1-75, proceed
		if(bingo_number>0 && bingo_number<76)
		{
		//If 1-15, print B
			if(bingo_number>0 && bingo_number<16)
			{
				System.out.println("You got :");
				System.out.println("B");
			}
		//If 16-30, print I
			else if(bingo_number>15 && bingo_number<31)
			{
				System.out.println("You got :");
				System.out.println("I");
			}
		//If 31-45, print N
			else if(bingo_number>30 && bingo_number<46)
			{
				System.out.println("You got :");
				System.out.println("N");
			}
		//If 46-60, print G
			else if(bingo_number>45 && bingo_number<61)
			{
				System.out.println("You got :");
				System.out.println("G");
			}
		//Else it is letter O
			else
			{
				System.out.println("You got :");
				System.out.println("O");
			}
		}
	//Else its not 1-75 - restart program
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
