/*Q22. Write a java program to check whether a number is palindrome or not. 
*/

import java.util.*;
public class Palindrome{
	public static void main(String x[]){
	System.out.println("Enter a number");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int FirstDigit = (num % 10)*100;
	int Div = (num /10); // 143----- 143 / 10 =14.3--14
	int SecondDigit =(Div % 10)*10; 
	int ThirdDigit = Div /10;
	
	int pal= FirstDigit + SecondDigit+ ThirdDigit;
	
	if (num == pal){
	System.out.println("number is palindrome");
	}else{
		System.out.println("number is not palindrome");

	}
	}
}