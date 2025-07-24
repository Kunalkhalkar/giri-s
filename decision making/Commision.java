/*Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.

*/

import java.util.*;
public class Commision{
	public static void main(String x[]){
	System.out.println("enter the sales amount");	
	Scanner sc = new Scanner(System.in);
	int amount= sc.nextInt();
	double result;
	
	if (amount <= 5000 && amount > 0){
		result = (amount * 2)/100;
		System.out.println("Commision is "+ result);
		}

		else if (amount >= 10000){
		result =  (amount * 10)/100;
		System.out.println("Commision is "+ result);
		}

		else if (amount >= 5001 && amount <10000){
		result = (amount * 5)/100;
		System.out.println("Commision is "+ result);
		}else {
			System.out.println("Invalid input");
		}
}	
}