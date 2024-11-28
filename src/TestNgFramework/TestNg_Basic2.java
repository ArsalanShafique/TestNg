package TestNgFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNg_Basic2 {
	
	@Parameters({"markx","mark3"})
	
	
	
	@Test(groups= {"sanity"})

	public void gotoSignin(String url,String name) {
		
		System.out.println("gotosigned is done");
		System.out.println(url);
		System.out.println(name);
	}
	@Test
	public void gotosignout() {
		
		System.out.println("gotosignedout is done");
	}
}
