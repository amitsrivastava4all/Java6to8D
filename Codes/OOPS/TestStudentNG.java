import org.testng.Assert;
import org.testng.annotations.Test;


public class TestStudentNG {
	// TestCase
@Test	
public void testComputeMarks(){
	Student ram = new Student(1001,"Ram","Java",9999) ;  // Constructor Call
	ram.setPhone("2222");
	ram.setPhone("3333");
	ram.setEnglish(90);
	ram.setMaths(91);
	int actual= ram.computeMarks();
	int expected = 181;
	Assert.assertEquals(actual, expected);
}
@Test(timeOut=100,enabled=false)	
public void testComputeMarks2(){
	Student ram = new Student(1001,"Ram","Java",9999) ;  // Constructor Call
	ram.setPhone("2222");
	ram.setPhone("3333");
	ram.setEnglish(90);
	ram.setMaths(91);
	int actual= ram.computeMarks();
	int expected = 181;
	Assert.assertEquals(actual, expected);
}
@Test(threadPoolSize=100,invocationCount=1000)	
public void testComputeMarks3(){
	Student ram = new Student(1001,"Ram","Java",9999) ;  // Constructor Call
	ram.setPhone("2222");
	ram.setPhone("3333");
	ram.setEnglish(90);
	ram.setMaths(91);
	int actual= ram.computeMarks();
	int expected = 181;
	Assert.assertEquals(actual, expected);
}
}
