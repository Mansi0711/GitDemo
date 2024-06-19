package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
    
	@AfterTest
	public void ExecuteLast()
	{
	  System.out.println("I will execute Last");
	  System.out.println("I will execute First");
	  System.out.println("I will execute Second");
	  System.out.println("I will execute Third");
	}
	
	
	
	@Test(groups = {"Smoke"})
	public void Demo() 
	{
		
		System.out.println("Hello");
	}

	@Test
public void SecondTest() 
    {
	
	System.out.println("bye");
    }	
	
	
}
