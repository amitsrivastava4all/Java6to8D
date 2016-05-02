import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import org.apache.log4j.Logger;

class Test{
	static Logger logger  = Logger.getLogger(Test.class);
	static void ui(){
		logger.debug("My UI Code Begin......");
		System.out.println("UI Start");
		try{
		businesslogic();
		System.out.println("UI Ends");
		logger.debug("My UI Code Ends......");
		}
		catch(SQLException e){
			System.out.println("Some Problem Happens");
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw); // Print to Console
			logger.error(sw.toString()); 
		}
		
	}
	static void businesslogic() throws SQLException{
		logger.debug("My BL Code Begin......");
		System.out.println("Logic Starts");
		db();
		System.out.println("Logic Ends");
		logger.debug("My BL Code Ends......");
	}
	
	static void db() throws SQLException{
		try{
			logger.debug("My DB Code Begin......");
		System.out.println("DB Connection Open");
		System.out.println("DO SOME QUERY");
		/*try{*/
		if(100>20){
		throw new SQLException(); // Explicit Way to raise an Exception
		}
		//int e =100/0;
		System.out.println("GET RESULT");
		/*}
		catch(ArithmeticException e){
			System.out.println("Divide by zero happen");
		}*/
		System.out.println("RETURN THE RESULT TO BUSINESS LOGIC");
		logger.debug("My DB Code Ends......");
		if(10>2){
		return ;
		}
		}
		finally{
			// Used to Clean the Resources
		System.out.println("DB Connection Close");
		}
		}
}
public class AppFlow {

	public static void main(String[] args) {
		Test.ui();

	}

}
