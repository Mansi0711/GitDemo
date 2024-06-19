package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dya3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Executing all methods in class");
	}
	

	@Test()
	public void weblogincarloan()
	{
		System.out.println("WebloginCar");
	}
	
	@BeforeMethod
	public void BM1()
	{
		System.out.println("I will execute before every Test Method in day 3 class");	
	}
    
	@AfterMethod
	public void AM1()
	{
		System.out.println("I will execute After every Test Method in day 3 class");	
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Executing all methods in class");
	}
	
	@BeforeSuite
	public void BFsuite()
	{
		System.out.println("I am no 1");	
	}
	
	
	@Test(groups = {"Smoke"})
	public void MobileSignIncarloan()
	{
		System.out.println("MobileSignInCar");
	}
	
	@Test(dataProvider="getdata")
	public void MobileSignOutcarloan(String username, String password)
	{
		System.out.println("MobileSignOutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st combination of Username and Password - good credit history = Row
		//2nd Username password - No credit history
		//3rd fraudelent credit history
		Object [][] data = new Object[3][2];
		//1st set
		data[0][0] = "FirstUsername";
		data[0][1] = "FirstPassword";
		//Coloumns in the row are nothing but the values for that particular combinations(row)
		
		//2st set
		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";
		

		//3rd set
		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";
		
		return data;
	}
	
	
	
	
	@Parameters({"URL"})
	@Test
	public void MobileRemotecarloan(String uname)
	{
		System.out.println("MobileRemoteCar");
		System.out.println(uname);
		
	}
	@Test(dependsOnMethods= {"weblogincarloan"})
	public void Apilogincarloan()
	{
		System.out.println("ApiloginCar");
	}
	

}
