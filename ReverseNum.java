/*Write a Java program to reverse a number without using loop.
Input a number: 123 Reverse number: 321*/

import java.util.*;
public class ReverseNum{
public static void main(String x[]){
	Scanner kk = new Scanner(System.in);
	System.out.println("enter number to reverse");
	int rev = kk.nextInt();
	
	int unit = rev %10; //143 ------- unit= 3
	int ten1= rev /10; // 14.3 -------14 

	int ten = ten1%10; // 14 ---------ten= 4
	
	int hundred1 = ten1/10; //----14/10 = 1.5----1 
	int hundred = hundred1 % 10;
	
	int j = unit * 100,  k= ten*10, l = hundred, fine = j+k+l;
	System.out.println(fine);
}
}
