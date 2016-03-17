import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public strictfp class ScannerDemo {

	public static void main(String[] args) {
		// byte, short, int , long, 
		// float , double
		// char
		// boolean
		
		
		//****************************************
		//BigInteger b = BigInteger.valueOf(100l);
		//BigInteger c = BigInteger.valueOf(100l);
		//b.add(c);
		BigDecimal bd = BigDecimal.valueOf(90.20);
		int x = 10;
		int y = 10;
		String a = new String("My Best Friend Essay");
		String b = "My Best Friend Essay";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		if(a.equals(b)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		
		// String - char []
		// IEEE-754 Standard
		double q = 10.234567;
		float e = (float)90.20;
		long w = 111L;
		Scanner scanner = new Scanner(System.in);
		System.out.println("पहला नंबर दर्ज करे ");
		int firstNo = scanner.nextInt();  // Value comes after enter
		System.out.println("दूसरा नंबर दर्ज  करे ");
		int secondNo = scanner.nextInt();
		int result = firstNo + secondNo;
		System.out.println("रिजल्ट यह है  "+result);
		scanner.close();

	}

}
