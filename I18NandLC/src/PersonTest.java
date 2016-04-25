import java.util.ArrayList;


public class PersonTest {

	public static void main(String[] args) throws Exception {
		/*long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000; i++){
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);*/
		System.out.println("Code Start");
		ArrayList l = new ArrayList();
		while(true){
		Person ram = new Person(21,"Ram");
		l.add(ram);
		Thread.sleep(50);
		}
		//ram.print();
		//main(null);
	}

}
