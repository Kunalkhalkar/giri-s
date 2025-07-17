/*Q55. Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"
"Even"
"Div by 3"
"None"
*/
import java.util.*;
public class Parity{
	public static void main(String x[]){
	System.out.println("Enter the value");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String str = num % 10 == 1 ? "Even & Div by 3" : num / 2 == 0 ? "Even" : num /3 == 0 ? "Div by 3" : "None";
	System.out.println(str);
}
}