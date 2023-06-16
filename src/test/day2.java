package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"smoke"})
  public void ploan()
  {
	System.out.println("good");
	System.out.println("good2");
	System.out.println("good3");
  }

@BeforeTest  //it give high priority than other before executing other
public void prerequset()
{
	System.out.println("executed befor anything else");
}
}
