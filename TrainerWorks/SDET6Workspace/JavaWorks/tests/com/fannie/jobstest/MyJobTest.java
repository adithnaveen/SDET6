package com.fannie.jobstest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fannie.jobs.MyJob1;

public class MyJobTest {

	// null 
	MyJob1 mj; 
	
	// this method will be invoke before every @Test
	@Before
	public void setUp(){
		System.out.println("Hey i'm from before");
		mj = new MyJob1();
	}
	
	@After
	public void tearDown(){
		System.out.println("hey i'm from after ");
	}
	
	@Test
	public void test() {
		System.out.println("i'm from test ");
		
		boolean flag = mj.insertEmp(1);

		// expected, actual
		assertEquals(true, flag);

	}
	
 @Test(timeout=30)
	public void countEmpTest(){
	 System.out.println("i'm from emp test");
		assertEquals(5, mj.getNumberOfEmps());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
