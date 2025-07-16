/*Q23. Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4
*/
import java.util.*;
public class Sum{
	public static void main(String x[]){
		System.out.println("Enter a three digit number ");
		Scanner kk = new Scanner(System.in);
		int num = kk.nextInt();
		int a = num % 10;
		int b = num / 100;
		int c= a+b;
		System.out.println("first number is = "+ b + " last number is = " + a + " addition of both number Is = " + c);

}
}