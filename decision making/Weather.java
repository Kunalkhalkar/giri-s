/*Q40. Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/

import java.util.*;
public class Weather{
	public static void main(String x[]){
	System.out.println("enter the tempreture");
	Scanner sc =new Scanner(System.in);
	int temp = sc.nextInt();
	
	if (temp <0){
		System.out.println("Freezing");
	}else if (temp ==0 || temp < 20){
		System.out.println("cold");
	}else if (temp >=20 || temp < 35){
		System.out.println("warm");
	}else if (temp >= 35){
		System.out.println("hot");
	}else {
		System.out.println("Invalid tempreture");
	}
}
}