package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calci;

class TestCalci2 {
	@AfterEach
	@Test
	public void testresult1() {
		Calci a= new Calci();
		int result1 = a.calNos2(20, 10);
		Assertions.assertEquals(900, result1);
	}
	@Test
	public void testresult3() {
		Calci a= new Calci();
		int result3 = a.calNos3(5, 6);
		Assertions.assertEquals(1, result3);
	}
	@BeforeEach
	@Test
	public void testresult2() {
		Calci a= new Calci();
		int result2 = a.calNos(6, 4);
		Assertions.assertEquals(8, result2);
	}
	@AfterAll
	public static void testthis() {
		System.out.println("After all should be executed");
	}
	@BeforeAll
	public static void testthat() {
		System.out.println("Before all should be executed");
	}
}
