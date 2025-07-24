/* Q11. Write a java program to find a maximum between three numbers.
*/
import java.util.*;
public class Max{
	public static void main(String x[]){
		System.out.println("enter the three numbers");
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
	
		if(one > two && one > three){
			System.out.println("one is greater");
		}else if (one <two && two >three){
			System.out.println("two is greater");
		}else {
			System.out.println("three is greater");
		}

}

}