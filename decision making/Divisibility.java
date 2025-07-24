/*Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.
*/
import java.util.*;
public class Divisibility{
	public static void main(String x[]){
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	if (num % 5 == 0 && num % 11 == 0){
		System.out.println("number is divisible by 5 & 11");
	}else
	{
	System.out.println("not divisible by both numbers");
	}
	
	}

	
}