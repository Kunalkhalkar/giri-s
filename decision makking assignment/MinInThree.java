/*Q16. Write a java program to find a minimum between three numbers.
*/
import java.util.*;
public class MinInThree{
	public static void main(String x[]){
		System.out.println("enter three numbers");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	if (n1 < n2 && n1< n3){
	System.out.println("n1 is minimum");
	}else if (n2 < n1 && n2< n3){
	System.out.println("n2 is minimum");
	}else {
	System.out.println("n3 is minimum");

		}

	}
}