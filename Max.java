/*Q41. Write a java program to find maximum between three numbers.*/
import java.util.*;
public class Max{
	public static void main(String x[]){	
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		String Decide = num1 > num2 && num1 > num2 ? "num1 is greater" : "num1 is smaller " ;
		String Decide1 = num2 > num1 && num2 > num3 ? "num2 is greater" : "num2 is smaller " ;
		String Decide2 = num3 > num1 && num3 > num2 ? "num3 is greater" : "num3 is smaller " ;
		
	System.out.println();
		System.out.println(Decide);
	System.out.println();
		System.out.println(Decide1);
	System.out.println();
		System.out.println(Decide2);
	System.out.println();


	}
}