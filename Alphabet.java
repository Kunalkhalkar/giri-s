/*Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.*/

import java.util.*;
public class  Alphabet{
	public static void main(String x[] ){
	System.out.println("Enter a alphabet or digit or special charactor");
	Scanner kk = new Scanner(System.in);
	char ch = kk.next().charAt(0);
	int ascii = ch;
	
	String digit = ascii >48 && ascii<57  ? "is a digit": "not a digit";
	String alphabet = ascii >65 && ascii <90 ? "is alphabet capital letter" : "not a capital alphabet" ;
	String alphabet2 = ascii >97 && ascii < 122 ? "is alphabet small letter" : "not a small alphabet";
	String charactor = ascii >33 && ascii < 47 ? "is special charactor" : "not a special charactor";

	System.out.println();
	System.out.println(digit);
	System.out.println();
	System.out.println(alphabet);
	System.out.println();
	System.out.println(alphabet2);
	System.out.println();
	System.out.println(charactor);
	System.out.println();

}
}
/*
range of digit --------------48->57
range of --------A -> Z --- 65->90
range of --------a -> z ----97->122
range of special char------33->47
*/