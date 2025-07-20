/*Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
*/
import java.util.*;
public class Result{
	public static void main(String x[]){
	System.out.println("enter the marks");
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	if(marks > 40){
	System.out.println("pass");
}else {
	System.out.println("Fail");
	}
}
}