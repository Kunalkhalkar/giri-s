/*Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
*/
import java.util.*;
public class Grades{
	public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the remark");
	char grade = sc.next().charAt(0);
	
	switch (grade){
			case 'A', 'a':
				System.out.println("Excellent");
				break;
			case 'B', 'b':
				System.out.println("Good");
				break;
			case 'C', 'c':
				System.out.println("Average");
				break;
			case 'D','d':
				System.out.println("Poor");
				break;
			case 'F', 'f':
				System.out.println("Fail");
				break;
			default :
				System.out.println("Invalid Grade");
				}

}
}