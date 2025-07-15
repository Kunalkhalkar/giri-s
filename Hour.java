/*converting minutes to hours with minutes*/

public class Hour{
	public static void main(String x[]){
	int min = Integer.parseInt(x[0]);
/*---------------------------------------------------------------*/
	int hr = min/60;
	int mins = min  % 60;
/*---------------------------------------------------------------*/
	System.out.println("hours "+hr );
	System.out.println(mins + " minutes ");
}
}