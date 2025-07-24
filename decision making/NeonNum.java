/*Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9. */
import java.util.*;
public class NeonNum{
	public static void main(String x[]){
		System.out.println("enter a number to check neon number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int square = num * num;
		int digit = square %10;
		int digit2 = square / 10;//  81/10----8.1---8
		int add = digit +digit2;
		if (num == add){
			System.out.println("number is neon");
		}else {
			System.out.println("number is not a neon");
		}
		
		}
}