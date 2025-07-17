/*Q16. Write a Java program to print the ASCII value of a given character.
*/
import java.util.*;
public class AsciiExtract{

public static void main(String x[]){	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a charactor which you want ascii value");
char ch=sc.next().charAt(0);
int AS = ch;
System.out.println("Ascii value is = "+AS);

}

}