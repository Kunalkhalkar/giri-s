/*Q15. Write a java program to find the minimum between two numbers.*/
import java.util.*;
public class min{
	public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	int num = sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println("numbers are a : "+ num + " b : " + num2 );
	if (num < num2){
	System.out.println("a is minimum");
	}else if(num > num2){	
	System.out.println("b is minimum");
	}else{
	System.out.println("numbers are same ");
	}
}
}