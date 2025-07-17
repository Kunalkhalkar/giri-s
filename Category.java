/*Q53.Given age, print category:
Teen (13–19)
Adult (20–59)
Senior (60+)
*/
import java.util.*;
public class Category{
	public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the age");
	int age = sc.nextInt();

	String str = age>=60 && age<=110 ? "Senior" : age <59 && age>=20 ? "Adult" : age <= 19 && age > 13 ? "teen " : age<13 ? "kid" : "Enter valid date";  
	System.out.println("the person is : " + str);
	

	}
}