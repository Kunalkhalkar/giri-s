/*Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
*/
import java.util.*;
public class ProfLoss{
	public static void main(String x[]){
	Scanner kk = new Scanner(System.in);
	System.out.println("enter cost price");
	int cost = kk.nextInt();
	System.out.println("enter selling price");
	int sell = kk.nextInt();
	System.out.println("cost price is : " +cost + " selling price is :  " + sell);
	String dec = sell > cost ? "we are in profit" : "we are in loss "; 
	System.out.println(dec);
}
}