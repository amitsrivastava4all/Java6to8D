import java.util.Scanner;


public class Demo1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20 ;
		int c = a + b;
		Scanner scanner = new Scanner("Hello How are you");
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		scanner.close();
		//System.in 
		System.out.println("Sum is  "+c);
		for(int i = 1; i<=3 ; i++){
			for(int j = 1; j<=3 ; j++){
				if(i==j){
					continue;
				}
				
				//System s = new System();
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
