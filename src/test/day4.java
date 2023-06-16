package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webloginhomeloan(String urlname)
	{
		//selenium}
		System.out.println("webloginloan");
		System.out.println(urlname);
		
	}
	
	@Test
	public void mobilloginhomeloan()
	{
		//apim}
		System.out.println("mobilecarloan");
	}
	
	@Test(groups= {"smoke"})//you can pick selected test out of full 
	//regration suit put same tag to them and you can treger them from testng xml file   
	public void loginAPIhomeloan()
	{
		//Eest api automation}
		System.out.println("restapicarlona");
	}
}

