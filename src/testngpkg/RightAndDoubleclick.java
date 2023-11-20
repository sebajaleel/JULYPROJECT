package testngpkg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightAndDoubleclick {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	driver.switchTo().alert().accept();
	WebElement doubleclickleElement=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclickleElement).perform();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
	
		}
	
		

}
