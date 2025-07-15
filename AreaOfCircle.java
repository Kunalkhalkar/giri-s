import java.util.*;
public class AreaOfCircle{
	public static void main(String x[]){

	Scanner kk = new Scanner(System.in);
	System.out.println("enter the value of radius");	
	int radius = kk.nextInt();
	double Area = 3.14f * radius *radius;
	double circum = 2 * 3.14f * radius ;
	int diameter = 2 * radius;
	System.out.println("Area is = " +Area);
	System.out.println("cicumference is = "+ circum);
	System.out.println("diam = " + diameter );
}
}