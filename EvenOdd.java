/*Q31. Write a Java program to check whether a number is even or odd. 
*/
import java.util.*;
public class EvenOdd{
	public static void main(String x[]){
	Scanner kk = new Scanner(System.in);
	System.out.println("enter a number");
	int num = kk.nextInt();
	String  dec = num % 2 == 0 ? "even" : "odd";
	System.out.println(dec);

}
}