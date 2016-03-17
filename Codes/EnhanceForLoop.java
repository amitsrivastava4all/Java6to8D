
public class EnhanceForLoop {

	public static void main(String[] args) {
		int x[]={10,20,30,40,50,90,78};
		/*for(int i = 0; i<x.length ;i++){
			System.out.println(x[i]);
		}*/
		// 1.5
		for(int i : x){
			System.out.println(i);
		}
		//int e[][]=new int[3][4];
		//int [][]e=new int[3][4];
		//int []e[]=new int[3][4];
		int e[][]= new int[3][];
		e[0] = new int[10];
		e[1]= new int[20];
		e[2] = new int[30];
		/*int e[][]={
				{10,20,30,40},
				{110,120,130,140},
				{210,220,230,240}
				
		};*/
		/*for(int i = 0; i<e.length; i++){
			for(int j = 0 ; j<e[i].length; j++){
				System.out.println(e[i][j]);
			}
		}*/
		for(int r[]: e){
			for(int w : r){
				System.out.print(w+"\t");
			}
			System.out.println();
		}
	}

}
