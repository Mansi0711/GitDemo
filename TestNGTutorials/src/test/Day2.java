package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Day2 {
	
	@Test(groups = {"Smoke"})
	public void Demo() 
	{
		System.out.println("Hello World");
		
	}
	
    @AfterSuite
    public void AFsuite()
    {
    	System.out.println("I will execute at the last first no");
    }
	
	
	
     
	@BeforeTest
	public void prerequisites()
	{
		System.out.println("I will execute first");
	}
}
