/*Q6. Write a Java program to check whether a character is alphabetic or not.
*/
import java.util.*;
public class Alphabet{
	public static void main(String x[]){
	System.out.println("enter a charactor");
	Scanner sc = new Scanner(System.in);
	int ch = sc.next().charAt(0);
	
	if (ch <=90 && ch>=65 || ch <=121  && ch >=97 ){
		System.out.println("you entered a alphabet");
	}else
	{
		System.out.println("not a alphabet");
	}
}
}