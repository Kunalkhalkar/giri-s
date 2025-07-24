/*
Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4,Division
*/
import java.util.*;
public class calculator{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	int choice = sc.nextInt();
		System.out.println("enter the operator and operand");
		int operator = sc.nextInt(), operand =sc.nextInt();
	switch(choice){
		System.out.println("your choice is " +choice);
		case 1:
			int result = operator + operand;
			System.out.println("result is : "+result); 
			break;
		case 2:
			 result = operator - operand;
			System.out.println("result is : "+result); 
			break;
		case 3:
			 result = operator * operand;
			System.out.println("result is : "+result); 
			break;
		case 4:
			 result = operator / operand;
			System.out.println("result is : "+result); 
			break;
		default: 
			System.out.println("Invalid Choice");
		 
		}
}
}