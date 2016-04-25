class Employee
{
	int empno;
	String name;
	double salary;
	double bonus;
	Employee(int empno, String name , double salary, double bonus){
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.bonus =bonus;
	}
}
class Dept
{
	int deptId;
	String deptName;
	String managerName;
	int strength;
	Dept(int deptId , String deptName , String managerName, int strength){
		this.deptId = deptId;
		this.deptName= deptName;
		this.managerName = managerName;
		this.strength = strength;
	}
}
class Increment
{
	Dept printDept(Employee e){
		if(e.empno>1000){
			Dept d = new Dept(10,"IT","Mike",20);
			return d;
		}
		else
		{
			Dept d = new Dept(10,"Admin","Tom",20);
		return d;
		}
		// DeptId, DeptName, Manager Name, Strength
	}
	double salaryAndBonus(double sal, double b){
		sal = sal + 10000;
		b = b + 900;
		return sal;
		//return b;
	}
	void salaryAndBonus(Employee e){
		e.salary = e.salary + 10000;
		e.bonus = e.bonus + 900;
		//return sal;
		//return b;
	}
}
public class PassingObject {

	public static void main(String[] args) {
		Employee ram = new Employee(1001, "Ram", 9999, 1000);
		Increment inc = new Increment();
		//inc.salaryAndBonus(ram.salary,ram.bonus);
		inc.salaryAndBonus(ram);
		System.out.println(ram.salary);
		System.out.println(ram.bonus);

	}

}
