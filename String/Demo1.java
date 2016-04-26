
public class Demo1 {

	public static void main(String[] args) {
		// No Pool
		// Mutable
		StringBuilder sb = new StringBuilder(); //1.5
		//StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Hello How are you hfghgf gf h gf hgf h gf hgf hgf h fg hgf h gf h");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		
		String x = new String("amit");  // Object Creation //2 or 1
		x = x + "srivastava";
		// String  
		// 1. It is a class and it is final class
		// String maintain String Pool
		// String objects are Immutable
	/*	String sql = "select * from products ";
		double price=0.0;
		price = 9000;
		int screenSize = 0;
		if(price>0){
			sql = sql + " where price>"+price;
		}
		screenSize = 5;
		if(screenSize>0){
			sql = sql + " and screensize ="+screenSize;
		}
		String productId = "1001";*/
		// Bad String
		
		int p = 1000;
		String a = "amit"; // String Literal  // 1 or 0
		String b = "amit";
		//System.out.println(a.hashCode());
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		a= a + " Srivastava";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		

	}

}
