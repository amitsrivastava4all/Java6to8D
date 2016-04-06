// What to Do?
interface Car{
	void speed();
}
interface RacingCar extends Car {
	void offRoad();
}
interface CityCar extends Car{
	void onRoad();
}
interface HybridCar extends RacingCar, CityCar{
	void mode();
}
class WW{
	
}
/*class E  extends WW implements Car, RacingCar, CityCar, HybridCar{
	
}*/
// Partial
 abstract class BMW implements HybridCar{
	 @Override
		public void offRoad() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void speed() {
			// TODO Auto-generated method stub
			
		}
}

// Fully
// How to Do?
class BmwHybrid extends  BMW{

	

	@Override
	public void onRoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mode() {
		// TODO Auto-generated method stub
		
	}
	
}
/*class Maruti implements CityCar{
	
}*/
public class InterfaceExtendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
