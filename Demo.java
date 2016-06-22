import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class ITCustomer
{
	private int id;
	private String name;
	private HashMap<String,ArrayList<Address>> addressMap = new HashMap<>();
	private HashMap<Integer,Order> orderMap = new HashMap<>();
	public HashMap<Integer, Order> getOrderMap() {
		return orderMap;
	}
	public void setOrderMap(HashMap<Integer, Order> orderMap) {
		this.orderMap = orderMap;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, ArrayList<Address>> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(HashMap<String, ArrayList<Address>> addressMap) {
		this.addressMap = addressMap;
	}
	
}

class Address
{
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
class Order{
	private int id;
	private String name;
	private String desc;
	private ArrayList<Product> productList = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
}
class Product{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

public class Demo {
	static Scanner scanner= new Scanner(System.in);
	
	public static ArrayList<Product> takeProducts(){
		ArrayList<Product> productList = new ArrayList<>();
		while(true){
			System.out.println("Enter the Product name");
			String name = scanner.next();
			Product product = new Product();
			product.setName(name);
			System.out.println("Enter the Product Price");
			double price = scanner.nextDouble();
			product.setPrice(price);
			productList.add(product);
			System.out.println("Do u want to add more products");
			if(scanner.next().equalsIgnoreCase("N")){
				break;
			}
		}
		return productList;
	}
	
	public static HashMap<Integer,Order> takeOrder(){
		int oid=1;
		HashMap<Integer,Order> orderMap = new HashMap<>();
		while(true){
			Order order = new Order();
			System.out.println("Enter the Order Name");
			String orderName = scanner.next();
			order.setName(orderName);
			System.out.println("Enter the Desc");
			String desc = scanner.next();
			order.setDesc(desc);
			System.out.println("Enter the Products");
			order.setProductList(takeProducts());
			orderMap.put(oid,order);
			oid++;
			System.out.println("Do u want to add more orders");
			if(scanner.next().equalsIgnoreCase("N")){
				break;
			}
		}
		return orderMap;
	}
	
	public static ArrayList<Address> takeAddress(){
		
		ArrayList<Address> addressList = new ArrayList<>();
		while(true){
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		Address address = new Address();
		address.setCity(city);
		address.setState(state);
		addressList.add(address);
		System.out.println("Do u want to add more Address ");
		if(scanner.next().equals("N")){
			break;
		}
		}
		return addressList;
	}
	public static void main(String[] args) {
		int cid = 1;
		HashMap<String,ITCustomer> customerMap = new HashMap<>();
		HashMap<String,ArrayList<Address>> addressMap = new HashMap<>();
		while(true){
			ITCustomer customer = new ITCustomer();
			System.out.println("Enter the Customer Name");
			String customerName = scanner.next();
			customer.setId(cid);
			customer.setName(customerName);
			System.out.println("Enter Office Address....");
			addressMap.put("office",takeAddress());
			System.out.println("Enter Res Address");
			addressMap.put("res",takeAddress());
			customer.setAddressMap(addressMap);
			System.out.println("enter the orders");
			customer.setOrderMap(takeOrder());
			customerMap.put(customerName,customer);
			cid++;
			System.out.println("Do u want to add more customers");
			if(scanner.next().equalsIgnoreCase("N")){
				break;
			}
			
		}
		System.out.println("Enter the Customer Name to Search ");
		String name = scanner.next();
		ITCustomer cust = customerMap.get(name);
		if(cust!=null){
			System.out.println("Name Found... "+cust.getId()+" "+cust.getName());
			System.out.println("Type \"office\" for Office Address and Type \"res\" for Res Address");
			String addressKey = scanner.next().toLowerCase();
			ArrayList<Address> addressList = cust.getAddressMap().get(addressKey);
			if(addressList!=null && addressList.size()>0){
				System.out.println(addressKey+" Found...");
				for(Address a : addressList){
					System.out.println(a.getCity()+" "+a.getState());
				}
			}
			else
			{
				System.out.println("Address Not Found...");
			}
		}
		else
		{
			System.out.println("Not Found...");
		}

	}

}
