/*
John Russ Alejandro
8:34 pm 28/04/2021
*/
package alejandro_income;
import java.util.*;

public class alejandro_income {
	public static void main(String[] args) {
			
			int user_input_employee, currency_code, euro;
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee Salary Income Calculator :) !");
			System.out.println("Which type of employee do you wish to select ? ");
			System.out.println("[1]:Part Time Employee [2]:Full Time Employee ");
			user_input_employee = sc.nextInt();
		//If its not less than 1 or greater than 2, try again
			if (user_input_employee < 1 || user_input_employee > 2)
			{
			System.out.println("Invalid Choice, please try again.");
			System.exit(0);
			}
			else
			{
			//For Part Time Employee Code
				if (user_input_employee == 1) {
					double hourly_rate, hours_worked, parttime_employee_income;
					Scanner hr = new Scanner(System.in);
					System.out.println("Enter Rate per hour (Php)");
					hourly_rate = hr.nextDouble();
					Scanner hw = new Scanner(System.in);
					System.out.println("Enter Hours Worked (hrs)");
					hours_worked = hw.nextDouble();
					parttime_employee_income = hourly_rate * hours_worked;
					System.out.println("Your Part Time Employee's Income is " + String.format("%.2f",parttime_employee_income) + " Php");
					System.exit(0);
				}
			//For Full Time Employee Code
				else if (user_input_employee == 2) {
					double regular_hours, regular_rate, overtime_hours, overtime_rate;
					Scanner regular_rate_input = new Scanner(System.in);
					System.out.println("Regular Rate per hour (Php)");
					regular_rate = regular_rate_input.nextDouble();
					Scanner regular_hours_worked = new Scanner(System.in);
					System.out.println("Regular Hours worked (hrs)");
					regular_hours = regular_hours_worked.nextDouble();
					Scanner otq = new Scanner(System.in);
					System.out.println("Overtime Hours worked (hrs)");
					overtime_hours = otq.nextDouble();
					//If Overtime Hours worked is not equal to 0, ask for rate, compute then print
						if (overtime_hours != 0) {
							Scanner overtime_rate_input = new Scanner(System.in);
							System.out.println("Overtime Rate per hour (Php)");
							overtime_rate = overtime_rate_input.nextDouble();
							double total_income_overtime = (regular_rate*regular_hours)+(overtime_rate*overtime_hours);
							System.out.println("Your Full Time Employee's Income is " + String.format("%.2f",(total_income_overtime)) + " Php");
							System.exit(0);
					//Else it is 0, then compute regular rates and print
						} else {
							double total_income_nonovertime = (regular_rate*regular_hours);
							System.out.println("Your Full Time Employee's Income is " + String.format("%.2f",(total_income_nonovertime)) + " Php");
							System.exit(0);
						}
				}
			}
	}
}
