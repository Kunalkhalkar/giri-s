//Q45. Write a java program to find the minimum between two numbers. 
import java.util.*;
public class Min{
	public static void main(String x[]){
	System.out.println("enter first number");
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	System.out.println("enter second number");
	int b = sc.nextInt();
	
	String Str = a>b ? "a is bigger" : "b is bigger " ; 
	System.out.println(Str);
}
}