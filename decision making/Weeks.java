/*Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.
*/
import java.util.*;
public class Weeks{
	public static void main(String x[])
	{
		System.out.println("printing days of weeks");
//----------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		
		if (week >=1 && week <=7){
			if (week == 1)
				System.out.println("sunday");
			else if (week == 2)
				System.out.println("monday");
			else if (week == 3)
				System.out.println("tueday");
			else if (week == 4)
				System.out.println("wednesday");
			else if (week == 5)
				System.out.println("thurday");
			else if (week == 6)
				System.out.println("friday");
			else
				System.out.println("saturday");
		}
		else
				System.out.println("enter correct day");			 
	}
}