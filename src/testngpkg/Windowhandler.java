package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver d;
	@BeforeTest
	public void beforeTest(){
		d = new EdgeDriver();
		
	}
	@Test
	public void test()
	{
		d.get("https://demo.guru99.com/popup.php");
		String parentWindow=d.getWindowHandle();
		System.out.println("parent window title"+d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindowhandles = d.getWindowHandles();
		for (String handle : allWindowhandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				d.switchTo().window(handle);
				d.close();
			}
			d.switchTo().window(parentWindow);
			}
		}
	}
	


