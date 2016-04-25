
public class DAO implements IDAO {
@Override	
public void connect(){
	System.out.println("Connection Create");
}
public void reconnect(){
	System.out.println("ReConnect");
}
}
