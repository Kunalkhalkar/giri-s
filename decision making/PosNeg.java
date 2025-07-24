/*
Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.check the max number using 2 numbers.
*/
import java.util.*;
public class PosNeg{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Check Number is positive , negative or zero.");
		System.out.println("2.Check Number is even or odd.");
		System.out.println("3.check the max number using 2 numbers.");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice){
			case 1:
				System.out.println("enter the number the you want to check");
				int num = sc.nextInt();
				if (num <0){
					System.out.println("number is negative");
				}else if(num==0){
					System.out.println("number is zero");
				}else 
					System.out.println("number is positive");

				break;
				
			case 2: 
				System.out.println("enter the Number to check is even or odd.");
				num = sc.nextInt();
				if(num % 2 == 0){
					System.out.println("number is even");
				}else{
					System.out.println("number is odd");
				}
				
				break;
				
			case 3:
			
				System.out.println("enter the numbers you want to compare");
				num = sc.nextInt();
				int num2 = sc.nextInt();
				
				if (num > num2){
					System.out.println("first number is greater : "+ num);
				}else{
					System.out.println("Second number is greater : "+ num2);
				}
				break;
				
			default :
				System.out.println("Invalid input");
			}
		
}
}