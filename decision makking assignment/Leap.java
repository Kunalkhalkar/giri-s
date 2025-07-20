/*Q8. Write a Java program to check whether a year is a leap year or not.
*/
import java.util.*;
public class Leap{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a year");
	int year = sc.nextInt();
	if (year % 4 == 0){
	
		System.out.println("is a leap year");	

	}else{
	System.out.println("Year is not  a leap");
}
}
}