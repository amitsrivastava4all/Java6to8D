class Human
{
	void talk(){
		System.out.println("Talk Talk");
	}
	void walk(){
		System.out.println("Walking");
	}
	void eat(){
		System.out.println("Eat Food");
	}
	void think(){
		System.out.println("Think");
	}
}
class SuperHuman extends Human{
	void fly(){
		System.out.println("Can Fly");
	}
	void morePower(){
		System.out.println("More Power");
	}
}
public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		Human amit = new Human();
		Human man = new SuperHuman(); //Upcasting (Narrow)
		
		//SuperHuman hulk = new SuperHuman();
		man.walk();
		man.eat();
		man.talk();
		man.think();
		SuperHuman hanuman = (SuperHuman)man; //Downcast (Wide)
		hanuman.fly();
		hanuman.morePower();

	}

}
