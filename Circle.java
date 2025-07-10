/*Write a java program to enter radius of a circle and find its diameter,area and circumference.*/

public class Circle{
	public static void main(String x[]){
	System.out.println("printing Diameter , Radius , Circumference of circle");
	int Radius = Integer.parseInt(x[0]) ;
	int Diameter = 2 * Radius;
	float Circumference = 3.14f * 2 * Radius; 
	float Area = 3.14f * Radius * Radius;
		System.out.println("Radius of circle = "+ Radius + "\nDiameter is = "+ Diameter +"\nCircumference is = "+ Circumference+" \nArea is = "+Area);

}
}