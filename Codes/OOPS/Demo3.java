class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(int id , String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println(this.name+" Born");
	}
	void print(){
		System.out.println("id "+id+ " Name "+name+" Salary "+salary);
	}
	/*@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Salary "+salary;
	}*/
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public void finalize(){
		System.out.println("Gud Bye "+this.name);
	}
	
}
public class Demo3 {

	void show(){
		System.out.println("Show");
	}
	public static void main(String[] args) {
		Employee ram = new Employee(1001, "Ram", 4444);
		//ram.print();
		System.out.println(ram);
		ram = null;
		//System.gc();
		Employee shyam = new Employee(1003, "Shyam", 2222);
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		//ram = shyam;
		
		//System.out.println(ram.toString());
		//System.out.println(ram.hashCode());
		

	}

}
