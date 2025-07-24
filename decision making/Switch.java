/*Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
*/
import java.util.*;
public class Switch{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	
	if (month <=12 && month >=1 )
	{
		switch (month)	
		{
			case 1,3,5,7,8,10,12: 
				System.out.println(31 + " days");
				break;
			case 2, 4, 6, 9, 11: 
				if (month == 2)
				System.out.println(29 + " days");
				else 
				System.out.println(30 + " days");
				break;

		}
	}else {
			System.out.println("enter valid month");
	}
	
}
}