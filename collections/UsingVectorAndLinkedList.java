import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class UsingVectorAndLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		Vector<Integer> v = new Vector<>();
		v.addElement(90);
		v.add(10);
		
		LinkedList<Integer> l = new LinkedList<>();
		l.addFirst(100);
		l.add(0,200);
		l.addLast(999);
		System.out.println(l.get(1));
	}

}
