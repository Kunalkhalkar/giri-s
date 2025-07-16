/*Q38. Write a Java program to check whether a year is leap year or not.
*/

import java.util.*;
public class Leap{
	public static void main(String [] args){
	System.out.println("Enter a year ");
	Scanner kk = new Scanner(System.in);
	int year = kk.nextInt();
	String str = year %4 == 0 ? "year is leap":"year is  not leap";
	System.out.println(str);
}
}