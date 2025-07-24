/*Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
 
*/
import java.util.*;
public class Scholarship{
	public static void main(String x[]){
		System.out.println("enter the marks of student");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		System.out.println("enter the attendance of student");
		int attendance =sc.nextInt();

		if (marks > 80 && attendance > 75){
			System.out.println("STUDENT ARE ELIGBLE FOR SCHOLARSHIP");
		}else {
			System.out.println("not eligible for scholarship");
		}
	}
}