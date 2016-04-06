//final class Parent{
class Parent{
	final int MIN_AGE =18;
	final void checkAge(int age){
		if(age>=MIN_AGE){
			System.out.println("U Can VOTE");
		}
		else
		{
			System.out.println("U Can't VOTE");
		}
	}
}
class Child extends Parent{
	
}
public class UseOfFinal {

	public static void main(String[] args) {
		Parent p = new Parent();

	}

}
