//John Russ Alejandro
//9:23 am 23/04/2021
package alejandro_conversion;
import java.util.*;
import java.text.DecimalFormat;

public class alejandro_conversion {
	public static void main(String[] args) {
		 
		double amount, dollar, code, euro;
		DecimalFormat f = new DecimalFormat("##.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Convert USD and Euros :) !");
		System.out.println("Which currency do you want to convert ? ");
		System.out.println("1:USD to Euros \t2:Euros to USD ");
		code = sc.nextInt();
	// If its not 1 or 2 - print Invalid Input then terminate else proceed
		if (code == (1|2))
		{
		System.out.println("Invalid input");
		System.exit(0);
		}
		else {
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextDouble();
	// Code 1 - For USD to Euros
		if (code == 1) {
			euro = amount * 0.83;
			System.out.println("Your " + amount + " $ is : " + f.format(euro) + " €");
	// Code 2 - For Euros to USD
		} else if (code == 2) {
			dollar = amount * 1.20;
			System.out.println("Your " + amount + " € is : " + f.format(dollar) + " $");
		}
		}
	}
}
