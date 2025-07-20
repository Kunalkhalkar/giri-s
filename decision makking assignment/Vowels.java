/*Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.*/
import java.util.*;
public class Vowels{
	public static void main(String x[]){
	System.out.println("enter a alphabet");
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

	System.out.println("charactor is vowel");
}else 
{
	System.out.println("charactor is consonent");
}
}
}