/*Q1. Write a Java program to check whether a number is even or odd.*/

import java.util.*;
public class EvenOdd{
	public  static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check even or odd");
	int num = sc.nextInt();
	if (num % 2 == 0){
		System.out.println("number is even");
}else {
		System.out.println("number is odd");
	}
}
}