/*Q54.Given a number 1–7, print the day name.*/
import java.util.*;
public class Days{
	public static void main(String x[]){
	System.out.println("Enter the number between 1 - 7");	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String day= num == 1 ? "sunday" : num == 2 ? "monday" : num == 3  ? "tuesday" : num ==4  ? "wednesday" : num == 5 ? "thursday" : num == 6 ? "Friday" : num == 7 ? "Saturday" : "enter valid data";
System.out.println("the days is : " + day);  
}
}