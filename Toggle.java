/*Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
·        Example: a → A, Z → z.*/
import java.util.*;
public class Toggle{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	char ascii1 = sc.next().charAt(0);
	
	
	int add = ascii1 ;
	int dec = add<=90 ? add +32  : add - 32;
	char ascii2 = (char) dec ;
	System.out.println("toggle charactor is = "+ ascii2);

}
}