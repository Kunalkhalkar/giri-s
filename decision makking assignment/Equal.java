/* Q13. Write a java program to accept two integers and check whether they are equal or not.
*/
import java.util.*;
public class Equal{
	public static void main(String x[]){
System.out.println("enter two numbrs");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
	if (num1 == num2){
	System.out.println("both numbers are same");
	}
	else {
	System.out.println("both numbers are different");
		}

}
}