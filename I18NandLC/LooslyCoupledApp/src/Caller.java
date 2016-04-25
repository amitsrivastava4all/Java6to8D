
public class Caller {

	public static void main(String[] args) {
		IDAO dao = DAOFactory.getObject();
		dao.connect();
		//dao.reconnect();

	}

}
