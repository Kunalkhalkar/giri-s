/*Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/
import java.util.*;
public class Mob{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number of minutes in a month");
	int min = sc.nextInt();
	double minBill = 199;
	if (min <=100){
		System.out.println("bill is : "+ minBill);
	}else if (min> 100 && min<=300){
		
		minBill = minBill + min;
		System.out.println("bill is : "+ minBill);
	}else if (min> 300 && min<=500){
		
		minBill = minBill + (min * 1.5);
		System.out.println("bill is : "+ minBill);
	}else if (min> 100 && min<300){
		
		minBill = minBill + (min * 2);
		System.out.println("bill is : "+ minBill);
	}else {
		System.out.println(minBill);
}

}
}