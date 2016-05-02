import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo1 {
	static Scanner scanner = new Scanner(System.in);
	static int firstNo = 0;
	static int secondNo = 0;
	public static void getFirstNo(){
		
		System.out.println("Enter the First Number");
		try{
		 firstNo = scanner.nextInt(); // throw new InputMismatchException();
		}
		catch(InputMismatchException object){
			System.out.println("Only Numbers Allowed , U Enter Something else....");
			scanner.nextLine();
			getFirstNo();
		}
		//return firstNo;
	}
	
public static void getSecondNo(){
		
		System.out.println("Enter the Second Number");
		try{
			secondNo = scanner.nextInt(); // throw new InputMismatchException();
		}
		catch(InputMismatchException object){
			System.out.println("Only Numbers Allowed , U Enter Something else....");
			scanner.nextLine();
			getSecondNo();
		}
		//return firstNo;
	}
	public static void main(String[] args) {
		/*int firstNo = 0;
		int secondNo = 0;*/
		int result = 0;
		
		/*System.out.println("Enter the First Number");
		try{
		 firstNo = scanner.nextInt(); // throw new InputMismatchException();
		}
		catch(InputMismatchException object){
			System.out.println("Only Numbers Allowed , U Enter Something else....");
			scanner.nextLine();
		}
		System.out.println("Enter the Second Number");
		try{
		 secondNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Numbers Allowed , U Enter Something else....");
			
		}*/
		getFirstNo();
		getSecondNo();
		try{
		 result = firstNo / secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("Can't Divide a Number with Zero ");
			System.out.println("Result is Infinite");
			//System.exit(0);
			//return;
		}
		finally{
			// It Always Execute 
			scanner.close();
			System.out.println("Now Scanner is Closed...");
		}
		
		File file = new File("d:\\test99\\abcd\\xyz\\qqq");
		file.mkdirs();
		file = new File("d:\\test99\\abcd\\xyz\\qqq\\abcd.txt");
		try {
			file.createNewFile();
			System.out.println("File Created..");
		} catch (IOException e) {
			System.out.println("File Creation Exception ");
		}
		
	}

}
