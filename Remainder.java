/*Q29. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/
import java.util.*;
public class Remainder{
	public static void main(String x[]){
	Scanner kk = new Scanner(System.in);
	System.out.print("Enter the value of dividend ");
	int dividend = kk.nextInt();
	System.out.print("Enter the value of diviser ");
	int divisor = kk.nextInt();
	int quotient = dividend / divisor;
	int remainder =dividend %divisor;
	
	System.out.println("Quotient is = "+quotient+ " remainder = " + remainder);
}
}