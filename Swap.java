public class Swap{
	public static void main(String x[]){
	System.out.println("swapping numbers using third variable");
	int a= Integer.parseInt(x[0]);
	int b= Integer.parseInt(x[1]);
	 
	int temp = a;
	a= b;
	b=temp;

	System.out.println("a = "+ a+ " int b = "+ b);
}
}