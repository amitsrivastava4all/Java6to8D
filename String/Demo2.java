
public class Demo2 {

	public static void main(String[] args) {
		String a = "raM Kumar";
		String b = "raM";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		a= a.toLowerCase();
		//if(a==a.toUpperCase()){
		if(a==b){	
		System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		char e = a.charAt(0);
		System.out.println(e);
		System.out.println("Index is "+a.indexOf("a"));
		System.out.println("Last Index "+a.lastIndexOf("a"));
		if(a.contains("Ku"))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found..");
		}
		int x = 1000;
		int y = 900;
		a = " Hello Price is  "+x+" Do Like the Lowest Price "+y+ " Are "+ " You"; // StringBuffer
		a=a.concat("Hello").concat("Do U Like the Lowest Price");
		a.endsWith("Kumar");
		a.startsWith("Mr");
		System.out.println("Hello".substring(2));
		System.out.println("Hello".substring(2,5));
		String e1 []= "A-10,Shakti Nagar,Delhi-7".split(",");
		for(String ee : e1){
			System.out.println(ee);
		}
		if(a.equals(b)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		System.out.println("anil".compareTo("anil"));

	}

}
