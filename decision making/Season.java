/*Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
Spring = march, April, may;
        	*/
import java.util.*;
public class Season{
	public static void main(String x[])
		{
	System.out.println("enter the number 1 - 12 to display season");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	
	if (month >=1 && month <=3){
		System.out.println("Season is winter");
	}else if (month >=4 && month <=6){
		System.out.println("Season is Spring");
	}else if (month >=7 && month <=9){
		System.out.println("Season is Summer");
	}else if (month >=10 && month <=12){
		System.out.println("Season is Autumn");
	}else
		{
			System.out.println("!! ENTER CORRECT MONTH !!");
		}
	
}
}
