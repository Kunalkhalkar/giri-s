/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
*/
import java.util.*;
public class Numbers{
	public static void main(String x[]){
	System.out.println("Enter two numbers");
	Scanner sc = new Scanner(System.in);
	int num1=sc.nextInt();
	int num2= sc.nextInt();
	if  (num1 == num2){
		System.out.println("both numbers are same");
}else if (num1 >num2){
	System.out.println("num1 is greater");
}else {
		System.out.println("num2 is greater");
	}

}
}