/*Q4. Write a Java program to check whether a number is positive , negative or zero.
*/
import java.util.*;
public class Positive{
public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
		
	if(num > 0){
		System.out.println("number is positive");
	}
	else if (num ==0) 
	{
		System.out.println("number is 0");
	}else {
		System.out.println("number is negative");
	}
}
}