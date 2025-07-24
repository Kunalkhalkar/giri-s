/*Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display .
Explanation:Switch with cases 1 to 5; default to handl*/

import java.util.*;
public class DigitToWord{
	public static void main(String x[]){
		System.out.println("enter number to convert into word");
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();

		switch(day){
			case 1 :
				System.out.println("one");
				break;
			case 2 :
				System.out.println("two");
				break;
			case 3 :
				System.out.println("three");
				break;
			case 4 :
				System.out.println("four");
				break;
			case 5 :
				System.out.println("five");
				break;
			default:
				System.out.println("invalid number");
					
				}
	}
}