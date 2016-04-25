import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class I18N {

	public static void main(String[] args) {
		Locale locale = null;
		System.out.println("1. Press One for English");
		System.out.println("2. हिंदी के लिए दो दबाये ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice == 1){
			locale= new Locale("fr","FR");	
		}
		else{
			 locale = new Locale("hi","IN");
		}
		Date date =new Date(); // Current Date
		System.out.println("Today is "+date);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(date));
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		
		ResourceBundle rb = ResourceBundle.getBundle("message",locale);
		System.out.println(rb.getString("firstno"));
		int firstNo = scanner.nextInt();
		System.out.println(rb.getString("secondno"));
		int secondNo = scanner.nextInt();
		int sum = firstNo + secondNo;
		System.out.println(rb.getString("result")+" "+nf.format(sum));
		System.out.println(nf.format(1000000));

	}

}
