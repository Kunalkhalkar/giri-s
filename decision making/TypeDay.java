
import java.util.*;
public class TypeDay{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);	
	System.out.println("1. monday");
	System.out.println("2. tueday");
	System.out.println("3. wednesday");
	System.out.println("4. thursday");
	System.out.println("5. friday");
	System.out.println("6. saturday");
	System.out.println("7. sunday");
System.out.println("---------------------------------------------------------------------------");
	System.out.println("enter day");
	int day = sc.nextInt();
	
	switch(day){
		case 1,2,3,4,5 :
		System.out.println("week days");
		break;
	
		case 6,7:
		System.out.println("Weekend");
		break;
		default:
		System.out.println("enter valid data");
	}

}
}