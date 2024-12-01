package TestNgFramework;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class diff_module2 {

	
	
	@Test
 public void webapplicationloan(String url) {
	 
	 System.out.println("webapplicationwebapplicationloan is running");
	 System.out.println(url);
	 System.out.println("this is my new commit");
	 System.out.println("this is my next commit");
	 System.out.println("this is my next commit");
	 System.out.println("this is my next commit"); System.out.println("this is my next commit");
	 System.out.println("abrar have been updated ");
	
 }
	
	
	@Parameters({"markx"})
	@Test
	
 public void mobileapplicationloan(String urlname) {
	 
	 System.out.println("mobileapplicationloan is running");
	 System.out.println(urlname);
	 	Assert.assertTrue(false);
 }
	@Test
 public void apiapplicationloan() {
	 
	 System.out.println("apiApplicationloan is running");
 }
	@AfterSuite
	public void lastrun() {
		System.out.println("last is running");
		
		
	}
}
