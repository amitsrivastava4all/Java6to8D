import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListDemo1 {
	/*static void doSearch(String name)
	{
		if(name.startsWith("r")){
			System.out.println("Name Start with R are "+name);
		}
	}*/
	 void doSearch(String name)
	{
		if(name.startsWith("r")){
			System.out.println("Name Start with R are "+name);
		}
	}
	public static void main(String[] args) {
		// Basic CRUD Operations
		// <String> I am Making my ArrayList as Generic
		ArrayList<String> list = new ArrayList<>();
		list.add("ram");  //Add New Record at End in ArrayList
		list.add("shyam1");
		list.add("raju");
		list.add("ricky");
		/*list.add("shyam2");
		list.add("shyam3");
		list.add("shyam4");
		list.add("shyam5");
		list.add("shyam6");
		list.add("shyam7");
		list.add("shyam8");
		list.add("shyam9");*/
		list.add(0,"Mike");  // Add in Beg , Mid , End
		//list.remove(1); //Delete Record (Index Wise , Value Wise)
		//list.remove("ram");
		//System.out.println("Enter the Name to Search ");
		Scanner scanner = new Scanner(System.in);
		//String searchName = scanner.next();
		/*int index = list.indexOf(searchName);  // Search
		// 1. Index wise (index position , contains wise (true / false)
		if(index!=-1){
		//if(list.contains("Mike")){
			System.out.println("Value Found and Change it into TOM");
		list.set(index, "Tom");  // Update
		}
		else{
			System.out.println("Not Found...");
		}*/
		System.out.println("Give 0th Index Value "+list.get(0));
		/*list.add("ram1");
		list.add("ram2");
		list.add("ram3");
		list.add("ram4");
		list.add("ram5");*/
		//list.add(10);
		System.out.println(list);
		//System.out.println(list.toString());
		// How to Traverse in ArrayList
		// 1st Way (Traditional Approach)
		/*for(int i = 0 ; i<list.size(); i++){
			if(list.get(i).startsWith("r")){
				System.out.println("Name Start with r "+list.get(i));
			}
		}*/
		// Use Iterator Interface (Java 1.4) 
		/*Iterator<String> i = list.iterator();
		while(i.hasNext()){
			String name = i.next();  // Give the Current Element and then move to the next element
			if(name.startsWith("r")){
				System.out.println("Name Start with r "+name);
				i.remove();
			}
		}
		System.out.println("Now After Remove "+list);*/
		// 3rd Way ListIterator
		/*ListIterator<String> i = list.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("************************************");
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}*/
		//4th Way
		// Enhance For Loop (Java 5)
		/*System.out.println("Using Enhance For Loop");
		for(String i : list){
			System.out.println(i);
		}*/
		// Functional Programming
		//5th Way ForEach (Java 8)
		// :: method reference feature which comes in Java 8
		//list.forEach(ArrayListDemo1::doSearch);  // Static Way
		ArrayListDemo1 obj = new ArrayListDemo1();
		//list.forEach(obj::doSearch);   // Object way
		list.forEach((x)->{
			if(x.startsWith("r")){
				System.out.println("Name Start with R are "+x);
			}
		});
		
		// To Sort in ArrayList
		Collections.sort(list);
		System.out.println("After Sorting List is "+list);
		
	}

}
