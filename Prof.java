public class Prof{
	public static void main(String x[]){
	System.out.println("Profit or loss using conditional operator");
	int buyP = Integer.parseInt(x[0]);
	int sell = Integer.parseInt(x[1]);
	String str = sell > buyP ? "Seller get profit "+ (sell- buyP) : "seller get loss " + (sell-buyP);
	System.out.println("result =: "+str);
}
}