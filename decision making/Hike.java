/*Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/
import java.util.*;
public class Hike{
	public static void main(String x[]){
	System.out.println("enter basic salary of employee");
	Scanner sc = new Scanner(System.in);
	int bs= sc.nextInt();
	System.out.println("enter year of experience of employee");
	int ex= sc.nextInt();
	System.out.println("enter performance rating of employee 1-5");
	int pr = sc.nextInt();
	double finsal;
	if (pr >=4 && ex >5 ){
		finsal = bs + (bs * 20) /100;
		System.out.println("emplyee get 20% Final salary is = "+ finsal);
	}else if (pr >=4 && ex >5 ){
		finsal = bs + (bs * 10) /100;
		System.out.println("emplyee get 10% Final salary is = " +finsal);
	}else if (ex >5 ){
		finsal = bs + (bs * 5) /100;
		System.out.println("emplyee get 5% Final salary is = "+ finsal);
	}else {
		System.out.println("can not get Hike");
	}
}
}