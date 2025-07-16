/*Q32. Write a Java program to check whether a triangle is valid or not.
*/
import java.util.*;
public class CheckTriangle{
	public static void main(String x[]){
	System.out.println("enter angle one");
	Scanner kk = new Scanner(System.in);
	int ang1 = kk.nextInt();
	System.out.println("enter angle two");
	int ang2 = kk.nextInt();
	System.out.println("enter angle three");
	int ang3 = kk.nextInt();

	String check = ang1 + ang2 + ang3 ==180 ? "triangle is valid" : "triangle is not valid" ;
	System.out.println(check);
}
}