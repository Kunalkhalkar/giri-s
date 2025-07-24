/*Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.*/
import java.util.*;
public class ProfLoss{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter product cost price");
	int cost= sc.nextInt();
	System.out.println("enter product selling price");
	int sell= sc.nextInt();
	if (cost < sell){
		System.out.println("profit");

	}else {
		System.out.println("loss");
	}
}
}