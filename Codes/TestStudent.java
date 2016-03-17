
public class TestStudent {

	public static void main(String[] args) {
		Student ram = new Student(1001,"Ram","Java",9999) ;  // Constructor Call
		ram.setPhone("2222");
		ram.setPhone("3333");
		System.out.println("Ram Phone "+ram.getPhone());
		//Student ram = new Student(1001,"Ram");
		//ram.print();
		// Heap Object Create (Instance Default Value ) , Reference
		/*System.out.println(ram.rollno);
		System.out.println(ram.name);
		System.out.println(ram.course);
		System.out.println(ram.fees);*/
		//ram.takeInput(-1001,"Ram", "Java", -9999);
		
		/*ram.rollno = -1001;
		ram.name="Ram";
		ram.course="Java";
		ram.fees=-9999;*/
		
		//ram.print();
		/*System.out.println(ram.rollno);
		System.out.println(ram.name);
		System.out.println(ram.course);
		System.out.println(ram.fees);*/
		/*Student shyam = new Student();
		shyam.takeInput(1002,"Shyam", "Java", 9999);
		shyam.print();*/
		/*System.out.println(shyam.rollno);
		System.out.println(shyam.name);
		System.out.println(shyam.course);
		System.out.println(shyam.fees);*/
		
		
		int x = 100;

	}

}
