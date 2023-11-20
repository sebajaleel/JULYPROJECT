package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbloginUsingExpath {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("seba@gmail.com");
	}
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("seba@123");
	}
	@Test
	public void test3()
	{
		driver.findElement(By.xpath("////button[@name='login']")).click();
	}


}
