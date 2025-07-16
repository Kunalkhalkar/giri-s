//Q18. Write a Java program to convert days to years, month and week.
import java.util.*;
public class DaysCalc{
	public static void main(String x[]){
		Scanner kk= new Scanner(System.in);
		System.out.println("ENTER THE DAYS YOU WANT TO CALCULATE");
		int day= kk.nextInt();
		int month = (day/30);
		double year = month /12;
		double week = day / 7;
	System.out.println(day +" are "+year+", year, "+ month +" months, "+ week +", weeks");
}

}