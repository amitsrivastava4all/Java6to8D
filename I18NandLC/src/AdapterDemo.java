import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface Card{
	void feature1();
	void feature2();
}
 abstract class CardAdapter implements Card{

	@Override
	public void feature1() {
		System.out.println("Feature Not There!");
	}

	@Override
	public void feature2() {
		System.out.println("Feature Not There!");
		
	}
	 
 }
class SilverCard extends CardAdapter{
	@Override
	public void feature1() {
		System.out.println("Silver Feature is there");
	}
}
class GoldCard extends CardAdapter{
	@Override
	public void feature1() {
		System.out.println("Gold Feature1 is there");
	}
	@Override
	public void feature2() {
		System.out.println("Gold Feature2 is there");
	}
}
public class AdapterDemo {

	public static void main(String[] args) {
		WindowListener w;
		WindowAdapter w1;
		GoldCard s = new GoldCard();
		s.feature1();
		s.feature2();

	}

}
