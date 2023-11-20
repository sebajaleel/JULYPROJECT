package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("seba");
		
	}
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("luminar");
	}
	@Test
	public void test3()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("seba3@gmail.com");
	}
	@Test
	public void test4()
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("seba@1234");
	}
	@Test
	public void test5()
	{
		driver.findElement(By.xpath("//input[@id='password-confirm)")).sendKeys("seba@1234");
	}
	@Test
	public void test6()
	{
		driver.findElement(By.xpath("//button[@type='submit')")).click();
	}

}
