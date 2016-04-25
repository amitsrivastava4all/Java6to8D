
public class Caller2 {

	public static void main(String[] args) {
		IDAO dao = DAOFactory.getObject();
		dao.connect();

	}

}
