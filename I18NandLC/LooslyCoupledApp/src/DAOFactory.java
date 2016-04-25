import java.util.ResourceBundle;


public class DAOFactory {
private DAOFactory(){
	
}
public static IDAO getObject(){
	ResourceBundle rb = ResourceBundle.getBundle("object");
	String className = rb.getString("classname");
	IDAO idao = null;
	try {
		idao= (IDAO)Class.forName(className).newInstance();
	}  catch (Exception e) {
		System.out.println(e);
	}
	return idao;
	//return new SuperDAO();
}
}
