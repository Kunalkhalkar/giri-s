/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/
import java.util.*;
public class Catogory{
	public static void main(String x[]){
	System.out.println("enter age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if (age >=1 && age<13 ){
		System.out.println("child");
	}
	else if(age <20){
		System.out.println("teen");
	}
	else if (age <30){
		System.out.println("adult");	
	}
	else 
}	
}