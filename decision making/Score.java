/*Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50.*/
import java.util.*;
public class Score{
	public static void main(String x[]){
	System.out.println("enter the score of student");
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();

	if (marks >= 90){
	System.out.println("Excellent");

	}else if(marks >=75){
	System.out.println("Good");


	}else if (marks >=50){
	System.out.println("Average");

	}else {
	System.out.println("Fail");
	}

}
}