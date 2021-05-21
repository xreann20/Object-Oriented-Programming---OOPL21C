/*
9:28 pm 07/05/2021
John Russ Alejandro
*/


import java.util.Scanner;



public class Alejandro_TNP {

	public static void main(String[] args) {
		System.out.println("START PROGRAM! - Telepono ng Pilipino :) !");
		System.out.println("What day the call was made? ");
		System.out.println("[1]:Monday \n[2]:Tuesday \n[3]:Wednesday \n[4]:Thursday \n[5]:Friday \n[6]:Weekends");
		Scanner day_call_was_made_input = new Scanner(System.in);
		int day_call_was_made = day_call_was_made_input.nextInt();
	//If input is days of the week as defined
		if(day_call_was_made>0 && day_call_was_made<7)
		{
			System.out.println("What time the call started? (24 hours) ");
			Scanner time_call_was_made_input = new Scanner(System.in);
			int time_call_was_made = time_call_was_made_input.nextInt();
		//If input time is correct
			if(time_call_was_made>=0 && time_call_was_made<24)
			{
				System.out.println("What was the duration of the call? (mins)");
				Scanner duration_call_input = new Scanner(System.in);
				int duration_call = duration_call_input.nextInt();
				if(duration_call>0)
				{
					double weekend_and_nonbusy_rate = 1.50;
					double weekdays_busy_rate = 2.50;
				//If it is weekends
					if(day_call_was_made == 6)
					{
						System.out.println("The bill for " + duration_call + " minutes of call on hour " + time_call_was_made + " of Day " + day_call_was_made + " of the week is " + (duration_call*weekend_and_nonbusy_rate) + " pesos.");
					}
				//Else = weekdays
					else
					{
					//If call is from 6AM to 6PM
						if(time_call_was_made>5 && time_call_was_made<19)
						{
							System.out.println("The bill for " + duration_call + " minutes of call on hour " + time_call_was_made + " of Day " + day_call_was_made +  " of the week is " + (duration_call*weekdays_busy_rate) + " pesos.");
						}
					//Else = not 6AM to 6PM = weekend rate/nonbusy rate
						else
						{
							System.out.println("The bill for " + duration_call + " minutes of call on hour " + time_call_was_made + " of Day " + day_call_was_made + " of the week is " + (duration_call*weekend_and_nonbusy_rate) + " pesos.");
						}
					}
				}
			//ELSE ERRORS - try again - program restart
				else
				{
					System.out.println("Duration Input is less than 0. \nPlease try again. \nThe program is restarting in 5 seconds.");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					main(args);
				}
			}
			else
			{
				System.out.println("Invalid Input there are only 24 hrs in a day, please use 0-23. \nPlease try again. \nThe program is restarting in 5 seconds.");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				main(args);
			}
		}
		else
		{
			System.out.println("Invalid Input, please refer to the choices. \nPlease try again. \nThe program is restarting in 5 seconds.");
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
