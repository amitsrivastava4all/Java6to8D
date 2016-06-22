import java.util.ArrayList;
import java.util.HashMap;


public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> phones = new ArrayList<>();
		phones.add(2222);
		phones.add(1111);
		phoneMap.put("amit", phones);
		/*phoneMap.put("ram",3333);
		phoneMap.put("shyam",2222);
		*/System.out.println(phoneMap.get("amit"));
		// Key Can't Be Duplicate and Value can be duplicate

	}

}
