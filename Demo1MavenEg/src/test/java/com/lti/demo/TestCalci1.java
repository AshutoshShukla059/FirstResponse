package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calci;

class TestCalci1 {
	
	Calci c = new Calci();
	@Test
	public void testcalNos() {
		Assertions.assertEquals(12, c.calNos(8, 6), "Code Execution Successful");
	}
	@Test
	public void testcalNos2() {
		Assertions.assertEquals(36, c.calNos2(4, 2)," : Code Execution Fails");
	}
	
	@Test
	public void testcalNos3() {
		Assertions.assertEquals(1, c.calNos3(5, 6),"Code Execution Successful");
	}
	
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	void testAssertFalse1() {
	Assertions.assertFalse("FirstNaming".length() == 10);
	Assertions.assertFalse(10 == 20, "assertion message");
	}
	@Test
	void testAssert() {
		String str1=null;
		String str2="Drilling";
	Assertions.assertNull(str1, "Completion Unsuccessful");
	Assertions.assertNotNull(str2, "Completion Successful");
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer>  n= new ArrayList<Integer>();
	Assertions.assertEquals(0, n.size());
	Assertions.assertTrue(n.isEmpty()); // assertTrue Method
	n.add(100);
	n.add(200);
	Assertions.assertEquals(2, n.size());
	// assertFalse(al.isEmpty());
	}
	@Test
	public void testAddition()
	{
	System.out.println("test add method ");
	Calci c= new Calci();
	int result= c.calNos(100, 300);
	Assertions.assertEquals(400, result);
	}
	@Test
	public void testSub()
	{
	System.out.println("test sub method ");
	Calci c= new Calci();
	int result= c.calNos2(100, 50) ;
	Assertions.assertEquals(50, result);
	}
}
