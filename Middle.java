/*Q52. Print the middle value among 3 distinct integers.*/
import java.util.*;
public class Middle{
 public static void main(String x[]){
	System.out.println("enter the three digit integer");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int mid = num % 10;	//143 %10 ------ 3	
	int mid2 = num /10 ;  // 143 /10 ------------14
	int mid1 =mid2%10; // 14 %10 -------------4
	System.out.println(mid1);
	
	
}
}