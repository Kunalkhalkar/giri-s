public class Square{
	public static void main(String x[]){
	int  digit = Integer.parseInt(x[0]);
	double calSquare = Math.pow(digit, 2);
	double calsqrt = Math.sqrt(digit);
	System.out.println("Square is : "+calSquare +"\n
square root is : "+ calsqrt);
	}
}