/*
Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming
*/
import java.util.*;
public class months{
public static void main(String x[])
{
	System.out.println("enter the number of month");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	
	if (month < 13 && month >=1 && month !=2){
		if(month <= 7 && month % 2 !=0)
			System.out.println("month is having 31 days");
		else if(month !=2 && month <7){
			System.out.println("month is having 30 days");}
		
		else if (month >=7 && month % 2 == 0)
			System.out.println("month is having 31 days");
		else if (month >=7)
			System.out.println("month is having 30 days");
		else
			System.out.println("error");

	}
		else if(month == 2)
			System.out.println("month is having 28 days");
		else 
			System.out.println("month is incorrect");
}
}