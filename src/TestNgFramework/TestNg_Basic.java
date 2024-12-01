package TestNgFramework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNg_Basic {
	@Test(groups = { "sanity" })
	public void gotoGoogle() {
		System.out.println("my first testng project");
		Assert.assertTrue(false);

	}
	
	@Test(dataProvider="getdata")
	
	public void data(String username,String password) {
		System.out.println("Dataprovider is running");
	System.out.println(username);
	System.out.println(password);
	System.out.println("new brach is created");
	System.out.println("new branch have beeen created");
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data= new Object [3][2];
		data[0][0]="firstusername";
		data[0][1]="first address";
		
		data[1][0]="secondname";
		data[1][1]="secondaddress";
		
		data[2][0]="thirdname";
		data[2][1]="thirdaddress";
		return data;
	}
	
}

	



