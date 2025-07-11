/*convert second in minutes and hours */
public class Convert{
	public static void main(String x[]){
	System.out.println("this is program used to covert second to hours and minutes");
	int sec = Integer.parseInt(x[0]);
	float minutes =  sec /60 ;
	float hours = minutes / 60;
	System.out.println(minutes +" \n" + hours);
}
}