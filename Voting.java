/*Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
*/
import java.util.*;
public class Voting{
	public static void main(String x[]){
	System.out.println("enter your age check eligibility");
	Scanner sc = new Scanner(System.in);
	int age= sc.nextInt();
	
	String Check = age>=18 && age <=65 ? "you are eligible you can apply for voter Id card" : "not eligible for vote" ;
	System.out.println(Check);
}
}