package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}
		@Test
		public void test1()
		{
			driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1])]"));
		}
		@Test
		public void test2()
		{
			driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1])]"));
		}
	}


