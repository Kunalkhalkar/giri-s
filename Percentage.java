public class Percentage{
	public static void main(String x[]){
		System.out.println("wajp to enter marks of five subjects and calculate total marks and percentage");
		int sub1=Integer.parseInt(x[0]),
		sub2 = Integer.parseInt(x[1]),
		 sub3 = Integer.parseInt(x[2]),
		 sub4 = Integer.parseInt(x[3]),
		 sub5 = Integer.parseInt(x[4]);
		int Total = sub1 + sub2 + sub3 + sub4 + sub5;
		int Percentage = Total * 100 / 500; 
		System.out.println("addition of all subject = "+ Total + "\npercentage of all subject = "+ Percentage);

	}

}