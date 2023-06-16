package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(dataProvider="getData")
	public void beforeClass(String username,String password)
	{
		//selenium}
		System.out.println("before executing any methods in the class");
		System.out.println(username);
		System.out.println(password);
	}
	@Parameters({"URL","APIKey/usrname"})
	@Test(groups= {"smoke"})//we tied this to this test case
	public void webloginCaarloan(String urlname,String key)
	{
		//selenium}
		System.out.println("webloginloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod // before every method it delet catch and cokes and is to cleen
	public void Bfmethod()
	{
		//apim}
		System.out.println("I will execute befor every text methd in day 3 class");
	}
	@Test
	//this testcase is execute only after mobilsigninCarloan test executed eg after login
	public void mobilloginCarloan()
	{
		//apim}
		System.out.println("mobilcarloan");
	}
	
	@Test(enabled=false)//means skip this tesrt case
	public void mobilsigninCarloan()
	{
		//apim}
		System.out.println("mobilcarloansignin");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		//apim}
		System.out.println("I am no 1");
	}
	
	@Test(timeOut=4000)
	public void mobilsignoutCarloan()
	{
		//apim}
		System.out.println("mobilcarloansignout");
	}
	@DataProvider
	public Object[][] getData()
	{
		//apim}
		//1st combination-username passwoed
		//2nd-username password=no cridt history
		//3rd -fradelent credit history
		Object[][] data= new Object[3][2];//definign 3row and 2columen
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but value for that particular combination(row)
		
		//2nd set
		data[1][0]="firstusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="firstusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
	@AfterSuite
	public void AFRsuite()
	{
		//apim}
		System.out.println("I am no 1 from the last");
	}
	@Parameters({"URL"})
	@Test
	public void loginAPICarloan(String urlname)
	{
		//Eest api automation}
		System.out.println("reatapicarlona");
		System.out.println(urlname);
	}
	
	@AfterMethod
	public void afterevery()
	{
		//Eest api automation}
		System.out.println("I will execute after every test method in day 3 class");
	}
}

