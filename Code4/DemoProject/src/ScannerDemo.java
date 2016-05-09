import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Full Name");
		String fname = scanner.next();
		System.out.println("Now Name is "+fname);
		System.out.println("Enter the Number");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Now i am here with "+firstNo+" "+name);

	}

}
