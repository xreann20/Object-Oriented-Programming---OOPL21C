/*
9:24 pm 07/05/2021
John Russ Alejandro
*/


import java.util.Scanner;

public class Alejandro_SFT {
	public static void main(String[] args) {
		Scanner txtmsgs_input = new Scanner(System.in);
		System.out.println("SFT! How many text messages? : ");
		int txtmsgs_number = txtmsgs_input.nextInt();
	//If messages is 0 to 200 print no charge/free
		if(txtmsgs_number>=0 && txtmsgs_number<201)
		{
			System.out.println("The first 200 messages are free, hence no charge incurred.");
		}
	//If messages is greater than 0, compute then print
		else if(txtmsgs_number>200)
		{
			System.out.println("Charge incurred for " + txtmsgs_number + " messages is " + (txtmsgs_number*0.5) + " Pesos");
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
