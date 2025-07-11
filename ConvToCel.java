public class ConvToCel{
	public static void main(String x[]){
 		System.out.println("converting to celcious");

		int faren= Integer.parseInt(x[0]);
		double celcious = (faren - 32)  * 5 / 9;
		 
		System.out.println("tempreture in celcious is : "+ celcious);
		System.out.println("tempreture in Farenheit is : "+ faren);

}
}