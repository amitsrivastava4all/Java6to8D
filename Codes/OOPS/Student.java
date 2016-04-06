// Student Related Logic
// OOAD  - DRY (Don't Repeat YourSelf)
// Encapsulation - Binding data and methods into Single Unit is called Encapsulation.
// Eg. of Encapsulation - Class is the Example
// Gud Encapsulation - private variables (Data Hiding) and public methods
// New Changes 
public class Student {
private int rollno;  // Member (Instance Variables)
private String name;
private String course;
private double fees;
private String collegeName;
private String phone;
private String address;
private String email;
private int english;
private int maths;
// Constructor Overloading
 Student(){
	collegeName = "SRCC";
}
/*private Student(int rollno,String name){
	this();
	this.rollno = rollno;
	this.name =name;
}*/
Student(int rollno, String name , String course, double fees){
	//this(rollno,name);  // Constructor Calling with in Constructor
	//Student();
	this();
	this.rollno = rollno + collegeName.length();
	this.name = name;
	this.course = course;
	this.fees = fees;
	
}

public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int computeMarks(){
	return getEnglish() + getMaths();
}

/*public void takeInput(int rollno , String name, String course , double fees)   {  // Local Variables
	if(rollno<=0 && fees<=0){
		System.out.println("Invalid Values so Can't Assign this");
		return;
	}
	
	this.rollno = rollno;
	this.name = name;
	this.course = course;
	this.fees = fees;
}*/
/*public void print(){
	// this - it is a keyword and it hold the current object reference
	System.out.println("Rollno "+this.rollno);
	System.out.println("Name "+this.name);
	System.out.println("Course "+course);
	System.out.println("Fees "+fees);
	System.out.println("College Name "+collegeName);
}*/
}
