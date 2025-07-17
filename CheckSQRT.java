/*Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
*/
import java.util.*;
public class CheckSQRT{
public static void main(String x[]){
	System.out.println("enter the value");
	Scanner sc = new Scanner(System.in);
	int val = sc.nextInt();
	
	double SquareRT = Math.sqrt(val);
	String str = (SquareRT == (int) SquareRT) ? "is a perfect square" : "not a perfect Square";
	System.out.println(str);
}
	
}
