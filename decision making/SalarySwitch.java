/*Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation:
 Use switch on the level number and print the salary range.*/

import java.util.*;
public class SalarySwitch{
	public static void main(String x[]){
		System.out.println("1: Junior");
		System.out.println("2: Mid");
		System.out.println("3: Senior ");
		System.out.println("enter the level of employee");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
			switch (level){
				case 1 : 
					System.out.println("20,000 - 30,000");
					break;
				case 2 : 
					System.out.println(" 31,000 - 50,000");
					break;
				case 3 : 
					System.out.println("51,000 - 80,000");
					break;
				default : 
					System.out.println("Invalid level");
				
				}
	}

}

