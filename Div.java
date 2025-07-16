/*Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not.*/

import java.util.*;
public class  Div{
public static void main(String x[]) {
	System.out.println("Enter a number check its divisibility with 5 nd 11");
	Scanner sc = new Scanner(System.in);
	int y = sc.nextInt();
	
	String decision = y % 5 ==0 && y % 11 ==0 ? "number is divisible" : "number is not divisible";
	System.out.println(decision);


}
}