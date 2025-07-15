public class ConvertMtoKM{
	public static void main(String x[]){
	System.out.println("converting the centimeters to meters");
	int cent= Integer.parseInt(x[0]);
	float m = cent/100;
	float km=  m/10;
	System.out.println("meter is = "+ m+"\nkm is = "+km); 
}
}