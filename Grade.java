/*Q51. Print a grade using ternary operators:
90+: A
80–89: B
70–79: C
<70: F
*/
import java.util.*;
public class Grade{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of student");
	int marks = sc.nextInt();
	String str = marks >=90 ? "A" : marks >=80 && marks<=89 ? "B" : marks>=70 && marks <=79 ? "C" : "FAIL";
	System.out.println(str);

}
}