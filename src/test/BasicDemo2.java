package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicDemo2 {

	@Test
	public void run() {
		System.out.println("bye");
	}
	@Test(groups= {"smoke"})
	public void run1() {
		System.out.println("byebye bggtf");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BEFORE SUITE EXECUTION");
	}
	
}
