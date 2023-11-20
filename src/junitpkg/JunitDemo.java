package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}
	@Test
	public void test2()
	{
		String src=driver.getPageSource();
		if(src.contains("abc"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
