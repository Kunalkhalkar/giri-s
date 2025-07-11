/*write a java program to calculate simple interest SI = (p*r*t)/100 */

public class SI{
	public static void main(String x[] ){
	System.out.println("this is the program written to calculate Simple Interest");
	
	int principleA = Integer.parseInt(x[0]);
	float rateI = Float.parseFloat(x[1]);
	float timeY = Float.parseFloat(x[2]);
	float simpleI = (principleA * rateI * timeY)/100;
	System.out.println( simpleI);
	System.out.println( simpleI + principleA);

}
	}