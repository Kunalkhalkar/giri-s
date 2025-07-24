/*Q23. Write a java program to Check Number Is Spy Number or Not.
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
public class SpyNum{
public static void main(String x[]){
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int FirstDigit = (num % 10);
	int Div = (num /10); // 143----- 143 / 10 =14.3--14
	int SecondDigit =(Div % 10); 
	int ThirdDigit = Div /10;
	
	int pal= FirstDigit + SecondDigit+ ThirdDigit;
	int mult = FirstDigit * SecondDigit* ThirdDigit;
	
	if (mult == pal){
	System.out.println("number is Spy");
	}else{
		System.out.println("number is not Spy");

	}

	
}

}