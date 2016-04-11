
public class MultiThreadingDemo {

	public static void main(String[] args) {
		new Thread(()->{
			for(int i = 1; i<=10 ;i++){
				System.out.println("JOB 1 I is "+i);
			}
		}).start();
		
		
		/*Runnable job = ()->{
			for(int i = 1; i<=10 ;i++){
				System.out.println("JOB 1 I is "+i);
			}
		};
		Thread w1 = new Thread(job);
		w1.start();*/

	}

}
