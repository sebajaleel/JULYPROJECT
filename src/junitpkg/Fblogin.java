package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

}
