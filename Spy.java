/*Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
 
*/

import java.util.*;
public class Spy{
	public  static void main(String x[] ){
	System.out.println("enter the four digit number ");
	Scanner kk = new Scanner(System.in);
	int a = kk.nextInt();
	int  b = a %10; //1412---------2
	int b1 = a /10; //1412 --------141.2----141
	int c = b1 % 10; // 141---- 1
	int c1 = b1/10; //14.1 ----- 14
	int d = c1 % 10; // 14 ---- 4
	int d1 = c1/10; //1.4 ----- 1
	
	int sum = b + d1 + c + d;
	int product = b * d1 * c * d;
	
	String str = sum==product ? "number is spy"	: "number is not spy " ;

	System.out.println("answer = " + str); 
	
}
}
