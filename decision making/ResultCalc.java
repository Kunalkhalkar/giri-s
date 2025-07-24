/*Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F
*/
import java.util.*;
public class ResultCalc{
	public static void main(String x[]){
	System.out.println("enter the marks of student");
	Scanner sc =new Scanner(System.in);
	int marks = sc.nextInt();
	if (marks >= 90)
		System.out.println("Grade A");
	else if (marks >=80)
		System.out.println("Grade B");
	else if(marks>=70)
		System.out.println("Grade C");
	else if(marks >60)
		System.out.println("Grade D");
	else if (marks >=40)
		System.out.println("Grade E");
	else if(marks <40)
		System.out.println("Grade F");
	else
		System.out.println("enter valid data");



	
}
}