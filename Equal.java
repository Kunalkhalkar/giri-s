//Q43. Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;
public class Equal{

public static void main(String x[]){
		System.out.println("enter two numbers to check they are equal or not");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String dec = num1 == num2 ?"numbers are equal ": "numbers are different";
		System.out.println(dec);	
}

}