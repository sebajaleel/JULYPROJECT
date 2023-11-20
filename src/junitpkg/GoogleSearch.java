package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void googlesearch()
	{
		driver.findElement(By.name("q")).sendKeys("lion",Keys.ENTER);
		driver.findElement(By.name("btnK")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
