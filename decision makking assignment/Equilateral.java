/*Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
*/
import java.util.*;

public class Equilateral{
	public static void main(String x[]){
	System.out.println("enter the first angle of triangle");
	Scanner sc = new Scanner(System.in);
	int ang1= sc.nextInt();
	System.out.println("Enter second angle of triangle");
	int ang2 = sc.nextInt();
	System.out.println("Enter third angle of triangle");
	int ang3 =sc.nextInt();
	
	if (ang1 == ang2 && ang1 == ang3){
		System.out.println("triangle is equilateral");
	}else if (ang1 == ang2 || ang1 == ang3 || ang2 == ang3)
		{System.out.println("triangle is isoscale");
	}else {
		System.out.println("triangle is Scalene");
	}
}
}