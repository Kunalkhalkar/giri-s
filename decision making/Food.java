/*
Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.
*/
import java.util.*;
public class Food{
	public static void main(String x[]){
	System.out.println("1: Burger");
	System.out.println("2: Pizza");
	System.out.println("3: Pasta");
	System.out.println("4: Sandwich");
	
	Scanner sc= new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice){	
		case 1:
			int price = 100;
			System.out.println("burger is ordered " + price);
			break;
		case 2:
			 price = 110;
			System.out.println("Pizza is ordered " + price);
			break;
		case 3:
			 price = 120;
			System.out.println("Pasta is ordered " + price);
			break;
		case 4:
			 price = 90;
			System.out.println("Sandwich is ordered " + price);
			break;
		default :
			System.out.println("Invalid selection");

		}

}
}