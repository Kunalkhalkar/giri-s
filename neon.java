/*Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
import java.util.*;
public class neon{
	public static void main(String x[]){
	System.out.println("enter the number to check number is neon or not");
	Scanner kk = new Scanner (System.in);
	int neons = kk.nextInt();
	int check = neons * neons;
	int num = check % 10; // 81 ---- 1
	int num1 = check/10; // 8.1 ---- 8
	int num3 = num + num1;
	String result = neons == num3 ? "number is neon" : "number is not neon";
	 System.out.println(result);
}
}