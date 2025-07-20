/*Q2. Write a Java program to check whether a triangle is valid or not.*/
import java.util.*;
public class Triangles{
	public static void main(String x[]){
	System.out.println("enter the first angle of triangle");
	Scanner sc = new Scanner(System.in);
	int ang1 = sc.nextInt();
	System.out.println("enter the second angle of triangle");
	int ang2 = sc.nextInt();
	System.out.println("enter the third angle of triangle");
	int ang3 = sc.nextInt();
	
	int add = ang1 + ang2 + ang3;
	if(add >180 || add <180){
		System.out.println("triangle is not valid");
	
	}else {
		System.out.println("triangle is valid");
	}

}
}