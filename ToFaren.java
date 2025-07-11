public class ToFaren{
	public static void main(String x[]){
	float cel = Float.parseFloat(x[0]);
	float faren = (cel * 9 / 5) + 32;
	System.out.println("celcious to farenheit = "+faren ); 

	}
}