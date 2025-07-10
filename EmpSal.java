/*write a program input a basic salary of employee hra is 30%, DA is 30% */
public class EmpSal{
public static void main(String x[]){
	System.out.println("calculating the total salary of employee");
	int bs = Integer.parseInt(x[0]);
	int hra = (bs*30)/100;
	int da = (bs*30)/100;
	int Total = hra+da+bs;
	System.out.println("hra is = "+hra+ "\n da is = "+da+" \nbs after addition of all allowance "+ Total);	
}
}