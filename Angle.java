public class Angle {
	public static void main (String x[]){
		System.out.println("finding third angle from other two sides of triangle");
		int ang1 = Integer.parseInt(x[0]);
		int ang2 = Integer.parseInt(x[1]);
		
		int ang3 = -(ang1 + ang2 - 180);
		System.out.println("third angle is : "+ ang3);
}
}
