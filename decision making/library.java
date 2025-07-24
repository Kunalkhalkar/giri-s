/*Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/
import java.util.*;
public class library{
	public static void main(String x[]){
	System.out.println("enter the delay in days");
	Scanner sc = new Scanner(System.in);
	int days = sc.nextInt();
	int fine;
	int membership= 1;

	if (days <=5 && membership==1){
		fine = days *2;
		System.out.println("your member ship is "+membership +" and fine is : "+fine);

	}else if(days <10 && membership== 1){
		fine = days * 3;
		System.out.println("your member ship is "+membership +" and fine is : " +fine);

	}else if(days <30 && membership== 1){
		fine = days * 5;
		System.out.println("your member ship is "+membership +" and fine is : " + fine);

	}else {
		membership =0;
		fine =500;
		System.out.println("your menmber ship is canceled and fine is : "+ fine);
	}
	
}
}