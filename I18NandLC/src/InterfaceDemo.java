
// What is Interface ?
// ProtoType Design (What to Do)
// Interface 100% abstract
abstract interface IPlayer{
	public static final int MAX_JUMP = 100;
	int DEFAULT_JUMP = 10;
	int MAX_SPEED = 100;
	int DEFAULT_SPEED = 20;
	public abstract int jump(int current);
	int run(int current);
}
// there is contract b/w the class and interface
// How to do
class BlackPlayer implements IPlayer{

	@Override
	public int jump(int current) {
		if(current<MAX_JUMP){
			current++;
		}
		return current;
	}

	@Override
	public int run(int current) {
		if(current<MAX_SPEED){
			current++;
		}
		return current;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		IPlayer player = new BlackPlayer();
		System.out.println("Jump is "+player.jump(10));
		System.out.println("Run is "+player.run(10));

	}

}
