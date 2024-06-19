package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dya4 {
	@Parameters({"URL"})
	@Test
	public void webloginHomeloan(String uname1)
	{
		System.out.println("WebloginHome");
		System.out.println(uname1);
	}

	@Test(groups = {"Smoke"})
	public void MobileloginHomeloan()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test(enabled=false)
	public void ApiloginHomeloan()
	{
		System.out.println("ApiloginHome");
	}
	

}
