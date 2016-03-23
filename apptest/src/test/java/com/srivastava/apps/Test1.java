package com.srivastava.apps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test1(){
		System.out.println("Test Done");
		Assert.assertEquals(true, true);
	}
	@Test
	public void test2(){
		System.out.println("Test Done2");
		Assert.assertEquals(true, true);
	}

}
