/*Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.
*/
import java.util.*;
public class CheckChar{
	public static void main(String x[]){
	System.out.println("enter charatctorto check wether it is alphabet, digit or special charactor");	
	Scanner sc =new Scanner(System.in);
	char ch = sc.next().charAt(0);
	
	if (ch >=48 && ch<=57 ){
		System.out.println("you have entered a digit");
		} else if (ch >=65 && ch <=90 || ch >= 97 && ch<=122){
			System.out.println("you have entered a letter");
		}else {
				System.out.println("you have entered special charactor");
			}

}
}