/*Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.*/
import java.util.*;
public class Switch2{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter operator value");
		int opr = sc.nextInt();
		System.out.println("enter operand value");
		int oprnd = sc.nextInt();
		System.out.print("1. + \n");
		System.out.print("2. - \n");
		System.out.print("3. * \n");
		System.out.print("4. / \n");
		System.out.print("5. % \n");
		System.out.println("enter operation value");
		int operation = sc.nextInt();
		
		switch(operation){
				case 1:
					int result = opr + oprnd;
					System.out.println(result );
					break;
				case 2:
					result = opr - oprnd;
					System.out.println(result );
					break;
				case 3:
					 result = opr * oprnd;
					System.out.println(result );
					break;
				case 4:
					 result = opr / oprnd;
					System.out.println(result );
					break;
				case 5:
					result = opr % oprnd; 
					System.out.println(result);
					break;
				default:
					System.out.println("Invalid");
		
		}

		

	}
}