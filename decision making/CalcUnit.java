/*Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.*/
import java.util.*;
public class CalcUnit{
	public static void main(String x[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number of units");
	int unit = sc.nextInt();
	if  (unit <=50 ){
		double bill = (unit*0.50);
		double finalbill = bill *20 /100;
		System.out.println(finalbill + bill);
		
	}else if (unit <=100 ){
		double bill = (unit*0.75);
		double finalbill = bill *20 /100;
		System.out.println(finalbill + bill);
		
	}else if(unit <=150 ){
		double bill = (unit*1.20);
		double finalbill = bill *20 /100;
		System.out.println((finalbill + bill));
		
	}else if(unit <=250 ){
		double bill = (unit*1.50);
		double finalbill = bill *20 /100;
		System.out.println(finalbill + bill);
		
	}else 
		System.out.println("enter the valid number of units");
}
}