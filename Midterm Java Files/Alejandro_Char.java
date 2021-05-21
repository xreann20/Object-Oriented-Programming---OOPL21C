/*
9:24 pm 07/05/2021
John Russ Alejandro
*/


import java.util.Scanner;

public class Alejandro_Char {
	public static void main(String[] args) {
		Scanner char_input = new Scanner(System.in);
		System.out.println("Check CASE! Enter a character? : ");
	//Get char at position 0
		char char_defined = char_input.next().charAt(0);
	//Check got char - boolean
		boolean char_check_uppercase = Character.isUpperCase(char_defined);
		boolean char_check_lowercase = Character.isLowerCase(char_defined);
	//If uppercase is true
		if (char_check_uppercase == true)
		{
			System.out.println(char_defined + " is UPPER CASE.");
		}
	//If lowercase is true
		else if (char_check_lowercase == true)
		{
			System.out.println(char_defined + " is LOWER CASE.");
		}
	//Else Invalid - restart program
		else
		{
			System.out.println("Invalid Character. \nPlease try again. \nThe program is restarting in 5 seconds.");
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
