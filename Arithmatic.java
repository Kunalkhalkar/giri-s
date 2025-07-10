public class Arithmatic{
	public static void main(String x[]){
		System.out.println("performing all arithmetic operations /,*,-,+,");
		System.out.println("----------------------------------------------------");
		int a= Integer.parseInt(x[0]);
		int b= Integer.parseInt(x[1]);
		
		int c= a/b, d=a*b, e=a-b, f=a+b;
		System.out.println("arithmatic opration a/b is "+ c+ "\n a*b is " +d+ "\n a-b is " +e+ "\n a+b is "+ f+"." );
	}
	

	}