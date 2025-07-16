/*Q30. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
Input: 15
Output: Multiple of both 3 and 5
*/
import java.util.*;
public class AndOP{
	public static void main(String x[]){
	System.out.println("enter number");
	Scanner kk = new Scanner(System.in);
	int s = kk.nextInt();
	int one = s % 3;
	
	int two = s % 5; 
	String str = one ==0 && two ==0 ? "divible" : "not divisible"; 
	System.out.println(str);
}
}