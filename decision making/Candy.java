/*
Q32. There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR never remains empty as when the last k candies are left. JAR is refilled with new candies in such a way that JAR gets full.
*/
import java.util.*;
public class Candy{
	public static void main(String x[]){
	System.out.println("measuring candies");
	Scanner sc =new Scanner(System.in);
	System.out.println("the size of jar is 32");
	int n = 32;
	int m=32;
	System.out.println("remaining candies are 32");
	System.out.println("enter the number of  candies you need");
	int w = sc.nextInt();
	int k = m - w;
	if (w<m && k>0 ){
		System.out.println("the candy remaining are : " + (m - w));
	
	}else 
		System.out.println("can't get candy's");
		

	
	

		
}
}