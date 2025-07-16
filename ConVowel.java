/*Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.*/
import java.util.*;
public class ConVowel{
	public static void main(String x[]){
		System.out.println("Enter a alphabet to decide whether it is vowel or consonant");
	Scanner kk = new Scanner(System.in);
	char ch = kk.next().charAt(0);
	String dec = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? "vowel" : " consonant ";
	System.out.println("character is : "+ ch +", it is a : " +dec);
	}
}