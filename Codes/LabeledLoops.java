
public class LabeledLoops {

	public static void main(String[] args) {
		mylbl:
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<=3; j++){
				if(i==j){
					break mylbl;
					//continue mylbl;
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
