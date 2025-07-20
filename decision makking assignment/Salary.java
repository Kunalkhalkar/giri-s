/* Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
     Basic Salary <= 10000 : HRA = 20%, DA = 80%
     Basic Salary <= 20000 : HRA = 25%, DA = 90%
     Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.*;
public class Salary{
	public static void main(String x[]){
	System.out.println("enter basic salary of employee");
	Scanner sc = new Scanner(System.in);
	int base = sc.nextInt();
	
	if (base < 10000 && base > 0){
			System.out.println("base salary is : "+base);
			int hra = base *20/100;
			int da= base * 80 / 100;
			int total = da + hra+ base ;
			System.out.println("Total salary is : "+total);

		}else if (base < 20000 && base > 10001){
			System.out.println("base salary is : "+base);
			int hra1 = base *25/100;
			int da1= base * 90 / 100;
			int total1 = da1 + hra1+ base ;
			System.out.println("Total salary is : "+total1);
		}else {
			System.out.println("base salary is : "+base);
			int hra2 = base *30/100;
			int da2= base * 95 / 100;
			int total2 = da2 + hra2+ base ;
			System.out.println("Total salary is : "+total2);
		

	
		}


}
}