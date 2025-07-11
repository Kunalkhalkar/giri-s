/* write a program to calculate the compound interest Amount = principle (1 + r/n)^nt */

public class CompoundI{
		public static void main(String x[]){
		int principle = Integer.parseInt(x[0]);
		float rate = Float.parseFloat(x[1]);
		int  n = Integer.parseInt(x[2]);  //number of time interest calculated in 1 year eg. 2 times annually (quaterly)
		int t = Integer.parseInt(x[3]); 
	
		float CompoundInterest = principle; //calculating compound interest
		float comp = CompoundInterest * t * n;
		System.out.println(CompoundInterest);				
		System.out.println(comp);		
	
		
		
	}
	}