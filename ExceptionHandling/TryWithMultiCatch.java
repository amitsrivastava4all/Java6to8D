
public class TryWithMultiCatch {

	public static void main(String[] args) {
		// Be Specfic
		try{
		String a = null;
		//a.length();  // throw new NullPointorException();
		int x[] = new int[10];
		//x[11]=1000;
		int d = 10/0;
		}
		catch(NullPointerException e){
			System.out.println("a is Nothing and u can't compute the length");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Size is Less than What u r expecting");
		}
		catch(Exception e){
			System.out.println("Something else Happens");
		}

	}

}
