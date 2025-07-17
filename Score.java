/*Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.
*/
import java.util.*;
public class Score{
	public static void main(String x[]){
	Scanner kk = new Scanner(System.in);	
	System.out.println("enter the score of the student");
	int score = kk.nextInt();
	
	String dec = score >= 90 ? "Excellent" : score >=75 ? "Good" : score >=50 ? "Average" : score <50 &&  score >=35  ?  "poor" : "fail"; 
	System.out.println(dec);

}
}