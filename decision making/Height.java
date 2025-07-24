/*Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
                       PerHeight < 150.0  : The person is Dwarf.
                                	 
                    	PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
                                	
                    	 PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
 
                    	Test Data : 135
 
                    	Expected Output :
 
                    	The person is Dwarf.
*/
import java.util.*;
public class Height{
 public static void main(String x[]){
	System.out.println("enter the height of user");
	Scanner sc = new Scanner(System.in);
	float height = sc.nextFloat();
	if(height> 165.0)
		{	
			System.out.println("person is taller ");	
		}
	else if(height >= 150.0 && height < 165.0)
		{	
			System.out.println("person is avrage heighted ");	
		}
	else if(height< 150.0)
		{	
			System.out.println("person is Dwarf ");	
		}
	else {
			System.out.println("enter possible height ");	
	
}

	}
}