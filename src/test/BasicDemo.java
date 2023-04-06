package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicDemo {

	@AfterTest
	public void last() {
		System.out.println("HUM LAST");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORE CLASS LIMIT");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASS EXECUTTE");
	}
	@Test(groups= {"smoke"})
	public void demo() {
		
System.out.println("Testing Ng");
	}
	@BeforeTest
	public void prerequiste() {
		System.out.println("HUM FIRST");
	}
	@Test
	public void fail() {
		System.out.println("failing");
		Assert.assertTrue(false);
	}

}
