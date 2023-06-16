package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest  //after test of presenal loan that is belong the same folder we can use to stop the session cookes
	public void lastexecution()
	{
		System.out.println("i will be executed last");
	}
	
	@Test(groups= {"smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
}
