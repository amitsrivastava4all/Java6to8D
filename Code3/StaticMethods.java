import static com.apps.ValidationUtility.isBlank;
import static java.lang.System.out;

 class W
{
	 static class EE
	 {
		 static void disp(){
			 System.out.println("EE Disp");
		 }
	 }
static int x;
static void print(){
	
}
}
public class StaticMethods {

	public static void main(String[] args) {
		W.EE.disp();
		//System s = new System();
		//Math m = new Math();
		//ValidationUtility v = new ValidationUtility();
		String email=null;
		if(isBlank(email)){
			out.println("Email Blank");
		}
		else{
			out.println("Not Blank");
		}
		

	}

}
