/* Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
*/
import java.util.*;
public class Voting{
	public static void main(String x[]){
	System.out.println("enter age of candidate");
	Scanner sc =new Scanner(System.in);
	int age = sc.nextInt();
	
	if (age>=18 && age<=70){
		System.out.println("you are eligible for voting");
	}
	else {
		System.out.println("You are not eligible");
		}
}
}