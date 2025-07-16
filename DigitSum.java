/*Q20. Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6
*/
import java.util.*;
public class  DigitSum{
	public static void main(String x[]){
	System.out.println("enter the value");
	Scanner kk = new Scanner(System.in);

	int k= kk.nextInt();
	int unit =  k % 10; //143 ----3

	int unit1 =  k / 10; // 14.3 ----4
	int ten = unit1 % 10; 

	int ten2 = unit1/10; //1.4 ---- 1 
	int hundered = ten2 % 10; 

	int add = unit + ten + hundered;
	System.out.println(add);
	
	
}
}