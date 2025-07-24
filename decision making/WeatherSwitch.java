/*
Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation:
 Simple switch with four cases and default for invalid input.
*/
import java.util.*;
public class WeatherSwitch{
	public static void main(String x[]){
/*
		System.out.println("1: Spring");
		System.out.println("2: Summer");
		System.out.println("3: Autumn");
		System.out.println("4: Winter");
*/
	System.out.println("enter the number to know season ");
	Scanner sc = new Scanner(System.in);
	int season = sc.nextInt();

		switch(season)
			{
				case 1:
					System.out.println("spring");
				break;
				case 2:
					System.out.println("Summer");
				break;
				case 3:
					System.out.println("Autumn");
				break;
				case 4:
					System.out.println("Winter");
				break;
				default :
					System.out.println("you enter wrong choice");
			}
}
}