/*Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation:
 Switch on user choice. Use variables for balance and update accordingly.
*/
import java.util.*;
public class Bank{
	public static void main(String x[]){
	System.out.println("enter what you want to do");
	Scanner sc = new Scanner(System.in);
	System.out.println("1 : Deposit");
	System.out.println("2 : Withdraw");
	System.out.println("3 : Check Balance");
	System.out.println("4 : Exit");
		int select = sc.nextInt();
		int balance = 1000;
	switch(select){
		case 1:
			System.out.println("enter the amount of deposit");
			int deposit = sc.nextInt();
			balance +=deposit;
			System.out.println(balance+ " is your balance");
			break;

		case 2 :
			System.out.println("Enter the amount you want to withdraw");
			int withdraw = sc.nextInt();
			if(balance > withdraw){
			balance -=withdraw;
			System.out.println("withdraw Successfull !! your balance!!" + balance);
			}
			else 
				System.out.println("can't withdraw low balance!!" + balance);
			break;
			
		case 3:
			System.out.println("balance is : "+balance);
			break;
		
		case 4:
			System.out.println("thank u for visit");
		}

}
}