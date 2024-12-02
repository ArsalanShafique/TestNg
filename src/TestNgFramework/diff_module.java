package TestNgFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class diff_module {
	
	@BeforeMethod
	public void everymethod() {
		System.out.println("movetonext");
	}
	
	@BeforeSuite
	public void execute() {
		System.out.println("i am no 1");
	}
	
	@BeforeTest
	public void firstexecution() {
		
		System.out.println("execute me first");
	}
	@Test
 public void webapplicationdemo() {
	 
	 System.out.println("webapplication is running");
	 System.out.println("test is working done");
 }
	@Test
 public void mobileapplicationdemo() {
	 
	 System.out.println("mobileapplicationdemo is running");
	 System.out.println("test is working done ");
 }
	@Test
 public void apiapplicationdemo() {
	 
	 System.out.println("apiApplicationdemo is running");
 }
	@AfterTest
	public void lastexecution() {
		System.out.println("test cases execution successfully");
	}
}
