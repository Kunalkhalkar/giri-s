/*for loop for printing a - z*/
public class AtoZ{
	public static void main(String x[]){
	System.out.println("pringting a - z");
	int ch0 = 90;
	int ch = 65;
	for(int i=1; i <= 5; i++){
		for (int l=i; l <=5; l++){	
		System.out.print(" ");
		System.out.print((char)ch);
		ch++;
			for (int k= 1; k>0; k--){
				System.out.print((char)ch0);
				ch0--;
			}
		}       System.out.println(" ");


                      }

	}
}