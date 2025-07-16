/*Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
*/
import java.util.*;
public class ClassifyTriangle{
	public static void main(String x[]){
	System.out.println("enter first angle value");
	Scanner kk = new Scanner(System.in);
	int ang1 = kk.nextInt();
	System.out.println("enter second angle value");
	int ang2 = kk.nextInt();
	System.out.println("enter third angle value");
	int ang3 = kk.nextInt();
	
	String IsTriangle = ang1 + ang2 +ang3 ==180 ? "is a triangle " : "not a triangle" ;
	String equilateral = ang1 == ang2 && ang2 == ang3 ? "triangle is equilateral " : "not a equilateral ";
	String isoscale = ang1 == ang2  || ang1 == ang3 ||ang2 == ang3 ? "triangle is isoscale " : "not a isoscale " ; 
	String scalene = ang1 !=ang2 && ang1 !=ang3 && ang2 !=ang3 ? "triangle is scalene" : " not a scalene";

	System.out.println("\n");
	System.out.println(IsTriangle + "\n");
	System.out.println(equilateral + "\n");
	System.out.println(isoscale + "\n");
	System.out.println(scalene + "\n");


	
}
}