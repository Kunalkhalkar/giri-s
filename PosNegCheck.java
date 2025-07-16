/*Q34. Write a Java program to check whether a number is positive , negative or zero.
*/
import java.util.*;
public class PosNegCheck{
	public static void main(String x[]){
	System.out.println("Enter a number to check");
	Scanner kk =new Scanner(System.in);
	int y = kk.nextInt();

	String dec = y==0 ? "number is zero" : "number is not a zero";
	String dec2 = y>0 ? "number is positive" : "number is not a positive";
	String dec3 = y<0 ? "number is negative" : "number is not a negativeitive";

	System.out.println(dec);
	System.out.println(dec2);
	System.out.println(dec3);




}
}