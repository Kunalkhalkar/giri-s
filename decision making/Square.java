/*Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square*/
import java.util.*;
public class Square{
	public static void main(String x[]){
	System.out.println("Enter the number ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	double sqrt = Math.sqrt(num);
	

	if (sqrt ==(int)sqrt ){
	System.out.println("perfect square root");
		}else {
		System.out.println("not a perfect square root ");

	}
	}
}