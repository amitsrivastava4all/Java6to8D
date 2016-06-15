import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Customer implements Comparable {//extends Object{
	private int id;
	private String name;
	private double balance;
	private String search;
	Customer(String search){
		this.search = search;
	}
	@Override
	public int compareTo(Object o){
		Customer c = (Customer)o;
		return Double.valueOf(this.balance).compareTo(Double.valueOf(c.balance));
		//return this.name.compareToIgnoreCase(c.name);
		//return this.name.compareTo(c.name);
		//return c.name.compareTo(this.name);
	}
	
	private boolean isDigit(){
		for(int i = 0 ; i<this.search.length(); i++){
			if(!Character.isDigit(this.search.charAt(i))){
					return false;
			}
		}
		return true;
	}
	@Override
	public boolean equals(Object o){
		boolean isFound = false;
		Customer arrayElement = (Customer)o;  // Downcasting
		
		if(this.search.equals(arrayElement.name)){
			return true;
		}
		if(isDigit()){
		if(Integer.parseInt(this.search)==arrayElement.id){
			//if(this.search.equals(arrayElement.id)){
			return true;
		}
		}
		
		/*if(this.id>0){
			if(this.id ==arrayElement.id){
				isFound = true;
			}
			else
			{
				isFound = false;
				return isFound;
			}
		}
		if(this.name!=null && this.name.trim().length()>0){
			if(this.name.equals(arrayElement.name)){
				isFound = true;
			}
			else
			{
				isFound = false;
				return isFound;
			}
		}
		if(this.balance>0){
			if(this.balance==arrayElement.balance){
				isFound=true;
			}
			else
			{
				isFound = false;
				return isFound;
			}
		}*/
//		if(this.id==arrayElement.id && 
//				this.name.equals(arrayElement.name)
//				&& this.balance==arrayElement.balance){
//			isFound = true;
//		}
		return isFound;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	Customer(int id , String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Balance "+balance;
	}
}
public class CRUDDemo {
	static double totalBalance = 0.0;
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer ram = new Customer(1001,"Ram",9999);
		customerList.add(ram);
		customerList.add(new Customer(1002,"Shyam",5555));
		customerList.add(new Customer(1003,"mike",15555));
		customerList.add(new Customer(1004,"Tom",25555));
		
		// Searching 
		
		System.out.println("Enter the Customer Info to Search");
		Scanner scanner =new Scanner(System.in);
		String searchTxt = scanner.next();
		/*System.out.println("Enter the Customer Id and Press 0 or negative when u don't want to provide");
		int id = scanner.nextInt();
		System.out.println("Enter the Name to Search");
		String name = scanner.next();
		System.out.println("Enter the balance to Search");
		double balance = scanner.nextDouble();*/
		Customer searchObject = new Customer(searchTxt);
		int index = customerList.indexOf(searchObject);
		if(index!=-1){
		//if(customerList.contains(searchObject)){
			System.out.println("Found...");
			//customerList.remove(index);
			//System.out.println("After Remove List is :: "+customerList);
		}
		else{
			System.out.println("Not Found...");
		}
		System.out.println(customerList.get(0));
		
		// For Sorting 
		Collections.sort(customerList);
		System.out.println("After Sort List is "+customerList);
		/*for(Customer customer : customerList){
			totalBalance = totalBalance + customer.getBalance();
		}*/
		customerList.forEach((customer)->totalBalance = totalBalance + customer.getBalance());
		System.out.println("Total Balance is "+totalBalance);
		
		
		
		
		//System.out.println(customerList);
		
		//System.out.println(ram);
		//System.out.println(ram.toString());
		

	}

}
