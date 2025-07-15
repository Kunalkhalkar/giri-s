/*all arithmetic operation on given input value*/
import java.util.*;
public class Arithmatic{
	public static void main(String x[]){
	Scanner kk=new Scanner(System.in);
	System.out.println("enter value of  w");
	int w = kk.nextInt();
	System.out.println("enter value of  w");
	int y = kk.nextInt();
	int add = w+y;
	int sub = w-y;
	int mul= w*y;
	int div = w/y;
	int rem = w%y;
	System.out.println("addition is = "+add);
	System.out.println("substraction is ="+sub);
	System.out.println("multiplication is ="+mul);
	System.out.println("division is ="+div);
	System.out.println("remainder is ="+rem);


}
}